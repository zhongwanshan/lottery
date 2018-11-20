package com.lottery.service;

import java.util.List;

import com.lottery.entity.TblBaseAdminRole;

public interface TblBaseAdminRoleService {

	// 根据条件查询最新10条数据
	public List<TblBaseAdminRole> searchBaseAdminRoleByCondition(String sysRoleName,
			Integer RoleStatus, Integer pageNum);

	// 查询总页数
	public Integer searchTotallPageNum(String sysRoleName, Integer RoleStatus, Integer pageNum);

	// 添加用户
	public Integer addRole(String roleName,String roleDesc,String roleStatus);
	// 根据id查询记录
	public TblBaseAdminRole findSysRoleById(Integer id);
	// 根据id更新用户信息
   public Integer updateRoleData(String roleName,String roleDesc,Integer roleStatus,Integer id);
   // 根据id更新用户信息
   public Integer deleteRoleDataByIds(List<Integer> idList);

}
