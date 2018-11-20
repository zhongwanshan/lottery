package com.lottery.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lottery.entity.TblBaseAdminMenu;

@Mapper
public interface TblBaseAdminMenuMapper {
	public Integer addMenu(TblBaseAdminMenu tblBaseAdminMenu);
	public List<TblBaseAdminMenu> queryMenuById(Integer id);
	public List<TblBaseAdminMenu> queryAllMenuDatas();
	
	
	public Integer  deleteMenuDataByIds(@Param("idList")List<Integer> idList);
	
	

}
