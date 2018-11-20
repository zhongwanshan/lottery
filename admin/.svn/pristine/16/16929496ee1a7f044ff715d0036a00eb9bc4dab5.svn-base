package com.lottery.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lottery.entity.TblBaseAdminRole;

@Mapper
public interface TblBaseAdminRoleMapper {
	// 根据条件查询最新10条数据
	public List<TblBaseAdminRole> searchBaseAdminRoleByCondition(TblBaseAdminRole tblBaseAdminRole);

	// 根据条件查询总页数
	public Integer searchTotallPageNum(TblBaseAdminRole tblBaseAdminRole);

	// 添加角色
	public Integer addRole(TblBaseAdminRole tblBaseAdminRole);

	// 根据id查询角色信息
	public List<TblBaseAdminRole> findSysRoleById(Integer id);

	// 根据id更新角色信息
	public Integer updateRoleData(TblBaseAdminRole tblBaseAdminRole);

	// 删除角色记录
	public Integer deleteRoleDataByIds(@Param("idList")List<Integer> idList);

}
