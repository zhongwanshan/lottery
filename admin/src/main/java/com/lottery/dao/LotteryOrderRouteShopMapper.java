package com.lottery.dao;

import com.lottery.entity.LotteryOrderRouteShop;
import com.lottery.entity.LotteryOrderRouteShopExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LotteryOrderRouteShopMapper {
    long countByExample(LotteryOrderRouteShopExample example);

    int deleteByExample(LotteryOrderRouteShopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryOrderRouteShop record);

    int insertSelective(LotteryOrderRouteShop record);

    List<LotteryOrderRouteShop> selectByExample(LotteryOrderRouteShopExample example);

    LotteryOrderRouteShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryOrderRouteShop record, @Param("example") LotteryOrderRouteShopExample example);

    int updateByExample(@Param("record") LotteryOrderRouteShop record, @Param("example") LotteryOrderRouteShopExample example);

    int updateByPrimaryKeySelective(LotteryOrderRouteShop record);

    int updateByPrimaryKey(LotteryOrderRouteShop record);
    
    
    int deleteByRouteId(Integer id);
    List<LotteryOrderRouteShop> queryLotteryOrderRouteShopList(Integer id);

    
}