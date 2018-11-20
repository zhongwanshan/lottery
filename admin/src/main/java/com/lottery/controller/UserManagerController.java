package com.lottery.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.TblBaseAdminUser;
import com.lottery.entity.TblBasePushMsg;
import com.lottery.service.TblBaseAdminUserService;
import com.lottery.util.MD5Utils;

@Controller
@RequestMapping("/userManager")
public class UserManagerController {
	
	@Autowired
	TblBaseAdminUserService tblBaseAdminUserService;
	
	@RequestMapping("/userHome")
	public String homePath(Map<String, Object> mapValue){
		 //查询默认按id排序的数据
		 List<TblBaseAdminUser> tblBaseAdminUserList  =tblBaseAdminUserService.searchBaseAdminUserByCondition("", "", 2,0);
	     Integer totallNum = tblBaseAdminUserService.searchTotallPageNum("", "", 2,0);
	     //查询总页数
	      mapValue.put("totallNum", totallNum/10);
	      mapValue.put("dataList", tblBaseAdminUserList); 
	  return "userHome";
	}
	@RequestMapping("/addUserPath")
	public String addMessagePath(){
	  return "addUser";
	}
	/**
	 * 根据用户id跳转更新页面
	 * @param id
	 * @return
	 */
	@RequestMapping("/updateUserPath")
	public String updateMessagePath(Integer id,Map<String, Object> mapValue){
		TblBaseAdminUser tblBaseAdminUser =  tblBaseAdminUserService.findSysUserById(id);
		mapValue.put("tblBaseAdminUser", tblBaseAdminUser);
	  return "updateUser";
	}
	/**
	 * 更新用户信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/updateUserData")
	@ResponseBody
	public String updateUserData(String sysUserName,Integer userStatus,Integer id){
		
	System.out.println(tblBaseAdminUserService.updateUserData(sysUserName,userStatus,id)==1?"sucess":"false");
		
	  return tblBaseAdminUserService.updateUserData(sysUserName,userStatus,id)==1?"sucess":"false";
	}
	/**
	 * 删除选中的记录
	 * @param idList
	 * @return
	 */
	
	@RequestMapping("/deleteUserData")
	public String messageDetailPath(String idList){
		String[] idString = idList.split(",");
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < idString.length; i++) {
			intList.add(Integer.parseInt(idString[i]));
		}
	 Integer deleteNum =	tblBaseAdminUserService.deleteUserDataByIds(intList);
	  return "messageDetail";
	}
	
	/*@RequestMapping("/searchUserData")
	public String searchUserData(Map<String, Object> mapValue){
	  //查询默认按id排序的数据
     List<TblBasePushMsg> tblBasePushMsgList  =tblBasePushMsgService.searchMessagesByCondition("", 4, 4,0);
     Integer totallNum = tblBasePushMsgService.searchTotallPageNum("", 4, 4,0);
     //查询总页数
      mapValue.put("totallNum", totallNum/10);
      mapValue.put("dataList", tblBasePushMsgList); 		
	  return "messageList";
	}*/
    /**
     * 根据条件查询用户信息
     * @param sysUserName
     * @param sysUserCode
     * @param userStatus
     * @param pageNum
     * @return
     */
	@RequestMapping("/searchUserData")
	@ResponseBody
	public List<TblBaseAdminUser> searchMessages(String sysUserName ,String sysUserCode,Integer userStatus,Integer pageNum){
	  return tblBaseAdminUserService.searchBaseAdminUserByCondition(sysUserName, sysUserCode, userStatus, pageNum);
	}
	/**
	 * 添加用户
	 * @param sysUserName
	 * @param sysUserPwd
	 * @return
	 */
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(String sysUserName,String sysUserPwd){
		String MD5Pwd = MD5Utils.getMD5String(sysUserPwd);
	  return tblBaseAdminUserService.addUser(sysUserName,MD5Pwd)==1?"sucess":"false";
	}

}
