package com.lottery.service;

import java.util.List;

import com.lottery.entity.BetFbLotteryPrize;

public interface BetFbLotteryPrizeService {
	
	//根据条件查询最新15条数据
	public List<BetFbLotteryPrize> searchBetFbLotteryPrizeByCondition(BetFbLotteryPrize betFbLotteryPrize);
	
	//根据条件查询传统足球开奖信息总记录
	public Integer searchBetFbLotteryPrizeCountByCondition(BetFbLotteryPrize betFbLotteryPrize);
	
	//根据条件查询最新15条数据
	public List<BetFbLotteryPrize> searchBetFbLotteryByCondition(BetFbLotteryPrize betFbLotteryPrize);
	
	//根据id查询记录
	public BetFbLotteryPrize searchBetFbLotteryById(Integer id);
	
	//根据条件查询传统足球开奖信息总记录
	public Integer updateBetFbLotteryPrize(BetFbLotteryPrize betFbLotteryPrize);
	
	//根据条件查询传统足球开奖信息总记录
	public Integer addBetFbLotteryPrize(BetFbLotteryPrize betFbLotteryPrize);

}
