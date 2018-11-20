package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.TblBaseAdminRoleMapper;
import com.lottery.entity.TblBaseAdminRole;
import com.lottery.service.TblBaseAdminRoleService;
import com.lottery.util.ConstantUtil;
@Service(value ="tblBaseAdminRoleService")
public class TblBaseAdminRoleServiceImp implements TblBaseAdminRoleService {
	
	@Autowired
	TblBaseAdminRoleMapper tblBaseAdminRoleMapper;

	//根据分页查询用户信息
	@Override
	public List<TblBaseAdminRole> searchBaseAdminRoleByCondition(String sysRoleName,Integer RoleStatus,Integer pageNum) {
		TblBaseAdminRole tblBaseAdminRole = new TblBaseAdminRole();
		tblBaseAdminRole.setRoleName(sysRoleName);
		tblBaseAdminRole.setRoleStatus(RoleStatus);
		if (pageNum!=null) {
			tblBaseAdminRole.setPageNum(pageNum*ConstantUtil.messagePageSize);
		}
		List<TblBaseAdminRole> tblBasePushMsgList = tblBaseAdminRoleMapper.searchBaseAdminRoleByCondition(tblBaseAdminRole);
		return tblBasePushMsgList;
	}
    //根据分页查询总记录数目
	@Override
	public Integer searchTotallPageNum(String sysRoleName ,Integer RoleStatus,Integer pageNum) {
		TblBaseAdminRole tblBaseAdminRole = new TblBaseAdminRole();
		tblBaseAdminRole.setRoleName(sysRoleName);
		tblBaseAdminRole.setRoleStatus(RoleStatus);
		tblBaseAdminRole.setRoleStatus(RoleStatus);
		return tblBaseAdminRoleMapper.searchTotallPageNum(tblBaseAdminRole);
	}
	//添加新用户
	@Override
	public Integer addRole(String roleName,String roleDesc,String roleStatus) {
		TblBaseAdminRole tblBaseAdminRole = new TblBaseAdminRole();
		tblBaseAdminRole.setRoleName(roleName);
		tblBaseAdminRole.setRoleDesc(roleDesc);
		tblBaseAdminRole.setRoleStatus(Integer.parseInt(roleStatus));
		Integer tblBaseAdminRoleBack = tblBaseAdminRoleMapper.addRole(tblBaseAdminRole);
	
		return tblBaseAdminRoleBack;
	}
	//根据id查询用户信息
	@Override
	public TblBaseAdminRole findSysRoleById(Integer id) {
		  
		return tblBaseAdminRoleMapper.findSysRoleById(id).get(0);
	}
	//根据用户id更新用户信息
	@Override
	public Integer updateRoleData(String roleName,String roleDesc,Integer roleStatus,Integer id) {
		TblBaseAdminRole tblBaseAdminRole = new TblBaseAdminRole();
		tblBaseAdminRole.setId(id);
		tblBaseAdminRole.setRoleName(roleName);
		tblBaseAdminRole.setRoleDesc(roleDesc);
		tblBaseAdminRole.setRoleStatus(roleStatus);
		return tblBaseAdminRoleMapper.updateRoleData(tblBaseAdminRole);
	}
	//根据集合删除用户记录
	@Override
	public Integer deleteRoleDataByIds(List<Integer> idList) {
		tblBaseAdminRoleMapper.deleteRoleDataByIds(idList);
		return null;
	}

}
