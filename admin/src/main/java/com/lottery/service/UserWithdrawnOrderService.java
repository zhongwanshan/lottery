package com.lottery.service;

import java.util.List;

import com.lottery.entity.BaseBankInfo;
import com.lottery.entity.UserWithdrawnOrder;

public interface UserWithdrawnOrderService {
	
	//根据条件查询最新10条数据
	public List<UserWithdrawnOrder> searchUserWithdrawnOrderByCondition(UserWithdrawnOrder userWithdrawnOrder);
		
	//查询总页数
	public Integer searchTotallPageNum(UserWithdrawnOrder userWithdrawnOrder);
	
	//查询总页数
	public Integer saveUserWithdrawnOrder(UserWithdrawnOrder userWithdrawnOrder);
	
	public UserWithdrawnOrder queryUserWithdrawnOrderById(Integer id);
	public Integer deleteUserWithdrawnOrderById(Integer id);
	
	
	public Integer updateUserWithdrawnOrder(UserWithdrawnOrder userWithdrawnOrder);
	
    //查询银行信息
	public List<BaseBankInfo> queryBaseBankInfo(BaseBankInfo baseBankInfo);
	
    
    //根据id更新记录
    public Integer updateUserWithdrawnOrderById(UserWithdrawnOrder userWithdrawnOrder);
	
	

	

}
