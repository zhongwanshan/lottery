package com.lottery.dao;

import com.lottery.entity.LotteryType;
import com.lottery.entity.LotteryTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LotteryTypeMapper {
    long countByExample(LotteryTypeExample example);

    int deleteByExample(LotteryTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryType record);

    int insertSelective(LotteryType record);

    List<LotteryType> selectByExample(LotteryTypeExample example);

    LotteryType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryType record, @Param("example") LotteryTypeExample example);

    int updateByExample(@Param("record") LotteryType record, @Param("example") LotteryTypeExample example);

    int updateByPrimaryKeySelective(LotteryType record);

    int updateByPrimaryKey(LotteryType record);
    
    List<LotteryType> searchAllLotteryType(LotteryType lotteryType);

}