package com.lottery.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lottery.entity.BetFbLottery;
import com.lottery.entity.BetFbLotteryExample;
@Mapper
public interface BetFbLotteryMapper {
    long countByExample(BetFbLotteryExample example);

    int deleteByExample(BetFbLotteryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BetFbLottery record);

    int insertSelective(BetFbLottery record);

    List<BetFbLottery> selectByExample(BetFbLotteryExample example);

    BetFbLottery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BetFbLottery record, @Param("example") BetFbLotteryExample example);

    int updateByExample(@Param("record") BetFbLottery record, @Param("example") BetFbLotteryExample example);

    int updateByPrimaryKeySelective(BetFbLottery record);

    int updateByPrimaryKey(BetFbLottery record);
	//根据条件查询传统足球14场胜负彩/任选九赛事最新10条数据
	public List<BetFbLottery> searchBetFbLotteryByCondition(BetFbLottery betFbLottery);
	
	//根据条件查询传统足球14场胜负彩/任选九赛事总记录
	public Integer searchBetFbLotteryCountByCondition(BetFbLottery betFbLottery);
}