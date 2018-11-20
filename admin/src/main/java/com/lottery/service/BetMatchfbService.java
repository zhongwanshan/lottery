package com.lottery.service;

import java.util.List;

import com.lottery.entity.BetMatchfb;

public interface BetMatchfbService {
	
	//根据条件查询竞彩足球赛程赔率最新10条数据
	public List<BetMatchfb> searchBetMatchfbByCondition(BetMatchfb betMatchfb);
	
	//根据条件查询竞彩足球赛程赔率总记录
	public Integer searchBetMatchfbCountByCondition(BetMatchfb betMatchfb);

	//根据id查询记录
	public BetMatchfb searchBetMatchfbById(Integer id);
	
	//更新竞彩足球赛程赔率
	public Integer updateBetMatchfb(BetMatchfb betMatchfb);
	
	//更新竞彩足球赛程赔率
	public Integer saveBetMatchfb(BetMatchfb betMatchfb);

}
