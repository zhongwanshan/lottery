package com.lottery.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.lottery.entity.BetMatchfb;
import com.lottery.entity.BetMatchfbExample;
@Mapper
public interface BetMatchfbMapper {
    long countByExample(BetMatchfbExample example);

    int deleteByExample(BetMatchfbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BetMatchfb record);

    int insertSelective(BetMatchfb record);

    List<BetMatchfb> selectByExampleWithBLOBs(BetMatchfbExample example);

    List<BetMatchfb> selectByExample(BetMatchfbExample example);

    BetMatchfb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BetMatchfb record, @Param("example") BetMatchfbExample example);

    int updateByExampleWithBLOBs(@Param("record") BetMatchfb record, @Param("example") BetMatchfbExample example);

    int updateByExample(@Param("record") BetMatchfb record, @Param("example") BetMatchfbExample example);

    int updateByPrimaryKeySelective(BetMatchfb record);

    int updateByPrimaryKeyWithBLOBs(BetMatchfb record);

    int updateByPrimaryKey(BetMatchfb record);
    
    
    
	//根据条件查询竞彩足球赛程赔率最新10条数据
	public List<BetMatchfb> searchBetMatchfbByCondition(BetMatchfb BetMatchfb);
	
	//根据条件查询竞彩足球赛程赔率总记录
	public Integer searchBetMatchfbCountByCondition(BetMatchfb BetMatchfb);
}