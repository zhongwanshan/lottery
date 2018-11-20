package com.lottery.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lottery.entity.BetFbLotteryPrize;
import com.lottery.entity.BetFbLotteryPrizeExample;
@Mapper
public interface BetFbLotteryPrizeMapper {
    long countByExample(BetFbLotteryPrizeExample example);

    int deleteByExample(BetFbLotteryPrizeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BetFbLotteryPrize record);

    int insertSelective(BetFbLotteryPrize record);

    List<BetFbLotteryPrize> selectByExample(BetFbLotteryPrizeExample example);

    BetFbLotteryPrize selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BetFbLotteryPrize record, @Param("example") BetFbLotteryPrizeExample example);

    int updateByExample(@Param("record") BetFbLotteryPrize record, @Param("example") BetFbLotteryPrizeExample example);

    int updateByPrimaryKeySelective(BetFbLotteryPrize record);

    int updateByPrimaryKey(BetFbLotteryPrize record);
    
    
    //查询前10条记录
    List<BetFbLotteryPrize> searchBetFbLotteryPrizeByCondition(BetFbLotteryPrize betFbLotteryPrize);
    
    //查询前10条记录
    Integer searchBetFbLotteryPrizeCountByCondition(BetFbLotteryPrize betFbLotteryPrize);
    
   //查询传统足球14场胜负彩/任选九赛事前15条记录
    List<BetFbLotteryPrize> searchBetFbLotteryByCondition(BetFbLotteryPrize betFbLotteryPrize);

    
    
    
    
}