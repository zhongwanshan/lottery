package com.lottery.service;

import java.util.List;

import com.lottery.entity.BetFbLotteryPrize;
import com.lottery.entity.LotteryIssue;

public interface LotteryIssueService {
	
	//根据条件查询数字彩期数最新10条数据
	public List<LotteryIssue> searchLotteryIssueByCondition(LotteryIssue lotteryIssue);
	
	//根据条件查询数字彩期数总记录
	public Integer searchLotteryIssueCountByCondition(LotteryIssue lotteryIssue);

	//根据id查询记录
	public LotteryIssue searchLotteryIssueById(Integer id);
	
	//更新数字彩期数
	public Integer updateLotteryIssue(LotteryIssue lotteryIssue);
	
	//更新数字彩期数
	public Integer saveLotteryIssue(LotteryIssue lotteryIssue);

}
