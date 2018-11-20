package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.BetMatchbkMapper;
import com.lottery.entity.BetMatchbk;
import com.lottery.service.BetMatchbkService;
@Service(value ="betMatchbkService")
public class BetMatchbkServiceImp implements BetMatchbkService {
	
	@Autowired
	BetMatchbkMapper betMatchbkMapper;

	@Override
	public List<BetMatchbk> searchBetMatchbkByCondition(BetMatchbk betMatchbk) {
		// TODO Auto-generated method stub
		return betMatchbkMapper.searchBetMatchbkByCondition(betMatchbk);
	}

	@Override
	public Integer searchBetMatchbkCountByCondition(BetMatchbk betMatchbk) {
		// TODO Auto-generated method stub
		return betMatchbkMapper.searchBetMatchbkCountByCondition(betMatchbk);
	}

	@Override
	public BetMatchbk searchBetMatchbkById(Integer id) {
		// TODO Auto-generated method stub
		return betMatchbkMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateBetMatchbk(BetMatchbk betMatchbk) {
		// TODO Auto-generated method stub
		return betMatchbkMapper.updateByPrimaryKeySelective(betMatchbk);
	}

	@Override
	public Integer saveBetMatchbk(BetMatchbk betMatchbk) {
		// TODO Auto-generated method stub
		return null;
	}

}
