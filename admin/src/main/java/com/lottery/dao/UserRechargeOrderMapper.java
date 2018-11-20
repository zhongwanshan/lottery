package com.lottery.dao;

import com.lottery.entity.UserRechargeOrder;
import com.lottery.entity.UserRechargeOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserRechargeOrderMapper {
    long countByExample(UserRechargeOrderExample example);

    int deleteByExample(UserRechargeOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRechargeOrder record);

    int insertSelective(UserRechargeOrder record);

    List<UserRechargeOrder> selectByExample(UserRechargeOrderExample example);

    UserRechargeOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRechargeOrder record, @Param("example") UserRechargeOrderExample example);

    int updateByExample(@Param("record") UserRechargeOrder record, @Param("example") UserRechargeOrderExample example);

    int updateByPrimaryKeySelective(UserRechargeOrder record);

    int updateByPrimaryKey(UserRechargeOrder record);
    
    List<UserRechargeOrder> searchUserRechargeOrderByCondition(UserRechargeOrder userRechargeOrder);
    Integer searchTotallPageNum(UserRechargeOrder record);

    
}