package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.LotteryMainOrderMapper;
import com.lottery.dao.LotteryTypeMapper;
import com.lottery.entity.LotteryMainOrder;
import com.lottery.entity.LotteryType;
import com.lottery.service.LotteryMainOrderService;

@Service(value ="lotteryMainOrderService")
public class LotteryMainOrderServiceImp implements LotteryMainOrderService {
	@Autowired
	LotteryMainOrderMapper lotteryMainOrderMapper;
	
	@Autowired
	LotteryTypeMapper lotteryTypeMapper;
     //根据id排序查询10条数据
	@Override
	public List<LotteryMainOrder> searchLotteryMainOrderByCondition(LotteryMainOrder lotteryMainOrder) {
		
		return lotteryMainOrderMapper.selectByCondition(lotteryMainOrder);	
		}

	@Override
	public Integer searchTotallPageNum(LotteryMainOrder lotteryMainOrder) {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.selectCountByCondition(lotteryMainOrder);
	}

	@Override
	public List<LotteryType> searchAllLotteryType(LotteryType lotteryType) {
		// TODO Auto-generated method stub
		return lotteryTypeMapper.searchAllLotteryType(lotteryType);
	}
     /**
      * 根据主键查询记录
      */
	@Override
	public LotteryMainOrder searchLotteryMainById(Integer id) {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.selectByPrimaryKey(Long.valueOf(id.toString()));
	}
    /**
     * 根据条件分组查询订单统计
     */
	@Override
	public List<LotteryMainOrder> orderStatisticsByCondition(LotteryMainOrder lotteryMainOrde) {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.orderStatisticsByCondition(lotteryMainOrde);
	}
    /**
     * 根据条件查询订单总数
     */
	@Override
	public Integer orderStatisticsByConditionCount(LotteryMainOrder lotteryMainOrder) {
		return lotteryMainOrderMapper.orderStatisticsByConditionCount(lotteryMainOrder);
	}

	@Override
	public List<LotteryMainOrder> orderUserFlowStatisticsByCondition(LotteryMainOrder lotteryMainOrde) {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.orderUserFlowStatisticsByCondition(lotteryMainOrde);
	}

	@Override
	public Integer orderUserFlowStatisticsByConditionCount(LotteryMainOrder lotteryMainOrde) {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.orderUserFlowStatisticsByConditionCount(lotteryMainOrde);
	}

	@Override
	public List<LotteryMainOrder> ordeLotteryShopFlowStatisticsByCondition(LotteryMainOrder lotteryMainOrde) {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.orderLotteryShopFlowStatisticsByCondition(lotteryMainOrde);
	}

	@Override
	public Integer orderLotteryShopFlowStatisticsByConditionCount(LotteryMainOrder lotteryMainOrde) {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.orderLotteryShopFlowStatisticsByConditionCount(lotteryMainOrde);
	}

	@Override
	public List<LotteryMainOrder> ordePlatformFlowStatisticsByCondition(LotteryMainOrder lotteryMainOrde) {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.ordePlatformFlowStatisticsByCondition(lotteryMainOrde);
	}

	@Override
	public Integer orderPlatformFlowStatisticsByConditionCount(LotteryMainOrder lotteryMainOrde) {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.orderPlatformFlowStatisticsByConditionCount(lotteryMainOrde);
	}

	@Override
	public Integer updateLotteryMainOrder(LotteryMainOrder lotteryMainOrder) {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.updateByPrimaryKeySelective(lotteryMainOrder);
	}

	@Override
	public Integer searchTodayOrderCount() {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.searchTodayOrderCount();
	}

	@Override
	public Integer searchTodayPayOrderCount() {
		// TODO Auto-generated method stub
		return lotteryMainOrderMapper.searchTodayPayOrderCount();
	}


}
