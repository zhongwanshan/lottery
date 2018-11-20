package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.BetFbLotteryMapper;
import com.lottery.entity.BetFbLottery;
import com.lottery.service.BetFbLotteryService;
@Service(value ="betFbLotteryService")
public class BetFbLotteryServiceImp implements BetFbLotteryService {
	
	@Autowired
	BetFbLotteryMapper betFbLotteryMapper;
     
	@Override
	public List<BetFbLottery> searchBetFbLotteryByCondition(BetFbLottery betFbLottery) {
		// TODO Auto-generated method stub
		return betFbLotteryMapper.searchBetFbLotteryByCondition(betFbLottery);
	}

	@Override
	public Integer searchBetFbLotteryCountByCondition(BetFbLottery betFbLottery) {
		// TODO Auto-generated method stub
		return betFbLotteryMapper.searchBetFbLotteryCountByCondition(betFbLottery);
	}

	@Override
	public BetFbLottery searchBetFbLotteryById(Integer id) {
		// TODO Auto-generated method stub
		return betFbLotteryMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateBetFbLottery(BetFbLottery betFbLottery) {
		// TODO Auto-generated method stub
		return betFbLotteryMapper.updateByPrimaryKeySelective(betFbLottery);
	}

	@Override
	public Integer saveBetFbLottery(BetFbLottery betFbLottery) {
		// TODO Auto-generated method stub
		return null;
	}

}
