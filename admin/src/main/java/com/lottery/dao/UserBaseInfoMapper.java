package com.lottery.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lottery.entity.UserBaseInfo;
import com.lottery.entity.UserBaseInfoExample;

@Mapper
public interface UserBaseInfoMapper {
	long countByExample(UserBaseInfoExample example);

	int deleteByExample(UserBaseInfoExample example);

	int deleteByPrimaryKey(Long id);

	int insert(UserBaseInfo record);

	int insertSelective(UserBaseInfo record);

	List<UserBaseInfo> selectByExample(UserBaseInfoExample example);

	UserBaseInfo selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") UserBaseInfo record, @Param("example") UserBaseInfoExample example);

	int updateByExample(@Param("record") UserBaseInfo record, @Param("example") UserBaseInfoExample example);

	int updateByPrimaryKeySelective(UserBaseInfo record);

	int updateByPrimaryKey(UserBaseInfo record);

	List<UserBaseInfo> searchUserBaseInfoByCondition(UserBaseInfo record);

	Integer searchUserBaseInfoConutByCondition(UserBaseInfo record);

	List<UserBaseInfo> queryUserData(UserBaseInfo record);
	
	List<UserBaseInfo> searchLotteryShopUserByCondition();
	
	List<UserBaseInfo> searchLotteryShopUserByConditionLimit(UserBaseInfo userBaseInfo);
	
	List<UserBaseInfo> searchLotteryShopUserList(UserBaseInfo userBaseInfo);
	
	int searchLotteryShopUserCountByConditionLimit(UserBaseInfo userBaseInfo);

}