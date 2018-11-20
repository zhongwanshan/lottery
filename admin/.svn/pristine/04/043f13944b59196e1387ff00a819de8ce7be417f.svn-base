package com.lottery.service;

import java.util.List;

import com.lottery.entity.LotteryMainOrder;
import com.lottery.entity.LotteryType;

public interface LotteryMainOrderService {
	
	//根据条件查询最新10条数据
	public List<LotteryMainOrder> searchLotteryMainOrderByCondition(LotteryMainOrder  lotteryMainOrder);
		
	//查询总页数
	public Integer searchTotallPageNum(LotteryMainOrder  lotteryMainOrder);
	
	//根据条件查询最新10条数据
	public List<LotteryType> searchAllLotteryType(LotteryType  LotteryType);
	
	public LotteryMainOrder searchLotteryMainById(Integer  id);
	
	//根据条件统计订单的数量
	public List<LotteryMainOrder> orderStatisticsByCondition(LotteryMainOrder  lotteryMainOrde);
	//根据条件统计订单的总数
	public Integer orderStatisticsByConditionCount(LotteryMainOrder  lotteryMainOrde);
	
	
	//根据条件统计用户流水
	public List<LotteryMainOrder> orderUserFlowStatisticsByCondition(LotteryMainOrder  lotteryMainOrde);
	//根据条件统计用户流水的总数
	public Integer orderUserFlowStatisticsByConditionCount(LotteryMainOrder  lotteryMainOrde);
		
	//根据条件统计彩票店户流水
	public List<LotteryMainOrder> ordeLotteryShopFlowStatisticsByCondition(LotteryMainOrder  lotteryMainOrde);
	//根据条件统计彩票店流水的总数
	public Integer orderLotteryShopFlowStatisticsByConditionCount(LotteryMainOrder  lotteryMainOrde);
	
	//根据条件统计平台户流水
	public List<LotteryMainOrder> ordePlatformFlowStatisticsByCondition(LotteryMainOrder  lotteryMainOrde);
	//根据条件统计平台流水的总数
	public Integer orderPlatformFlowStatisticsByConditionCount(LotteryMainOrder  lotteryMainOrde);
	
	
	//查询总页数
	public Integer updateLotteryMainOrder(LotteryMainOrder  lotteryMainOrder);
	
	//查询总页数
	public Integer searchTodayOrderCount();
	
	//查询总页数
	public Integer searchTodayPayOrderCount();
	
	
	

	

}
