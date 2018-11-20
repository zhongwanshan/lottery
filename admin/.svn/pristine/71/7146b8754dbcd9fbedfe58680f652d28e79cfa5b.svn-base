package com.lottery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.BetFbLotteryPrizeMapper;
import com.lottery.entity.BetFbLotteryPrize;
@Service(value = "betFbLotteryPrizeService")
public class BetFbLotteryPrizeServiceImp implements BetFbLotteryPrizeService {
    
	@Autowired
	BetFbLotteryPrizeMapper betFbLotteryPrizeMapper;
	/**
	 * 查询10条记录
	 */
	@Override
	public List<BetFbLotteryPrize> searchBetFbLotteryPrizeByCondition(BetFbLotteryPrize betFbLotteryPrize) {
		
		return betFbLotteryPrizeMapper.searchBetFbLotteryPrizeByCondition(betFbLotteryPrize);
	}
    /**
     * 查询总记录
     */
	@Override
	public Integer searchBetFbLotteryPrizeCountByCondition(BetFbLotteryPrize betFbLotteryPrize) {
		// TODO Auto-generated method stub
		return betFbLotteryPrizeMapper.searchBetFbLotteryPrizeCountByCondition(betFbLotteryPrize);
	}
    /**
     * 查询前15条记录，根据num排序
     */
	@Override
	public List<BetFbLotteryPrize> searchBetFbLotteryByCondition(BetFbLotteryPrize betFbLotteryPrize) {
		// TODO Auto-generated method stub
		return betFbLotteryPrizeMapper.searchBetFbLotteryByCondition(betFbLotteryPrize);
	}
	/**
	 * g根据id查询
	 */
	@Override
	public BetFbLotteryPrize searchBetFbLotteryById(Integer id) {
		// TODO Auto-generated method stub
		return betFbLotteryPrizeMapper.selectByPrimaryKey(id);
	}
	@Override
	public Integer updateBetFbLotteryPrize(BetFbLotteryPrize betFbLotteryPrize) {
		// TODO Auto-generated method stub
		return betFbLotteryPrizeMapper.updateByPrimaryKeySelective(betFbLotteryPrize);
	}
	@Override
	public Integer addBetFbLotteryPrize(BetFbLotteryPrize betFbLotteryPrize) {
		// TODO Auto-generated method stub
		return betFbLotteryPrizeMapper.insertSelective(betFbLotteryPrize);
	}
	
	
	

}
