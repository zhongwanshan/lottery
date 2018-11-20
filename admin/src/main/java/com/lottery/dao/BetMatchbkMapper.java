package com.lottery.dao;

import com.lottery.entity.BetMatchbk;
import com.lottery.entity.BetMatchbkExample;
import com.lottery.entity.BetMatchfb;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BetMatchbkMapper {
    long countByExample(BetMatchbkExample example);

    int deleteByExample(BetMatchbkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BetMatchbk record);

    int insertSelective(BetMatchbk record);

    List<BetMatchbk> selectByExampleWithBLOBs(BetMatchbkExample example);

    List<BetMatchbk> selectByExample(BetMatchbkExample example);

    BetMatchbk selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BetMatchbk record, @Param("example") BetMatchbkExample example);

    int updateByExampleWithBLOBs(@Param("record") BetMatchbk record, @Param("example") BetMatchbkExample example);

    int updateByExample(@Param("record") BetMatchbk record, @Param("example") BetMatchbkExample example);

    int updateByPrimaryKeySelective(BetMatchbk record);

    int updateByPrimaryKeyWithBLOBs(BetMatchbk record);

    int updateByPrimaryKey(BetMatchbk record);
    

	//根据条件查询篮球赛事赔率表赔率最新10条数据
	public List<BetMatchbk> searchBetMatchbkByCondition(BetMatchbk betMatchbk);
	
	//根据条件查询篮球赛事赔率表赔率总记录
	public Integer searchBetMatchbkCountByCondition(BetMatchbk betMatchbk);
}