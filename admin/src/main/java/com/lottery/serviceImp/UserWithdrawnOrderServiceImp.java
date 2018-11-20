package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.BaseBankInfoMapper;
import com.lottery.dao.UserWithdrawnOrderMapper;
import com.lottery.entity.BaseBankInfo;
import com.lottery.entity.UserWithdrawnOrder;
import com.lottery.service.UserWithdrawnOrderService;
@Service(value ="userWithdrawnOrderService")
public class UserWithdrawnOrderServiceImp implements UserWithdrawnOrderService {
	@Autowired
	BaseBankInfoMapper baseBankInfoMapper;
	@Autowired
	UserWithdrawnOrderMapper userWithdrawnOrderMapper;
    //根据条件分页查询数据
	@Override
	public List<UserWithdrawnOrder> searchUserWithdrawnOrderByCondition(UserWithdrawnOrder userWithdrawnOrder) {
		// TODO Auto-generated method stub
		return userWithdrawnOrderMapper.queryUserWithdrawnOrderByCondition(userWithdrawnOrder);
	}
    //查询数据的页数
	@Override
	public Integer searchTotallPageNum(UserWithdrawnOrder userWithdrawnOrder) {
		// TODO Auto-generated method stub
		return userWithdrawnOrderMapper.queryUserWithdrawnOrderCountByCondition(userWithdrawnOrder);
	}

	@Override
	public Integer saveUserWithdrawnOrder(UserWithdrawnOrder userWithdrawnOrder) {
		// TODO Auto-generated method stub
		return null;
	}
    //根据id查询记录
	@Override
	public UserWithdrawnOrder queryUserWithdrawnOrderById(Integer id) {
		// TODO Auto-generated method stub
		return userWithdrawnOrderMapper.selectByPrimaryKey(Long.valueOf(id));
	}

	@Override
	public Integer deleteUserWithdrawnOrderById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateUserWithdrawnOrder(UserWithdrawnOrder userWithdrawnOrder) {
		// TODO Auto-generated method stub
		return userWithdrawnOrderMapper.updateByPrimaryKeySelective(userWithdrawnOrder);
	}
    //查询有效的银行信息
	@Override
	public List<BaseBankInfo> queryBaseBankInfo(BaseBankInfo baseBankInfo) {
		
		return baseBankInfoMapper.selectBaseBankInfoList(baseBankInfo);
	}
	
	@Override
	public Integer updateUserWithdrawnOrderById(UserWithdrawnOrder userWithdrawnOrder) {
		// TODO Auto-generated method stub
		return userWithdrawnOrderMapper.updateByPrimaryKeySelective(userWithdrawnOrder);
	}
	
	

}
