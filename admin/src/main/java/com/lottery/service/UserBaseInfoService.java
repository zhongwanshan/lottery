package com.lottery.service;

import java.util.List;

import com.lottery.entity.TblBaseAdminUser;
import com.lottery.entity.UserBaseInfo;

public interface UserBaseInfoService {

	// 根据条件查询最新10条数据
	public List<UserBaseInfo> searchUserBaseInfoByCondition(UserBaseInfo userBaseInfo);
	// 根据条件查询最新10条数据
	public Integer searchUserBaseInfoCountByCondition(UserBaseInfo userBaseInfo);
	
	// 保存新增的记录
	public Integer saveUserBaseInfo(UserBaseInfo userBaseInfo);
	
	//根据id查询记录
	public UserBaseInfo queryUserBaseInfoById(Integer id);
	public Integer updateUserBase(UserBaseInfo userBaseInfo);
	
	public UserBaseInfo queryUserData(UserBaseInfo userBaseInfo);
	
	//查询彩票店主
	public List<UserBaseInfo> searchLotteryShopUserByCondition();
	
	//查询彩票店主
	public List<UserBaseInfo> searchLotteryShopUserByConditionLimit(UserBaseInfo userBaseInfo);
	
	//查询彩票店主总数量
	public Integer searchLotteryShopUserCountByConditionLimit(UserBaseInfo userBaseInfo);
	
	//查询彩票店主ids
	public List<UserBaseInfo> searchLotteryShopUserByConditionLimitIds(UserBaseInfo userBaseInfo);
		
		//查询彩票店主总数量
    public Integer searchLotteryShopUserCountByConditionLimitIds(UserBaseInfo userBaseInfo);
	


}
