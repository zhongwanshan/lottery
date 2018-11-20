package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.UserBaseInfoMapper;
import com.lottery.entity.UserBaseInfo;
import com.lottery.service.UserBaseInfoService;
@Service(value ="userBaseInfoService")
public class UserBaseInfoServiceImp implements UserBaseInfoService {
	
	@Autowired
	UserBaseInfoMapper userBaseInfoMapper;

	@Override
	public List<UserBaseInfo> searchUserBaseInfoByCondition(UserBaseInfo userBaseInfo) {
		// TODO Auto-generated method stub
		return userBaseInfoMapper.searchUserBaseInfoByCondition(userBaseInfo);
	}

	@Override
	public Integer searchUserBaseInfoCountByCondition(UserBaseInfo userBaseInfo) {
		// TODO Auto-generated method stub
		return userBaseInfoMapper.searchUserBaseInfoConutByCondition(userBaseInfo);
	}

	@Override
	public Integer saveUserBaseInfo(UserBaseInfo userBaseInfo) {
		// TODO Auto-generated method stub
		return userBaseInfoMapper.insert(userBaseInfo);
	}

	@Override
	public UserBaseInfo queryUserBaseInfoById(Integer id) {
		// TODO Auto-generated method stub
		return userBaseInfoMapper.selectByPrimaryKey(Long.valueOf(id.toString()));
	}

	@Override
	public Integer updateUserBase(UserBaseInfo userBaseInfo) {
		// TODO Auto-generated method stub
		return userBaseInfoMapper.updateByPrimaryKeySelective(userBaseInfo);
	}

	@Override
	public UserBaseInfo queryUserData(UserBaseInfo userBaseInfo) {
		return userBaseInfoMapper.queryUserData(userBaseInfo).size()!=0?userBaseInfoMapper.queryUserData(userBaseInfo).get(0):null;
	}
     /**
      * 查看彩票店主列表
      */
	@Override
	public List<UserBaseInfo> searchLotteryShopUserByCondition() {
		// TODO Auto-generated method stub
		return userBaseInfoMapper.searchLotteryShopUserByCondition();
	}
/**
 * 查询分页数据
 */

	@Override
	public List<UserBaseInfo> searchLotteryShopUserByConditionLimit(UserBaseInfo userBaseInfo) {
		// TODO Auto-generated method stub
		return userBaseInfoMapper.searchLotteryShopUserList(userBaseInfo);
	}
	
	
    /**
     * 查询总记录
     */
	@Override
	public Integer searchLotteryShopUserCountByConditionLimit(UserBaseInfo userBaseInfo) {
		// TODO Auto-generated method stub
		return userBaseInfoMapper.searchLotteryShopUserCountByConditionLimit(userBaseInfo);
	}
	
	/**
	 * 查询分页数据
	 */

		@Override
		public List<UserBaseInfo> searchLotteryShopUserByConditionLimitIds(UserBaseInfo userBaseInfo) {
			// TODO Auto-generated method stub
			return userBaseInfoMapper.searchLotteryShopUserByConditionLimit(userBaseInfo);
		}
	    /**
	     * 查询总记录
	     */
		@Override
		public Integer searchLotteryShopUserCountByConditionLimitIds(UserBaseInfo userBaseInfo) {
			// TODO Auto-generated method stub
			return userBaseInfoMapper.searchLotteryShopUserCountByConditionLimit(userBaseInfo);
		}	
	
	

}
