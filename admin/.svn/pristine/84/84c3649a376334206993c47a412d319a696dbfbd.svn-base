package com.lottery.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.LotteryMainOrder;
import com.lottery.entity.LotteryType;
import com.lottery.entity.UserBaseInfo;
import com.lottery.service.LotteryMainOrderService;
import com.lottery.service.UserBaseInfoService;
import com.lottery.util.DateFomatUtil;

@Controller
@RequestMapping("/lotteryMainOrder")
public class LotteryMainOrderController {

	@Autowired
	LotteryMainOrderService lotteryMainOrderService;

	@Autowired
	UserBaseInfoService userBaseInfoService;

	@RequestMapping("/home")
	public String homePath2() {
		return "home2";
	}

	/**
	 * 订单统计
	 * 
	 * @return
	 */
	@RequestMapping("/orderStatisticsPath")
	public String orderStatisticsHome(Map<String, Object> mapValue) {
		// 统计订单的
		LotteryMainOrder lotteryMainOrder = new LotteryMainOrder();
		lotteryMainOrder.setPageNum(0);
		lotteryMainOrder.setTimeDimension(0);
		List<LotteryMainOrder> lotteryMainOrderList = lotteryMainOrderService
				.orderStatisticsByCondition(lotteryMainOrder);
		for (LotteryMainOrder lotteryMainOrder2 : lotteryMainOrderList) {
			lotteryMainOrder2.setOrderTotallMoney((float) (lotteryMainOrder2.getOrderPrice() / 100.0));
			lotteryMainOrder2.setShopGetTotallMoney((float) (lotteryMainOrder2.getPayShopMoney() / 100.0));
		}
		// 查看彩票种类
		List<LotteryType> lotteryTypeList = lotteryMainOrderService.searchAllLotteryType(new LotteryType());
		// 查看彩票店主列表
		List<UserBaseInfo> userBaseInfoList = userBaseInfoService.searchLotteryShopUserByCondition();
		Integer totallNum = lotteryMainOrderService.orderStatisticsByConditionCount(lotteryMainOrder);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("lotteryTypeList", lotteryTypeList);
		mapValue.put("dataList", lotteryMainOrderList);
		mapValue.put("userBaseInfoList", userBaseInfoList);
		// 查看统计的情况，按日
		return "orderStatisticHome";
	}

	/**
	 * 查询订单统计信息
	 * 
	 * @return
	 */
	@RequestMapping("/orderStatistics")
	@ResponseBody
	public Map orderStatisticsByCondition(LotteryMainOrder lotteryMainOrder) {
		Map dataMap = new HashMap<>();
		List<LotteryMainOrder> lotteryMainOrderList = lotteryMainOrderService
				.orderStatisticsByCondition(lotteryMainOrder);
		for (LotteryMainOrder lotteryMainOrder2 : lotteryMainOrderList) {
			lotteryMainOrder2.setOrderTotallMoney((float) (lotteryMainOrder2.getOrderPrice() / 100.0));
			lotteryMainOrder2.setShopGetTotallMoney((float) (lotteryMainOrder2.getPayShopMoney() / 100.0));
		}
		Integer totallNum = lotteryMainOrderService.orderStatisticsByConditionCount(lotteryMainOrder);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", lotteryMainOrderList);
		return dataMap;
	}

	@RequestMapping("/lotteryMainOrderPath")
	public String homePath(Map<String, Object> mapValue) {
		// 查询默认按id排序的数据
		LotteryMainOrder lotteryMainOrder = new LotteryMainOrder();
		lotteryMainOrder.setPageNum(0);
		List<LotteryMainOrder> lotteryMainOrderList = lotteryMainOrderService
				.searchLotteryMainOrderByCondition(lotteryMainOrder);
		for (LotteryMainOrder lotteryMainOrder2 : lotteryMainOrderList) {
			lotteryMainOrder2.setCreateTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setBonusTow((float) (lotteryMainOrder2.getBonus() / 100.0));
			lotteryMainOrder2.setUpdateTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getUpdateTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setShopReceiveTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getShopReceiveTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setShopPrintTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getShopPrintTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setRefundBeginTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getRefundBeginTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setRefundEndTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getRefundEndTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setPayShopTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getPayShopTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setPayAgentTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getPayAgentTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setWinPayTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getWinPayTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setMoneyLostTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getMoneyLostTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setSysOpenTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getSysOpenTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setUserPayTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getUserPayTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setPlanAwardTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getPlanAwardTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setOrderPriceTow((float) (lotteryMainOrder2.getOrderPrice() / 100.0));
			lotteryMainOrder2.setRefundMoneyTow((float) (lotteryMainOrder2.getRefundMoney() / 100.0));
			lotteryMainOrder2.setPayShopMoneyTow((float) (lotteryMainOrder2.getPayShopMoney() / 100.0));
			lotteryMainOrder2.setPayAgentMoneyTow((float) (lotteryMainOrder2.getPayAgentMoney() / 100.0));
			lotteryMainOrder2.setMaybeWinMoneyTow((float) (lotteryMainOrder2.getMaybeWinMoney() / 100.0));
			lotteryMainOrder2.setBalanceTow((float) (lotteryMainOrder2.getBalance() / 100.0));
			lotteryMainOrder2.setUserAccountBeforeTow((float) (lotteryMainOrder2.getUserAccountBefore() / 100.0));
			lotteryMainOrder2.setDeliverToShopTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getDeliverToShopTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		// 查看彩票店主列表
		List<UserBaseInfo> userBaseInfoList = userBaseInfoService.searchLotteryShopUserByCondition();
		Integer totallNum = lotteryMainOrderService.searchTotallPageNum(lotteryMainOrder);
		// 查看彩票种类
		List<LotteryType> lotteryTypeList = lotteryMainOrderService.searchAllLotteryType(new LotteryType());
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", lotteryMainOrderList);
		mapValue.put("lotteryTypeList", lotteryTypeList);
		mapValue.put("userBaseInfoList", userBaseInfoList);

		return "lotteryMainOrderHome";
	}

	@RequestMapping("/searchLotteryMainOrder")
	@ResponseBody
	public Map searchLotteryMainOrder(LotteryMainOrder lotteryMainOrder) {
		Map dataMap = new HashMap<>();
		List<LotteryMainOrder> lotteryMainOrderList = lotteryMainOrderService
				.searchLotteryMainOrderByCondition(lotteryMainOrder);
		for (LotteryMainOrder lotteryMainOrder2 : lotteryMainOrderList) {
			lotteryMainOrder2.setCreateTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setBonusTow((float) (lotteryMainOrder2.getBonus() / 100.0));
			lotteryMainOrder2.setUpdateTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getUpdateTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setShopReceiveTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getShopReceiveTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setShopPrintTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getShopPrintTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setRefundBeginTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getRefundBeginTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setRefundEndTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getRefundEndTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setPayShopTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getPayShopTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setPayAgentTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getPayAgentTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setWinPayTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getWinPayTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setMoneyLostTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getMoneyLostTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setSysOpenTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getSysOpenTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setUserPayTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getUserPayTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setPlanAwardTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getPlanAwardTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setPlanAwardTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getPlanAwardTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryMainOrder2.setOrderPriceTow((float) (lotteryMainOrder2.getOrderPrice() / 100.0));
			lotteryMainOrder2.setRefundMoneyTow((float) (lotteryMainOrder2.getRefundMoney() / 100.0));
			lotteryMainOrder2.setPayShopMoneyTow((float) (lotteryMainOrder2.getPayShopMoney() / 100.0));
			lotteryMainOrder2.setPayAgentMoneyTow((float) (lotteryMainOrder2.getPayAgentMoney() / 100.0));
			lotteryMainOrder2.setMaybeWinMoneyTow((float) (lotteryMainOrder2.getMaybeWinMoney() / 100.0));
			lotteryMainOrder2.setBalanceTow((float) (lotteryMainOrder2.getBalance() / 100.0));
			lotteryMainOrder2.setUserAccountBeforeTow((float) (lotteryMainOrder2.getUserAccountBefore() / 100.0));
			lotteryMainOrder2.setDeliverToShopTimeTow(
					DateFomatUtil.formatDateTime(lotteryMainOrder2.getDeliverToShopTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		Integer totallNum = lotteryMainOrderService.searchTotallPageNum(lotteryMainOrder);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", lotteryMainOrderList);
		return dataMap;
	}

	@RequestMapping("/lotteryMainOrderDetail")
	public String lotteryMainOrderDetail(Map<String, Object> mapValue, Integer id) {
		// 查询默认按id排序的数据;
		LotteryMainOrder lotteryMainOrder = lotteryMainOrderService.searchLotteryMainById(id);
		lotteryMainOrder.setOpenTimeTow(lotteryMainOrder.getOpenTime());

		if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("0"))) {
			lotteryMainOrder.setOrderStatusTow("暂存");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("1"))) {
			lotteryMainOrder.setOrderStatusTow("待付款");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("2"))) {
			lotteryMainOrder.setOrderStatusTow("待继续支付");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("3"))) {
			lotteryMainOrder.setOrderStatusTow("已付款");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("4"))) {
			lotteryMainOrder.setOrderStatusTow("已中奖");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("5"))) {
			lotteryMainOrder.setOrderStatusTow("未中奖");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("6"))) {
			lotteryMainOrder.setOrderStatusTow("已取消");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("7"))) {
			lotteryMainOrder.setOrderStatusTow("退款中");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("8"))) {
			lotteryMainOrder.setOrderStatusTow("已删除");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("9"))) {
			lotteryMainOrder.setOrderStatusTow("已退款");
		}

		if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("0"))) {
			lotteryMainOrder.setShopDealStatusTow("未处理");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("1"))) {
			lotteryMainOrder.setShopDealStatusTow("已接单");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("2"))) {
			lotteryMainOrder.setShopDealStatusTow("已打印出单");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("3"))) {
			lotteryMainOrder.setShopDealStatusTow("出单失败/拒单");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("4"))) {
			lotteryMainOrder.setShopDealStatusTow("超时撤销");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("5"))) {
			lotteryMainOrder.setShopDealStatusTow("已结算收款");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("6"))) {
			lotteryMainOrder.setShopDealStatusTow("已向用户转交彩票");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("7"))) {
			lotteryMainOrder.setShopDealStatusTow("已退款");
		}

		if (lotteryMainOrder.getWinPayStatus().equals(Byte.valueOf("0"))) {
			lotteryMainOrder.setWinPayStatusTow("待处理 ");
		} else if (lotteryMainOrder.getWinPayStatus().equals(Byte.valueOf("1"))) {
			lotteryMainOrder.setWinPayStatusTow("平台已赔付给用户 ");
		}else 
		if (lotteryMainOrder.getWinPayStatus().equals(Byte.valueOf("2"))) {
			lotteryMainOrder.setWinPayStatusTow("平台已通知用户线下兑奖 ");
		}
		if (lotteryMainOrder.getAwardFlag().equals(Boolean.valueOf("0"))) {
			lotteryMainOrder.setAwardFlagTow("未开奖");
		} else if (lotteryMainOrder.getAwardFlag().equals(Boolean.valueOf("1"))) {
			lotteryMainOrder.setAwardFlagTow("已开奖");
		}
		lotteryMainOrder.setCreateTimeTow(
				DateFomatUtil.formatDateTime(lotteryMainOrder.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
		lotteryMainOrder.setPlanAwardTimeTow(
				DateFomatUtil.formatDateTime(lotteryMainOrder.getPlanAwardTime(), "yyyy-MM-dd HH:mm:ss"));
		lotteryMainOrder.setPlatformTotallMoney((float) (lotteryMainOrder.getBonus() / 100.0));
		mapValue.put("dataList", lotteryMainOrder);
		return "lotteryMainOrderDetail";
	}

	@RequestMapping("/lotteryMainOrderColorDetail")
	public String lotteryMainOrderColorDetail(Map<String, Object> mapValue, Integer id) {
		// 查询默认按id排序的数据;
		LotteryMainOrder lotteryMainOrder = lotteryMainOrderService.searchLotteryMainById(id);

		if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("0"))) {
			lotteryMainOrder.setOrderStatusTow("暂存");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("1"))) {
			lotteryMainOrder.setOrderStatusTow("待付款");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("2"))) {
			lotteryMainOrder.setOrderStatusTow("待继续支付");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("3"))) {
			lotteryMainOrder.setOrderStatusTow("已付款");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("4"))) {
			lotteryMainOrder.setOrderStatusTow("已中奖");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("5"))) {
			lotteryMainOrder.setOrderStatusTow("未中奖");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("6"))) {
			lotteryMainOrder.setOrderStatusTow("已取消");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("7"))) {
			lotteryMainOrder.setOrderStatusTow("退款中");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("8"))) {
			lotteryMainOrder.setOrderStatusTow("已删除");
		} else if (lotteryMainOrder.getOrderStatus().equals(Short.valueOf("9"))) {
			lotteryMainOrder.setOrderStatusTow("已退款");
		}

		if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("0"))) {
			lotteryMainOrder.setShopDealStatusTow("未处理");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("1"))) {
			lotteryMainOrder.setShopDealStatusTow("已接单");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("2"))) {
			lotteryMainOrder.setShopDealStatusTow("已打印出单");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("3"))) {
			lotteryMainOrder.setShopDealStatusTow("出单失败/拒单");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("4"))) {
			lotteryMainOrder.setShopDealStatusTow("超时撤销");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("5"))) {
			lotteryMainOrder.setShopDealStatusTow("已结算收款");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("6"))) {
			lotteryMainOrder.setShopDealStatusTow("已向用户转交彩票");
		} else if (lotteryMainOrder.getShopDealStatus().equals(Short.valueOf("7"))) {
			lotteryMainOrder.setShopDealStatusTow("已退款");
		}

		if (lotteryMainOrder.getWinPayStatus().equals(Byte.valueOf("0"))) {
			lotteryMainOrder.setWinPayStatusTow("待处理 ");
		} else if (lotteryMainOrder.getWinPayStatus().equals(Byte.valueOf("1"))) {
			lotteryMainOrder.setWinPayStatusTow("平台已赔付给用户 ");
		}else 
		if (lotteryMainOrder.getWinPayStatus().equals(Byte.valueOf("2"))) {
			lotteryMainOrder.setWinPayStatusTow("平台已通知用户线下兑奖 ");
		}
		if (lotteryMainOrder.getAwardFlag().equals(Boolean.valueOf("0"))) {
			lotteryMainOrder.setAwardFlagTow("未开奖");
		} else if (lotteryMainOrder.getAwardFlag().equals(Boolean.valueOf("1"))) {
			lotteryMainOrder.setAwardFlagTow("已开奖");
		}
		lotteryMainOrder.setOpenTimeTow(lotteryMainOrder.getOpenTime());
		lotteryMainOrder.setCreateTimeTow(
				DateFomatUtil.formatDateTime(lotteryMainOrder.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
		lotteryMainOrder.setPlanAwardTimeTow(
				DateFomatUtil.formatDateTime(lotteryMainOrder.getPlanAwardTime(), "yyyy-MM-dd HH:mm:ss"));
		lotteryMainOrder.setPlatformTotallMoney((float) (lotteryMainOrder.getBonus() / 100.0));
		mapValue.put("dataList", lotteryMainOrder);
		return "lotteryMainOrderColorDetail";
	}

	@RequestMapping("/updateLotteryMainOrderPath")
	public String upodatelotteryMainOrderPath(Map<String, Object> mapValue, Integer id) {
		// 查询默认按id排序的数据;
		LotteryMainOrder lotteryMainOrder = lotteryMainOrderService.searchLotteryMainById(id);

		mapValue.put("dataList", lotteryMainOrder);
		return "updateLotteryMainOrder";
	}

	@RequestMapping("/updatelotteryMainOrder")
	@ResponseBody
	public String updatelotteryMainOrder(LotteryMainOrder lotteryMainOrder) {

		Integer num = lotteryMainOrderService.updateLotteryMainOrder(lotteryMainOrder);

		return num > 0 ? "sucess" : "false";
	}

	/**
	 * 用户流水统计
	 * 
	 * @return
	 */
	@RequestMapping("/orderUserFlowStatisticsPath")
	public String orderUserFlowStatisticsHome(Map<String, Object> mapValue) {
		// 统计订单的
		LotteryMainOrder lotteryMainOrder = new LotteryMainOrder();
		lotteryMainOrder.setPageNum(0);
		lotteryMainOrder.setTimeDimension(0);
		List<LotteryMainOrder> lotteryMainOrderList = lotteryMainOrderService
				.orderUserFlowStatisticsByCondition(lotteryMainOrder);
		for (LotteryMainOrder lotteryMainOrder2 : lotteryMainOrderList) {
			lotteryMainOrder2.setOrderTotallMoney((float) (lotteryMainOrder2.getOrderPrice() / 100.0));
			lotteryMainOrder2.setUserPayTotallMoney((float) (lotteryMainOrder2.getRefundMoney() / 100.0));
			lotteryMainOrder2.setShopGetTotallMoney((float) (lotteryMainOrder2.getPayShopMoney() / 100.0));
			lotteryMainOrder2.setPlatformTotallMoney((float) (lotteryMainOrder2.getBonus() / 100.0));
		}
		// 查看彩票种类
		List<LotteryType> lotteryTypeList = lotteryMainOrderService.searchAllLotteryType(new LotteryType());
		Integer totallNum = lotteryMainOrderService.orderUserFlowStatisticsByConditionCount(lotteryMainOrder);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("lotteryTypeList", lotteryTypeList);
		mapValue.put("dataList", lotteryMainOrderList);
		// 查看统计的情况，按日
		return "orderUserFlowStatisticHome";
	}

	/**
	 * 查询用户流水
	 * 
	 * @return
	 */
	@RequestMapping("/orderUserFlowStatistics")
	@ResponseBody
	public Map orderUserFlowStatistics(LotteryMainOrder lotteryMainOrder) {
		Map dataMap = new HashMap<>();
		List<LotteryMainOrder> lotteryMainOrderList = lotteryMainOrderService
				.orderUserFlowStatisticsByCondition(lotteryMainOrder);
		for (LotteryMainOrder lotteryMainOrder2 : lotteryMainOrderList) {
			lotteryMainOrder2.setOrderTotallMoney((float) (lotteryMainOrder2.getOrderPrice() / 100.0));
			lotteryMainOrder2.setUserPayTotallMoney((float) (lotteryMainOrder2.getRefundMoney() / 100.0));
			lotteryMainOrder2.setShopGetTotallMoney((float) (lotteryMainOrder2.getPayShopMoney() / 100.0));
			lotteryMainOrder2.setPlatformTotallMoney((float) (lotteryMainOrder2.getBonus() / 100.0));
		}
		Integer totallNum = lotteryMainOrderService.orderUserFlowStatisticsByConditionCount(lotteryMainOrder);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", lotteryMainOrderList);
		return dataMap;
	}

	/**
	 * 彩票店流水流水统计
	 * 
	 * @return
	 */
	@RequestMapping("/orderLotteryShopFlowStatisticsPath")
	public String orderLotteryShopFlowStatisticsHome(Map<String, Object> mapValue) {
		// 统计订单的
		LotteryMainOrder lotteryMainOrder = new LotteryMainOrder();
		lotteryMainOrder.setPageNum(0);
		lotteryMainOrder.setTimeDimension(0);
		List<LotteryMainOrder> lotteryMainOrderList = lotteryMainOrderService
				.ordeLotteryShopFlowStatisticsByCondition(lotteryMainOrder);
		for (LotteryMainOrder lotteryMainOrder2 : lotteryMainOrderList) {
			lotteryMainOrder2.setOrderTotallMoney((float) (lotteryMainOrder2.getOrderPrice() / 100.0));
			lotteryMainOrder2.setUserPayTotallMoney((float) (lotteryMainOrder2.getRefundMoney() / 100.0));
			lotteryMainOrder2.setShopGetTotallMoney((float) (lotteryMainOrder2.getPayShopMoney() / 100.0));
			lotteryMainOrder2.setPlatformTotallMoney((float) (lotteryMainOrder2.getBonus() / 100.0));
		}
		// 查看彩票种类
		List<LotteryType> lotteryTypeList = lotteryMainOrderService.searchAllLotteryType(new LotteryType());
		// 查看彩票店主列表
		List<UserBaseInfo> userBaseInfoList = userBaseInfoService.searchLotteryShopUserByCondition();
		Integer totallNum = lotteryMainOrderService.orderLotteryShopFlowStatisticsByConditionCount(lotteryMainOrder);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("lotteryTypeList", lotteryTypeList);
		mapValue.put("dataList", lotteryMainOrderList);
		mapValue.put("userBaseInfoList", userBaseInfoList);
		// 查看统计的情况，按日
		return "orderLotteyShopStatisticHome";
	}

	/**
	 * 查询彩票店流水流水
	 * 
	 * @return
	 */
	@RequestMapping("/orderLotteryShopFlowStatistics")
	@ResponseBody
	public Map orderLotteryShopFlowStatistics(LotteryMainOrder lotteryMainOrder) {
		Map dataMap = new HashMap<>();
		List<LotteryMainOrder> lotteryMainOrderList = lotteryMainOrderService
				.ordeLotteryShopFlowStatisticsByCondition(lotteryMainOrder);
		for (LotteryMainOrder lotteryMainOrder2 : lotteryMainOrderList) {
			lotteryMainOrder2.setOrderTotallMoney((float) (lotteryMainOrder2.getOrderPrice() / 100.0));
			lotteryMainOrder2.setUserPayTotallMoney((float) (lotteryMainOrder2.getRefundMoney() / 100.0));
			lotteryMainOrder2.setShopGetTotallMoney((float) (lotteryMainOrder2.getPayShopMoney() / 100.0));
			lotteryMainOrder2.setPlatformTotallMoney((float) (lotteryMainOrder2.getBonus() / 100.0));
		}
		Integer totallNum = lotteryMainOrderService.orderLotteryShopFlowStatisticsByConditionCount(lotteryMainOrder);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", lotteryMainOrderList);
		return dataMap;
	}

	/**
	 * 平台流水流水流水统计
	 * 
	 * @return
	 */
	@RequestMapping("/orderPlatformFlowStatisticsPath")
	public String orderPlatformFlowStatistics(Map<String, Object> mapValue) {
		// 统计订单的
		LotteryMainOrder lotteryMainOrder = new LotteryMainOrder();
		lotteryMainOrder.setPageNum(0);
		lotteryMainOrder.setTimeDimension(0);
		List<LotteryMainOrder> lotteryMainOrderList = lotteryMainOrderService
				.ordePlatformFlowStatisticsByCondition(lotteryMainOrder);
		for (LotteryMainOrder lotteryMainOrder2 : lotteryMainOrderList) {
			lotteryMainOrder2.setOrderTotallMoney((float) (lotteryMainOrder2.getOrderPrice() / 100.0));
			lotteryMainOrder2.setUserPayTotallMoney((float) (lotteryMainOrder2.getRefundMoney() / 100.0));
			lotteryMainOrder2.setShopGetTotallMoney((float) (lotteryMainOrder2.getPayShopMoney() / 100.0));
			lotteryMainOrder2.setPlatformTotallMoney((float) (lotteryMainOrder2.getPayAgentMoney() / 100.0));
		}

		// 查看彩票种类
		List<LotteryType> lotteryTypeList = lotteryMainOrderService.searchAllLotteryType(new LotteryType());
		Integer totallNum = lotteryMainOrderService.orderPlatformFlowStatisticsByConditionCount(lotteryMainOrder);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("lotteryTypeList", lotteryTypeList);
		mapValue.put("dataList", lotteryMainOrderList);
		// 查看统计的情况，按日
		return "orderPlatformStatisticHome";
	}

	/**
	 * 查询平台流水流水
	 * 
	 * @return
	 */
	@RequestMapping("/orderPlatformFlowStatistics")
	@ResponseBody
	public Map orderPlatformFlowStatistics(LotteryMainOrder lotteryMainOrder) {
		Map dataMap = new HashMap<>();
		List<LotteryMainOrder> lotteryMainOrderList = lotteryMainOrderService
				.ordePlatformFlowStatisticsByCondition(lotteryMainOrder);
		for (LotteryMainOrder lotteryMainOrder2 : lotteryMainOrderList) {
			lotteryMainOrder2.setOrderTotallMoney((float) (lotteryMainOrder2.getOrderPrice() / 100.0));
			lotteryMainOrder2.setUserPayTotallMoney((float) (lotteryMainOrder2.getRefundMoney() / 100.0));
			lotteryMainOrder2.setShopGetTotallMoney((float) (lotteryMainOrder2.getPayShopMoney() / 100.0));
			lotteryMainOrder2.setPlatformTotallMoney((float) (lotteryMainOrder2.getPayAgentMoney() / 100.0));
		}
		Integer totallNum = lotteryMainOrderService.orderPlatformFlowStatisticsByConditionCount(lotteryMainOrder); // 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", lotteryMainOrderList);
		return dataMap;
	}

}
