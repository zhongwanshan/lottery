package com.lottery.dao;

import com.lottery.entity.LotteryIssue;
import com.lottery.entity.LotteryIssueExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LotteryIssueMapper {
    long countByExample(LotteryIssueExample example);

    int deleteByExample(LotteryIssueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryIssue record);

    int insertSelective(LotteryIssue record);

    List<LotteryIssue> selectByExample(LotteryIssueExample example);

    LotteryIssue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryIssue record, @Param("example") LotteryIssueExample example);

    int updateByExample(@Param("record") LotteryIssue record, @Param("example") LotteryIssueExample example);

    int updateByPrimaryKeySelective(LotteryIssue record);

    int updateByPrimaryKey(LotteryIssue record);
    
    
	//根据条件查询数字彩期数最新10条数据
	public List<LotteryIssue> searchLotteryIssueByCondition(LotteryIssue lotteryIssue);
	
	//根据条件查询数字彩期数总记录
	public Integer searchLotteryIssueCountByCondition(LotteryIssue lotteryIssue);
/*
	//根据id查询记录
	public LotteryIssue searchLotteryIssueById(Integer id);
	
	//更新数字彩期数
	public Integer updateLotteryIssue(LotteryIssue lotteryIssue);
	
	//更新数字彩期数
	public Integer saveLotteryIssue(LotteryIssue lotteryIssue);
    */
     
}