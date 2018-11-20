package com.lottery.service;

import java.util.List;

import com.lottery.entity.BetFbLotteryPrize;
import com.lottery.entity.LotteryOrderRoute;
import com.lottery.entity.LotteryOrderRouteShop;

public interface LotteryOrderRouteService {
	
	//根据条件查询分发规则最新10条数据
	public List<LotteryOrderRoute> searchLotteryOrderRouteByCondition(LotteryOrderRoute LotteryOrderRoute);
	
	//根据条件查询分发规则总记录
	public Integer searchLotteryOrderRouteCountByCondition(LotteryOrderRoute LotteryOrderRoute);

	//根据id查询记录
	public LotteryOrderRoute searchLotteryOrderRouteById(Integer id);
	
	//更新分发规则
	public Integer updateLotteryOrderRoute(LotteryOrderRoute LotteryOrderRoute);
	
	//更新分发规则
	public Integer saveLotteryOrderRoute(LotteryOrderRoute LotteryOrderRoute);
	
	//更新分发规则
	public Integer saveLotteryUser(Integer ruleId,String lotteryShopIds);
	
	//更新分发规则
    public List<LotteryOrderRouteShop> queryLotteryOrderRouteShopList(Integer id);
    
    
    
  //更新分发规则
  	public Integer changeLotteryOrderRouteStatus(LotteryOrderRoute LotteryOrderRoute);
  

}
