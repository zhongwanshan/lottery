package com.lottery.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.LotteryOrderRoute;
import com.lottery.entity.LotteryOrderRouteShop;
import com.lottery.entity.UserBaseInfo;
import com.lottery.service.LotteryOrderRouteService;
import com.lottery.service.UserBaseInfoService;

@Controller
@RequestMapping("/lotteryOrderRoute")
public class LotteryOrderRouteController {

	@Autowired
	LotteryOrderRouteService lotteryOrderRouteService;

	@Autowired
	UserBaseInfoService userBaseInfoService;

	@RequestMapping("/lotteryOrderRoutePath")
	public String homePath(Map<String, Object> mapValue) {
		LotteryOrderRoute lotteryOrderRoute = new LotteryOrderRoute();
		lotteryOrderRoute.setPageNum(0);
		// 查询默前10条记录
		List<LotteryOrderRoute> lotteryOrderRouteList =lotteryOrderRouteService.searchLotteryOrderRouteByCondition(lotteryOrderRoute);
		for (LotteryOrderRoute lotteryOrderRoute2 : lotteryOrderRouteList) {
			lotteryOrderRoute2.setSelectShopNum("选择店主("+lotteryOrderRoute2.getLottoTypeId()+")");
		}
		Integer totallNum =lotteryOrderRouteService.searchLotteryOrderRouteCountByCondition(lotteryOrderRoute);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", lotteryOrderRouteList);
		return "lotteryOrderRouteHome";
	}

	/**
	 * 根据条件查询
	 * 
	 * @param msgTitle
	 * @param pushType
	 * @param sendTtatus
	 * @return
	 */
	@RequestMapping("/searchLotteryOrderRoute")
	@ResponseBody
	public Map searchBetFbLotteryPrize(LotteryOrderRoute lotteryOrderRoute) {
		Map dataMap = new HashMap<>();
		// 查询默数据记录
		List<LotteryOrderRoute> lotteryOrderRouteList =lotteryOrderRouteService.searchLotteryOrderRouteByCondition(lotteryOrderRoute);
		for (LotteryOrderRoute lotteryOrderRoute2 : lotteryOrderRouteList) {
			lotteryOrderRoute2.setSelectShopNum("选择店主("+lotteryOrderRoute2.getLottoTypeId()+")");
		}
		Integer totallNum =lotteryOrderRouteService.searchLotteryOrderRouteCountByCondition(lotteryOrderRoute);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", lotteryOrderRouteList);
		return dataMap;
	}
	/**
	 * 新增规则记录
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping("/addLotteryOrderRoute")
	@ResponseBody
	public String addLotteryOrderRoute(Map<String, Object> mapValue,LotteryOrderRoute lotteryOrderRoute) {
		lotteryOrderRoute.setCrateTime(new Date());
		if (lotteryOrderRoute.getLottoTypeId().equals(1)) {
			lotteryOrderRoute.setLottoTypeName("体彩");
		}else {
			lotteryOrderRoute.setLottoTypeName("福彩");
		}
	return lotteryOrderRouteService.saveLotteryOrderRoute(lotteryOrderRoute)>0?"sucess":"false";
	}

	/**
	 * 跟新规则记录
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping("/updateLotteryOrderRoute")
	@ResponseBody
	public String updateLotteryOrderRoute(Map<String, Object> mapValue,LotteryOrderRoute lotteryOrderRoute) {
	return lotteryOrderRouteService.updateLotteryOrderRoute(lotteryOrderRoute)>0?"sucess":"false";
	}
	
	
	
	/**
	 * 跟新规则记录
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping("/changeLotteryOrderRouteStatus")
	@ResponseBody
	public String changeLotteryOrderRouteStatus(LotteryOrderRoute lotteryOrderRoute) {
	return lotteryOrderRouteService.changeLotteryOrderRouteStatus(lotteryOrderRoute)>0?"sucess":"false";
	}
	
	@RequestMapping("/addLotteryOrderRoutePath")
	public String addLotteryOrderRoutePath(Map<String, Object> mapValue ) {
		List<UserBaseInfo> userBaseInfoList= userBaseInfoService.searchLotteryShopUserByConditionLimit( new UserBaseInfo());
	/*	for (UserBaseInfo userBaseInfo2 : userBaseInfoList) {
			userBaseInfo2.setCityName(userBaseInfo2.getProvinceName()+""+userBaseInfo2.getCityName()+""+userBaseInfo2.getDistrictName());
		}*/
		mapValue.put("dataList", userBaseInfoList);
		return "addLotteryOrderRoute";
	}	
	
	
	@RequestMapping("/searchLotteryOrderRoutePath")
	public String searchLotteryOrderRoutePath(Map<String, Object> mapValue,Integer id) {
		//根据id查询路由记录
		LotteryOrderRoute lotteryOrderRoute =lotteryOrderRouteService.searchLotteryOrderRouteById(id);
		List<UserBaseInfo> userBaseInfoList2 = new ArrayList<UserBaseInfo>();
		List<UserBaseInfo> userBaseInfoList= userBaseInfoService.searchLotteryShopUserByConditionLimit(new UserBaseInfo());
		List<LotteryOrderRouteShop> lotteryOrderRouteShopList =lotteryOrderRouteService.queryLotteryOrderRouteShopList(id);
		for (UserBaseInfo userBaseInfo2 : userBaseInfoList) {
			/*userBaseInfo2.setCityName(userBaseInfo2.getProvinceName()+""+userBaseInfo2.getCityName()+""+userBaseInfo2.getDistrictName());*/
			for (LotteryOrderRouteShop lotteryOrderRouteShop : lotteryOrderRouteShopList) {
				if(lotteryOrderRouteShop.getShopId().equals(userBaseInfo2.getId())) {
					userBaseInfoList2.add(userBaseInfo2);
				}
			}
		}
		mapValue.put("dataList", userBaseInfoList2);
		mapValue.put("lotteryOrderRoute", lotteryOrderRoute);
		return "searchLotteryOrderRoute";
	}
	
	
	
	@RequestMapping("/updateLotteryOrderRoutePath")
	public String updateLotteryOrderRoutePath(Map<String, Object> mapValue,Integer id) {
		//根据id查询路由记录
		LotteryOrderRoute lotteryOrderRoute =lotteryOrderRouteService.searchLotteryOrderRouteById(id);
		List<UserBaseInfo> userBaseInfoList= userBaseInfoService.searchLotteryShopUserByConditionLimit(new UserBaseInfo());
		List<LotteryOrderRouteShop> lotteryOrderRouteShopList =lotteryOrderRouteService.queryLotteryOrderRouteShopList(id);
		for (UserBaseInfo userBaseInfo2 : userBaseInfoList) {
			/*userBaseInfo2.setCityName(userBaseInfo2.getProvinceName()+""+userBaseInfo2.getCityName()+""+userBaseInfo2.getDistrictName());*/
			for (LotteryOrderRouteShop lotteryOrderRouteShop : lotteryOrderRouteShopList) {
				if(lotteryOrderRouteShop.getShopId().equals(userBaseInfo2.getId())) {
					userBaseInfo2.setCheckRemall(1);
				}
			}
		}
		mapValue.put("dataList", userBaseInfoList);
		mapValue.put("lotteryOrderRoute", lotteryOrderRoute);
		return "updateLotteryOrderRoute";
	}	
	
	
	
	/*
	 * 分配彩票店主
	 */
	@RequestMapping("/selectLotteyShopPath")
	public String selectLotteyShopPath(Map<String, Object> mapValue,Integer id) {
		UserBaseInfo userBaseInfo = new UserBaseInfo();
		userBaseInfo.setPageNum(0);
		// 查询默前10条记录
		List<UserBaseInfo> userBaseInfoList= userBaseInfoService.searchLotteryShopUserByConditionLimit(userBaseInfo);
		List<LotteryOrderRouteShop> lotteryOrderRouteShopList =lotteryOrderRouteService.queryLotteryOrderRouteShopList(id);
		for (UserBaseInfo userBaseInfo2 : userBaseInfoList) {
/*			userBaseInfo2.setCityName(userBaseInfo2.getProvinceName()+""+userBaseInfo2.getCityName()+""+userBaseInfo2.getDistrictName());*/
			for (LotteryOrderRouteShop lotteryOrderRouteShop : lotteryOrderRouteShopList) {
				if(lotteryOrderRouteShop.getShopId().equals(userBaseInfo2.getId())) {
					userBaseInfo2.setCheckRemall(1);
				}
			}
		}
		mapValue.put("dataList", userBaseInfoList);
		mapValue.put("id", id);
		return "selectLotteyShop";
	}	
	
	
	
	/*
	 * 查询彩票店主
	 */
	@RequestMapping("/queryLotteyShopList")
	@ResponseBody
	public Map queryLotteyShopList(UserBaseInfo userBaseInfo) {
		Map dataMap = new HashMap<>();
		// 查询默前10条记录
		List<UserBaseInfo> userBaseInfoList= userBaseInfoService.searchLotteryShopUserByConditionLimit(userBaseInfo);
	/*	for (UserBaseInfo userBaseInfo2 : userBaseInfoList) {
			userBaseInfo2.setCityName(userBaseInfo2.getProvinceName()+""+userBaseInfo2.getCityName()+""+userBaseInfo2.getDistrictName());
		}
		*/
		dataMap.put("dataList", userBaseInfoList);
		return dataMap;
	}
	
	
	
	/*
	 * 根据id查询彩票店主列表
	 */
	@RequestMapping("/queryLotteyShopListByIdList")
	@ResponseBody
	public Map queryLotteyShopListByIdList(UserBaseInfo userBaseInfo) {
		Map dataMap = new HashMap<>();
		String[] idList =userBaseInfo.getCityName().split(",");
		List<Long> idListTow = new ArrayList<Long>();
		for (String string : idList) {
			idListTow.add(Long.valueOf(string));
		}
		userBaseInfo.setIdList(idListTow);
		// 查询默前10条记录
		List<UserBaseInfo> userBaseInfoList= userBaseInfoService.searchLotteryShopUserByConditionLimit(userBaseInfo);
	/*	for (UserBaseInfo userBaseInfo2 : userBaseInfoList) {
			userBaseInfo2.setCityName(userBaseInfo2.getProvinceName()+""+userBaseInfo2.getCityName()+""+userBaseInfo2.getDistrictName());
		}*/
		Integer totallNum =userBaseInfoService.searchLotteryShopUserCountByConditionLimit(userBaseInfo);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", userBaseInfoList);
		return dataMap;
	}
	
	
	
	/**
	 * 跟新选择用户
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping("/addLotteryUser")
	@ResponseBody
	public String addLotteryUser(Integer id,String lotteryShopIds) {
	return lotteryOrderRouteService.saveLotteryUser(id,lotteryShopIds)>0?"sucess":"false";
	}
	
	
	
	
	
	


}
