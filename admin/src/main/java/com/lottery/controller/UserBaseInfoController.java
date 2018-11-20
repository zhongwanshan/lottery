package com.lottery.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lottery.entity.BaseProvince;
import com.lottery.entity.UserBaseInfo;
import com.lottery.service.BaseAddressService;
import com.lottery.service.UserBaseInfoService;
import com.lottery.util.MD5Utils;
import com.mysql.fabric.xmlrpc.base.Data;

import ch.qos.logback.core.util.FileUtil;

@Controller
@RequestMapping("/userBaseInfo")
public class UserBaseInfoController {

	@Autowired
	UserBaseInfoService userBaseInfoService;
	@Autowired
	BaseAddressService baseAddressService;
    //查询用户信息，跳转到主页面
	@RequestMapping("/userHome")
	public String homePath(Map<String, Object> mapValue) {
		// 查询默认按id排序的数据
		UserBaseInfo userBaseInfo = new UserBaseInfo();
		userBaseInfo.setPageNum(0);
		userBaseInfo.setUserType(Short.valueOf("4"));
		userBaseInfo.setStatus(Short.valueOf("0"));
		List<UserBaseInfo> userBaseInfoList = userBaseInfoService.searchUserBaseInfoByCondition(userBaseInfo);
		for (UserBaseInfo userBaseInfo2 : userBaseInfoList) {
			if(userBaseInfo2.getTotalMoney()!=null) {
			userBaseInfo2.setTotalMoneyTow((float)(userBaseInfo2.getTotalMoney()/100.0));
			}
			if(userBaseInfo2.getCashMoneyLeft()!=null) {
			userBaseInfo2.setCashMoneyLeftTow((float)(userBaseInfo2.getCashMoneyLeft()/100.0));
			}
			if(userBaseInfo2.getGiftMoneyLeft()!=null) {
			userBaseInfo2.setGiftMoneyLeftTow((float)(userBaseInfo2.getGiftMoneyLeft()/100.0));
			}
			
			if(userBaseInfo2.getLockedMoney()!=null) {
			userBaseInfo2.setLockedMoneyTow((float)(userBaseInfo2.getLockedMoney()/100.0));
			}
			
		}
		Integer totallNum = userBaseInfoService.searchUserBaseInfoCountByCondition(userBaseInfo);
		String totallNumTOW =String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum",totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0")?"1":totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", userBaseInfoList);
		return "userBaseInfoHome";
	}
    /**
     * 查询用户基本信息
     * @param userBaseInfo
     * @return
     */
	
	@RequestMapping("/queryUserBaseInfoListByCondition")
	@ResponseBody
	public Map queryUserBaseInfoListByCondition(UserBaseInfo userBaseInfo) {
		Map dataMap = new HashMap<>();
		List<UserBaseInfo> userBaseInfoList = userBaseInfoService.searchUserBaseInfoByCondition(userBaseInfo);
		for (UserBaseInfo userBaseInfo2 : userBaseInfoList) {
			if(userBaseInfo2.getTotalMoney()!=null) {
			userBaseInfo2.setTotalMoneyTow((float)(userBaseInfo2.getTotalMoney()/100.0));
			}
			if(userBaseInfo2.getCashMoneyLeft()!=null) {
			userBaseInfo2.setCashMoneyLeftTow((float)(userBaseInfo2.getCashMoneyLeft()/100.0));
			}
			if(userBaseInfo2.getGiftMoneyLeft()!=null) {
			userBaseInfo2.setGiftMoneyLeftTow((float)(userBaseInfo2.getGiftMoneyLeft()/100.0));
			}			
			if(userBaseInfo2.getLockedMoney()!=null) {
			userBaseInfo2.setLockedMoneyTow((float)(userBaseInfo2.getLockedMoney()/100.0));
			}
		}
		Integer totallNum = userBaseInfoService.searchUserBaseInfoCountByCondition(userBaseInfo);
		String totallNumTOW =String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum",totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0")?"1":totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", userBaseInfoList);
		return dataMap;
	}
	
	/**
	 * 查询省份
	 * @return
	 */
	@RequestMapping("/queryBaseProvince")
	@ResponseBody
	public List<BaseProvince> queryBaseProvince() {
		 
		return baseAddressService.querAllProvince();
	}
	
	/**
	 * 查询城市
	 * @return
	 */
	@RequestMapping("/queryBaseCity")
	@ResponseBody
	public Map queryBaseCity(Integer provinceId) {
		Map dataMap = new HashMap<>();	
		dataMap.put("dataList", baseAddressService.querAllCityById(provinceId));
		
		return dataMap;
	}
	
	
	/**
	 * 查询区县
	 * @return
	 */
	@RequestMapping("/queryBaseDistrict")
	@ResponseBody
	public Map queryBaseDistrict(Integer cityId) {
		Map dataMap = new HashMap<>();	
		dataMap.put("dataList", baseAddressService.querAllDistrictById(cityId));
		return dataMap;
	}
	
	
	/**
	 * 跳转都新增页面
	 * @return
	 */
	@RequestMapping("/addUserBaseInfoPath")
	public String AddUserBaseInfo(Map<String, Object> mapValue) {
		mapValue.put("dataList", baseAddressService.querAllProvince());

	return "addUserBaseInfo";
	}
	

	/**
	 * 保存新增用户信息
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/addUserBaseInfo")
	@ResponseBody
	public String addUserBaseInfo(HttpServletRequest request,@RequestParam("file") MultipartFile  file,UserBaseInfo userBaseInfo) throws IOException {
	//存储文件到指定文件夹
	String fileName =new Date().getTime()+file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
	String picturePath = request.getServletContext().getRealPath("/picture/");
	File fileOne = new File(picturePath);
	if (!fileOne.exists()) {
		fileOne.mkdirs();
	}
	File fileTow  = new File(picturePath+fileName);
	if (!fileTow.exists()) {
		fileTow.createNewFile();
	}
	OutputStream os =new  FileOutputStream(fileTow);
	IOUtils.copy(file.getInputStream(), os);
	userBaseInfo.setHeadImageUrl("/lottery/picture/"+fileName);
	userBaseInfo.setTotalMoney(0);
	userBaseInfo.setNotifyFee(0);
	if (userBaseInfo.getPwd()!=null&&userBaseInfo.getPwd()!="") {
		userBaseInfo.setPwd(MD5Utils.getMD5String(userBaseInfo.getPwd()));		
	}
	return userBaseInfoService.saveUserBaseInfo(userBaseInfo)==1?"sucess":"false";
	}
    /**
     * 跟新用户基本信息
     * @param userBaseInfo
     * @return
     */
	
	@RequestMapping("/updateUserBaseInfoPath")
	public String updateUserBaseInfoPath(Integer id,Map<String, Object> mapValue) {
		UserBaseInfo userBaseInfoList = userBaseInfoService.queryUserBaseInfoById(id);
		mapValue.put("dataList", userBaseInfoList);
		mapValue.put("allProvince", baseAddressService.querAllProvince());
		
		return "updateUserBaseInfo";
	}
	
    /**
     * 跟新用户基本信息
     * @param userBaseInfo
     * @return
     */
	@RequestMapping("/updateUserBaseInfo")
	@ResponseBody
	public String updateUserBaseInfo(HttpServletRequest request,@RequestParam("file") MultipartFile  file,UserBaseInfo userBaseInfo) throws IOException {
	//存储文件到指定文件夹
	String fileName =new Date().getTime()+file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
	String picturePath = request.getServletContext().getRealPath("/picture/");
	File fileOne = new File(picturePath);
	if (!fileOne.exists()) {
		fileOne.mkdirs();
	}
	File fileTow  = new File(picturePath+fileName);
	if (!fileTow.exists()) {
		fileTow.createNewFile();
	}
	OutputStream os =new  FileOutputStream(fileTow);
	IOUtils.copy(file.getInputStream(), os);
	userBaseInfo.setHeadImageUrl("/lottery/picture/"+fileName);
	if (userBaseInfo.getPwd()!=null&&userBaseInfo.getPwd()!="") {
		userBaseInfo.setPwd(MD5Utils.getMD5String(userBaseInfo.getPwd()));		
	}
	return userBaseInfoService.updateUserBase(userBaseInfo)==1?"sucess":"false";
	}
	
	
	
	
	 /**
     * 跟新用户基本信息
     * @param userBaseInfo
     * @return
     */
	@RequestMapping("/updateUserBaseInfoWithOutFile")
	@ResponseBody
	public String updateUserBaseInfoWithOutFile(UserBaseInfo userBaseInfo) throws IOException {
		if (userBaseInfo.getPwd()!=null&&userBaseInfo.getPwd()!="") {
			userBaseInfo.setPwd(MD5Utils.getMD5String(userBaseInfo.getPwd()));		
		}
	return userBaseInfoService.updateUserBase(userBaseInfo)==1?"sucess":"false";
	}
	
	
	
	
    /**
     * 查看用户基本信息
     * @param userBaseInfo
     * @return
     */
	
	@RequestMapping("/userBaseInfoDetailPath")
	public String userBaseInfoDetailPath(Integer id,Map<String, Object> mapValue) {
		UserBaseInfo userBaseInfoList = userBaseInfoService.queryUserBaseInfoById(id);
		mapValue.put("dataList", userBaseInfoList);
		return "userBaseInfoDetail";
	}
	 /**
     * 跟新用户基本信息
     * @param userBaseInfo
     * @return
     */
	@RequestMapping("/changeUserBaseInfoStatus")
	@ResponseBody
	public String changeUserBaseInfoStatus(UserBaseInfo userBaseInfo) throws IOException {
	return userBaseInfoService.updateUserBase(userBaseInfo)==1?"sucess":"false";
	}
	
	 /**
     * 安全设置主页
     * @param userBaseInfo
     * @return
     */
	
	@RequestMapping("/userBaseInfoSaveSetting")
	public String userBaseInfoSaveSetting(Integer id,Map<String, Object> mapValue) {
		UserBaseInfo userBaseInfoList = userBaseInfoService.queryUserBaseInfoById(id);
		mapValue.put("dataList", userBaseInfoList);
		return "userBaseInfoSaveSetting";
	}
	
	
	 /**
    * 修改登录密码
    * @param userBaseInfo
    * @return
    */
	
	@RequestMapping("/updateUserBaseInfoPwdPath")
	public String updateUserBaseInfoPwd(Integer id,Map<String, Object> mapValue) {
		mapValue.put("id", id);
		return "updateUserBaseInfoPwd";
	}
	
}
