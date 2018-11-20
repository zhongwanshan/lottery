package com.lottery.service;

import java.util.List;

import com.lottery.entity.UserRechargeOrder;

public interface UserRechargeOrderService {
	
	//根据条件查询最新10条数据
	public List<UserRechargeOrder> searchUserRechargeOrderByCondition(UserRechargeOrder UserRechargeOrder);
		
	//查询总页数
	public Integer searchTotallPageNum(UserRechargeOrder UserRechargeOrder);
	
	//查询总页数
	public Integer saveUserRechargeOrder(UserRechargeOrder UserRechargeOrder);
	
	public UserRechargeOrder queryUserRechargeOrderById(Integer id);
	public Integer deleteUserRechargeOrderById(Integer id);
	public Integer updateUserRechargeOrder(UserRechargeOrder UserRechargeOrder);
	

}
