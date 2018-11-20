package com.lottery.dao;

import com.lottery.entity.LotteryMainOrder;
import com.lottery.entity.LotteryMainOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LotteryMainOrderMapper {
    long countByExample(LotteryMainOrderExample example);

    int deleteByExample(LotteryMainOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LotteryMainOrder record);

    int insertSelective(LotteryMainOrder record);

    List<LotteryMainOrder> selectByExampleWithBLOBs(LotteryMainOrderExample example);

    List<LotteryMainOrder> selectByExample(LotteryMainOrderExample example);

    LotteryMainOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LotteryMainOrder record, @Param("example") LotteryMainOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") LotteryMainOrder record, @Param("example") LotteryMainOrderExample example);

    int updateByExample(@Param("record") LotteryMainOrder record, @Param("example") LotteryMainOrderExample example);

    int updateByPrimaryKeySelective(LotteryMainOrder record);

    int updateByPrimaryKeyWithBLOBs(LotteryMainOrder record);

    int updateByPrimaryKey(LotteryMainOrder record);
    
    List<LotteryMainOrder> selectByCondition(LotteryMainOrder lotteryMainOrder);
    
    Integer selectCountByCondition(LotteryMainOrder lotteryMainOrder);
    //统计订单数量
    List<LotteryMainOrder> orderStatisticsByCondition(LotteryMainOrder lotteryMainOrder);
   //统计订单数量总数
    Integer orderStatisticsByConditionCount(LotteryMainOrder lotteryMainOrder);
    
	//根据条件统计用户流水
	 List<LotteryMainOrder> orderUserFlowStatisticsByCondition(LotteryMainOrder  lotteryMainOrde);
	//根据条件统计用户流水的总数
	 Integer orderUserFlowStatisticsByConditionCount(LotteryMainOrder  lotteryMainOrde);
		
	//根据条件统计彩票店户流水
	 List<LotteryMainOrder> orderLotteryShopFlowStatisticsByCondition(LotteryMainOrder  lotteryMainOrde);
	//根据条件统计彩票店流水的总数
	 Integer orderLotteryShopFlowStatisticsByConditionCount(LotteryMainOrder  lotteryMainOrde);
	
	//根据条件统计平台户流水
	 List<LotteryMainOrder> ordePlatformFlowStatisticsByCondition(LotteryMainOrder  lotteryMainOrde);
	//根据条件统计平台流水的总数
	 Integer orderPlatformFlowStatisticsByConditionCount(LotteryMainOrder  lotteryMainOrde);
	 
	 
	 Integer searchTodayOrderCount();
	 
	 Integer searchTodayPayOrderCount();
	
	
    

}