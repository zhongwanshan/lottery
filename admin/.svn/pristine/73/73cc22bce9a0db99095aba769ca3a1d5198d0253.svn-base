package com.lottery.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.TblBaseAdminRole;
import com.lottery.service.TblBaseAdminRoleService;
import com.lottery.util.MD5Utils;

@Controller
@RequestMapping("/roleManager")
public class RoleManagerController {
	
	@Autowired
	TblBaseAdminRoleService tblBaseAdminRoleService;
	
	@RequestMapping("/roleHome")
	public String homePath(Map<String, Object> mapValue){
		 //查询默认按id排序的数据
		 List<TblBaseAdminRole> tblBaseAdminRoleList  =tblBaseAdminRoleService.searchBaseAdminRoleByCondition("", 2,0);
	     Integer totallNum = tblBaseAdminRoleService.searchTotallPageNum("", 2,0);
	     //查询总页数
	      mapValue.put("totallNum", totallNum/10);
	      mapValue.put("dataList", tblBaseAdminRoleList); 
	  return "roleHome";
	}
	@RequestMapping("/addRolePath")
	public String addMessagePath(){
	  return "addRole";
	}
	/**
	 * 根据角色id跳转更新页面
	 * @param id
	 * @return
	 */
	@RequestMapping("/updateRolePath")
	public String updateMessagePath(Integer id,Map<String, Object> mapValue){
		TblBaseAdminRole tblBaseAdminRole =  tblBaseAdminRoleService.findSysRoleById(id);
		mapValue.put("tblBaseAdminRole", tblBaseAdminRole);
	  return "updateRole";
	}
	/**
	 * 更新角色信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/updateRoleData")
	@ResponseBody
	public String updateRoleData(String roleName,String roleDesc,Integer roleStatus,Integer id){	
		System.out.println("");
	  return tblBaseAdminRoleService.updateRoleData(roleName,roleDesc,roleStatus,id)==1?"sucess":"false";
	}
	/**
	 * 删除选中的记录
	 * @param idList
	 * @return
	 */
	
	@RequestMapping("/deleteRoleData")
	public String messageDetailPath(String idList){
		String[] idString = idList.split(",");
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < idString.length; i++) {
			intList.add(Integer.parseInt(idString[i]));
		}
	 Integer deleteNum =tblBaseAdminRoleService.deleteRoleDataByIds(intList);
	  return "messageDetail";
	}
	
	/*@RequestMapping("/searchRoleData")
	public String searchRoleData(Map<String, Object> mapValue){
	  //查询默认按id排序的数据
     List<TblBasePushMsg> tblBasePushMsgList  =tblBasePushMsgService.searchMessagesByCondition("", 4, 4,0);
     Integer totallNum = tblBasePushMsgService.searchTotallPageNum("", 4, 4,0);
     //查询总页数
      mapValue.put("totallNum", totallNum/10);
      mapValue.put("dataList", tblBasePushMsgList); 		
	  return "messageList";
	}*/
    /**
     * 根据条件查询角色信息
     * @param sysRoleName
     * @param sysRoleCode
     * @param RoleStatus
     * @param pageNum
     * @return
     */
	@RequestMapping("/searchRoleData")
	@ResponseBody
	public List<TblBaseAdminRole> searchRoleData(String roleName ,Integer RoleStatus,Integer pageNum){
	  return tblBaseAdminRoleService.searchBaseAdminRoleByCondition(roleName, RoleStatus, pageNum);
	}
	//添加role
	@RequestMapping("/addRole")
	@ResponseBody
	public String addRole(String roleName,String roleDesc,String roleStatus){
	  return tblBaseAdminRoleService.addRole(roleName,roleDesc,roleStatus)==1?"sucess":"false";
	}
	

}
