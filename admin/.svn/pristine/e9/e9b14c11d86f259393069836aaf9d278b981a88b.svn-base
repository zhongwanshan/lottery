package com.lottery.dao;

import com.lottery.entity.LotteryOrderRoute;
import com.lottery.entity.LotteryOrderRouteExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LotteryOrderRouteMapper {
    long countByExample(LotteryOrderRouteExample example);

    int deleteByExample(LotteryOrderRouteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryOrderRoute record);

    int insertSelective(LotteryOrderRoute record);

    List<LotteryOrderRoute> selectByExample(LotteryOrderRouteExample example);

    LotteryOrderRoute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryOrderRoute record, @Param("example") LotteryOrderRouteExample example);

    int updateByExample(@Param("record") LotteryOrderRoute record, @Param("example") LotteryOrderRouteExample example);

    int updateByPrimaryKeySelective(LotteryOrderRoute record);

    int updateByPrimaryKey(LotteryOrderRoute record);
    
    //根据条件查询10条记录
    List<LotteryOrderRoute> searchLotteryOrderRouteByCondition(LotteryOrderRoute lotteryOrderRoute);
    
    //根据条件查询总记录
     int searchLotteryOrderRouteCountByCondition(LotteryOrderRoute lotteryOrderRoute);
    
    
    
    
}