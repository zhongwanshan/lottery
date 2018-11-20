package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.LotteryIssueMapper;
import com.lottery.entity.LotteryIssue;
import com.lottery.service.LotteryIssueService;
@Service(value ="lotteryIssueService")
public class LotteryIssueServiceImp implements LotteryIssueService {
    @Autowired
	LotteryIssueMapper lotteryIssueMapper;
	@Override
	public List<LotteryIssue> searchLotteryIssueByCondition(LotteryIssue lotteryIssue) {
		 
		return lotteryIssueMapper.searchLotteryIssueByCondition(lotteryIssue);
	}

	@Override
	public Integer searchLotteryIssueCountByCondition(LotteryIssue lotteryIssue) {
		// TODO Auto-generated method stub
		return lotteryIssueMapper.searchLotteryIssueCountByCondition(lotteryIssue);
	}

	@Override
	public LotteryIssue searchLotteryIssueById(Integer id) {
		// TODO Auto-generated method stub
		return lotteryIssueMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateLotteryIssue(LotteryIssue lotteryIssue) {
		// TODO Auto-generated method stub
		return lotteryIssueMapper.updateByPrimaryKeySelective(lotteryIssue);
	}

	@Override
	public Integer saveLotteryIssue(LotteryIssue lotteryIssue) {
		// TODO Auto-generated method stub
		return null;
	}

}
