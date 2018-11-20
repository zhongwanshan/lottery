package com.lottery.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.BaseBankInfo;
import com.lottery.entity.BetMatchbk;
import com.lottery.entity.UserWithdrawnOrder;
import com.lottery.service.UserWithdrawnOrderService;
import com.lottery.util.DateFomatUtil;

@Controller
@RequestMapping("/userWithdrawnOrder")
public class UserWithdrawnOrderController {

	@Autowired
	UserWithdrawnOrderService userWithdrawnOrderService;

	@RequestMapping("/userWithdrawnOrderHomePath")
	public String homePath(Map<String, Object> mapValue) {
		// 查询默认按id排序的数据
		UserWithdrawnOrder userWithdrawnOrder = new UserWithdrawnOrder();
		userWithdrawnOrder.setAuthState(Byte.valueOf("10"));
		userWithdrawnOrder.setBankCardId(Long.valueOf("0"));
		userWithdrawnOrder.setPageNum(0);
		List<UserWithdrawnOrder> userWithdrawnOrderList = userWithdrawnOrderService.searchUserWithdrawnOrderByCondition(userWithdrawnOrder);
		for (UserWithdrawnOrder userWithdrawnOrder2 : userWithdrawnOrderList) {
			if (userWithdrawnOrder2.getApplyTime()!= null) {
				userWithdrawnOrder2.setApplyTimeTow(
						DateFomatUtil.formatDateTime(userWithdrawnOrder2.getApplyTime(), "yyyy-MM-dd HH:mm:ss"));
				userWithdrawnOrder2.setAmountTow((float)(userWithdrawnOrder2.getAmount()/100.0));
			}
		}
		// 查询总页数
		Integer totallNum = userWithdrawnOrderService.searchTotallPageNum(userWithdrawnOrder);
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		//查询银行列表
		List<BaseBankInfo> BaseBankInfoList =userWithdrawnOrderService.queryBaseBankInfo(new BaseBankInfo());
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", userWithdrawnOrderList);
		mapValue.put("BaseBankInfoList", BaseBankInfoList);
		return "userWithdrawnOrderHome";
	}
	
	@RequestMapping("/queryUserWithdrawnOrders")
	@ResponseBody
	public Map queryUserWithdrawnOrders(UserWithdrawnOrder userWithdrawnOrder) {
		HashMap dataMap = new HashMap();
		List<UserWithdrawnOrder> userWithdrawnOrderList = userWithdrawnOrderService.searchUserWithdrawnOrderByCondition(userWithdrawnOrder);
		for (UserWithdrawnOrder userWithdrawnOrder2 : userWithdrawnOrderList) {
			if (userWithdrawnOrder2.getApplyTime()!= null) {
				userWithdrawnOrder2.setApplyTimeTow(
						DateFomatUtil.formatDateTime(userWithdrawnOrder2.getApplyTime(), "yyyy-MM-dd HH:mm:ss"));
				userWithdrawnOrder2.setAmountTow((float)(userWithdrawnOrder2.getAmount()/100.0));
			}
		}
		// 查询总页数
		Integer totallNum = userWithdrawnOrderService.searchTotallPageNum(userWithdrawnOrder);
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		//查询银行列表
		List<BaseBankInfo> BaseBankInfoList =userWithdrawnOrderService.queryBaseBankInfo(new BaseBankInfo());
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", userWithdrawnOrderList);
		return dataMap;
	}
	
	
	
	
	@RequestMapping("/userWithdrawnOrderDetail")
	public String userWithdrawnOrderDetail(Integer id,Map<String, Object> mapValue) {
		//根据id查询排序的数据
		UserWithdrawnOrder userWithdrawnOrder = userWithdrawnOrderService.queryUserWithdrawnOrderById(id);
		userWithdrawnOrder.setAmountTow((float)(userWithdrawnOrder.getAmount()/100.0));
		if (userWithdrawnOrder.getApplyTime()!= null) {
			userWithdrawnOrder.setApplyTimeTow(
					DateFomatUtil.formatDateTime(userWithdrawnOrder.getApplyTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		mapValue.put("dataList", userWithdrawnOrder);
		return "userWithdrawnOrderDetail";
	}
    //修改审批状态
	@RequestMapping("/changeAuthState")
	@ResponseBody
	public String changeAuthState(Integer id) {
		UserWithdrawnOrder userWithdrawnOrder = new UserWithdrawnOrder();
		userWithdrawnOrder.setId(Long.valueOf(id));
		userWithdrawnOrder.setAuthState(Byte.valueOf("1"));
		return userWithdrawnOrderService.updateUserWithdrawnOrder(userWithdrawnOrder)>0?"sucess":"false";
	}
	
	
	
	@RequestMapping("/updateUserWithdrawnOrderPath")
	public String updateBetMatchbkPath(Map<String, Object> mapValue, Integer id) throws ParseException {
		UserWithdrawnOrder userWithdrawnOrder = userWithdrawnOrderService.queryUserWithdrawnOrderById(id);
		
		userWithdrawnOrder.setUpdateTimeTow(DateFomatUtil.formatDateTime(userWithdrawnOrder.getUpdateTime()));

		
       		 mapValue.put("dataList", userWithdrawnOrder); 
		return "updateUserWithdrawnOrder";
	}

	@RequestMapping("/updateUserWithdrawnOrder")
	@ResponseBody
	public String updateUserWithdrawnOrder(UserWithdrawnOrder userWithdrawnOrder) {
		 Integer num = userWithdrawnOrderService.updateUserWithdrawnOrderById(userWithdrawnOrder);
		return num>0?"sucess":"false"; 
	}

}
