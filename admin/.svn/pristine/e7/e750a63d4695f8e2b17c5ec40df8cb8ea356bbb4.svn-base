package com.lottery.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.BaseAdminUser;
import com.lottery.service.BaseAdminUserService;
import com.lottery.util.DateFomatUtil;
import com.lottery.util.MD5Utils;

@Controller
@RequestMapping("/baseAdminUser")
public class BaseAdminUserController {

	@Autowired
	BaseAdminUserService baseAdminUserService;

	@RequestMapping("/baseAdminUserHome")
	public String homePath(Map<String, Object> mapValue) {
		// 查询默认按id排序的数据
		List<BaseAdminUser> BaseAdminUserList = baseAdminUserService.searchBaseAdminUserByCondition("", "", 2, 0);
		Integer totallNum = baseAdminUserService.searchTotallPageNum("", "", 2, 0);
		for (BaseAdminUser BaseAdminUser : BaseAdminUserList) {
			BaseAdminUser
					.setRegTimeTow(DateFomatUtil.formatDateTime(BaseAdminUser.getRegTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		// 查询总页数
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));

		mapValue.put("dataList", BaseAdminUserList);
		return "baseAdminUserHome";
	}

	@RequestMapping("/addBaseAdminUserPath")
	public String addMessagePath() {
		return "addBaseAdminUser";
	}

	@RequestMapping("/baseAdminUserDetailPath")
	public String baseAdminUserDetail(Map<String, Object> mapValue, Integer id) {
		BaseAdminUser baseAdminUser = baseAdminUserService.findSysUserById(id);
		baseAdminUser.setRegTimeTow(DateFomatUtil.formatDateTime(baseAdminUser.getRegTime(), "yyyy-MM-dd HH:mm:ss"));
		mapValue.put("dataList", baseAdminUser);
		return "baseAdminUserDetail";
	}

	/**
	 * 根据用户id跳转更新页面
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/updateBaseAdminUserPath")
	public String updateMessagePath(Integer id, Map<String, Object> mapValue) {
		BaseAdminUser baseAdminUser = baseAdminUserService.findSysUserById(id);
		baseAdminUser.setRegTimeTow(DateFomatUtil.formatDateTime(baseAdminUser.getRegTime()));
		mapValue.put("dataList", baseAdminUser);
		return "updateBaseAdminUser";
	}

	/**
	 * 更新用户信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/updateBaseAdminUser")
	@ResponseBody
	public String updateUserData(BaseAdminUser baseAdminUser) {
		if (baseAdminUser.getSysUserPwd() != null) {
			baseAdminUser.setSysUserPwd(MD5Utils.getMD5String(baseAdminUser.getSysUserPwd()));
		}
		return baseAdminUserService.updateUserData(baseAdminUser) > 0 ? "sucess" : "false";
	}

	/**
	 * 删除选中的记录
	 * 
	 * @param idList
	 * @return
	 */
	/*
	 * 
	 * @RequestMapping("/deleteBaseAdminUser") public String
	 * messageDetailPath(String idList){ String[] idString = idList.split(",");
	 * List<Integer> intList = new ArrayList<Integer>(); for (int i = 0; i <
	 * idString.length; i++) { intList.add(Integer.parseInt(idString[i])); } Integer
	 * deleteNum = baseAdminUserService.deleteUserDataByIds(intList); return
	 * "messageDetail"; }
	 * 
	 * @RequestMapping("/searchUserData") public String searchUserData(Map<String,
	 * Object> mapValue){ //查询默认按id排序的数据 List<TblBasePushMsg> tblBasePushMsgList
	 * =tblBasePushMsgService.searchMessagesByCondition("", 4, 4,0); Integer
	 * totallNum = tblBasePushMsgService.searchTotallPageNum("", 4, 4,0); //查询总页数
	 * mapValue.put("totallNum", totallNum/10); mapValue.put("dataList",
	 * tblBasePushMsgList); return "messageList"; }
	 *//**
		 * 根据条件查询用户信息
		 * 
		 * @param sysUserName
		 * @param sysUserCode
		 * @param userStatus
		 * @param pageNum
		 * @return
		 */
	@RequestMapping("/searchBaseAdminUser")
	@ResponseBody
	public Map searchMessages(String sysUserName, String sysUserCode, Integer userStatus, Integer pageNum) {
		Map dataMap = new HashMap<>();
		// 查询默认按id排序的数据
		List<BaseAdminUser> baseAdminUserList = baseAdminUserService.searchBaseAdminUserByCondition(sysUserName,
				sysUserCode, userStatus, pageNum);
		Integer totallNum = baseAdminUserService.searchTotallPageNum(sysUserName, sysUserCode, userStatus, pageNum);
		for (BaseAdminUser BaseAdminUser : baseAdminUserList) {
			BaseAdminUser
					.setRegTimeTow(DateFomatUtil.formatDateTime(BaseAdminUser.getRegTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		// 查询总页数
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));

		dataMap.put("dataList", baseAdminUserList);

		return dataMap;
	}

	/*
	 * 添加用户
	 * 
	 * @param sysUserName
	 * 
	 * @param sysUserPwd
	 * 
	 * @return
	 */
	@RequestMapping("/addBaseAdminUser")
	@ResponseBody
	public String addUser(BaseAdminUser baseAdminUser) {
		baseAdminUser.setSysUserPwd(MD5Utils.getMD5String(baseAdminUser.getSysUserPwd()));
		return baseAdminUserService.addUser(baseAdminUser) > 0 ? "sucess" : "false";
	}

}
