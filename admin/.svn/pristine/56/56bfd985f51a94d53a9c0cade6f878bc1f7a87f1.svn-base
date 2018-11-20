package com.lottery.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.BaseBankInfo;
import com.lottery.entity.UserRechargeOrder;
import com.lottery.entity.UserWithdrawnOrder;
import com.lottery.service.UserRechargeOrderService;
import com.lottery.util.DateFomatUtil;
/**
 * 充值申请
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/userRechargeOrder")
public class UserRechargeOrderController {

	@Autowired
	UserRechargeOrderService userRechargeOrderService;

	@RequestMapping("/userRechargeOrderHomePath")
	public String homePath(Map<String, Object> mapValue) {
		// 查询默认按id排序的数据
		UserRechargeOrder userWithdrawnOrder = new UserRechargeOrder();
		userWithdrawnOrder.setPageNum(0);
		List<UserRechargeOrder> userRechargeOrderList =userRechargeOrderService.searchUserRechargeOrderByCondition(userWithdrawnOrder);
		for (UserRechargeOrder userRechargeOrder2 : userRechargeOrderList) {
			if (userRechargeOrder2.getRechargeTime()!= null) {
				userRechargeOrder2.setRechargeTimeTow(
						DateFomatUtil.formatDateTime(userRechargeOrder2.getRechargeTime(), "yyyy-MM-dd HH:mm:ss"));
			}
		}
		// 查询总页数
		Integer totallNum = userRechargeOrderService.searchTotallPageNum(userWithdrawnOrder);
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", userRechargeOrderList);
		return "userRechargeOrderHome";
	}
	@RequestMapping("/queryUserRechargeOrderHome")
	@ResponseBody
	public Map queryUserRechargeOrderHome(UserRechargeOrder userWithdrawnOrder) {
		// 查询默认按id排序的数据
		Map dataMap = new HashMap<>();
		List<UserRechargeOrder> userRechargeOrderList =userRechargeOrderService.searchUserRechargeOrderByCondition(userWithdrawnOrder);
		for (UserRechargeOrder userRechargeOrder2 : userRechargeOrderList) {
			if (userRechargeOrder2.getRechargeTime()!= null) {
				userRechargeOrder2.setRechargeTimeTow(
						DateFomatUtil.formatDateTime(userRechargeOrder2.getRechargeTime(), "yyyy-MM-dd HH:mm:ss"));
			}
		}
		// 查询总页数
		Integer totallNum = userRechargeOrderService.searchTotallPageNum(userWithdrawnOrder);
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", userRechargeOrderList);
		return dataMap;
	}
}
