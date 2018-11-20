package com.lottery.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lottery.entity.TblBaseAdminUser;
@Mapper
public interface TblBaseAdminUserMapper {
	//根据条件查询最新10条数据
	 public List<TblBaseAdminUser> searchBaseAdminUseByCondition(TblBaseAdminUser tblBaseAdminUser);
	 
		//根据条件查询总页数
	  public Integer searchTotallPageNum(TblBaseAdminUser tblBaseAdminUser);
	  //添加用户
	  public  Integer  addUser(TblBaseAdminUser tblBaseAdminUser);
	  
	  //根据id查询用户信息
	  public  List<TblBaseAdminUser>  findSysUserById(Integer id);
	 //根据id更新用户信息
	  public  Integer  updateUserData(TblBaseAdminUser tblBaseAdminUser);
	  //删除用户记录
	  public Integer deleteUserDataByIds(@Param("idList")List<Integer> idList);
	  
	//根据id查询用户信息
	  public  List<TblBaseAdminUser>  login(TblBaseAdminUser tblBaseAdminUser);
	    


		
}
