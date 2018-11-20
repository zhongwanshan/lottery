package com.lottery.serviceImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lottery.dao.BetMatchfbMapper;
import com.lottery.entity.BetMatchfb;
import com.lottery.service.BetMatchfbService;
@Service(value ="betMatchfbService")
public class BetMatchfbServiceImp implements BetMatchfbService {
	@Autowired
	BetMatchfbMapper betMatchfbMapper;

	@Override
	public List<BetMatchfb> searchBetMatchfbByCondition(BetMatchfb betMatchfb) {
		// TODO Auto-generated method stub
		return betMatchfbMapper.searchBetMatchfbByCondition(betMatchfb);
	}

	@Override
	public Integer searchBetMatchfbCountByCondition(BetMatchfb betMatchfb) {
		// TODO Auto-generated method stub
		return betMatchfbMapper.searchBetMatchfbCountByCondition(betMatchfb);
	}

	@Override
	public BetMatchfb searchBetMatchfbById(Integer id) {
		// TODO Auto-generated method stub
		return betMatchfbMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateBetMatchfb(BetMatchfb betMatchfb) {
		// TODO Auto-generated method stub
		return betMatchfbMapper.updateByPrimaryKeySelective(betMatchfb);
	}

	@Override
	public Integer saveBetMatchfb(BetMatchfb betMatchfb) {
		// TODO Auto-generated method stub
		return null;
	}

}
