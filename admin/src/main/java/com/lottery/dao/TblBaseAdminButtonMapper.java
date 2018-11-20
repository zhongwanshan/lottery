package com.lottery.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lottery.entity.TblBaseAdminButton;

@Mapper
public interface TblBaseAdminButtonMapper {
	// 根据条件查询最新10条数据
	public List<TblBaseAdminButton> searchAllBaseAdminButton();

	// 根据条件查询总页数
	public Integer searchTotallButtonNum(TblBaseAdminButton tblBaseAdminButton);

	// 添加角色
	public Integer addButton(TblBaseAdminButton tblBaseAdminButton);

	// 根据id查询角色信息
	public List<TblBaseAdminButton> queryButtonById(Integer id);

	// 根据id更新角色信息
	public Integer updateButtonData(TblBaseAdminButton tblBaseAdminButton);

	// 删除角色记录
	public Integer deleteButtonDataByIds(@Param("idList")List<Integer> idList);

}
