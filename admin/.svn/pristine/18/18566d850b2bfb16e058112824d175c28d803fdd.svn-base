package com.lottery.service;

import java.util.List;

import com.lottery.entity.TblBaseAdminUser;

public interface TblBaseAdminUserService {

	// 根据条件查询最新10条数据
	public List<TblBaseAdminUser> searchBaseAdminUserByCondition(String sysUserName, String sysUserCode,
			Integer userStatus, Integer pageNum);

	// 查询总页数
	public Integer searchTotallPageNum(String sysUserName, String sysUserCode, Integer userStatus, Integer pageNum);

	// 添加用户
	public Integer addUser(String sysUserName,String sysUserPwd);
	// 根据id查询记录
	public TblBaseAdminUser findSysUserById(Integer id);
	// 根据id更新用户信息
   public Integer updateUserData(String sysUserName,Integer userStatus,Integer id);
   // 根据id更新用户信息
   public Integer deleteUserDataByIds(List<Integer> idList);
   
   // 根据id更新用户信息
   public TblBaseAdminUser login(TblBaseAdminUser tblBaseAdminUser);

}
