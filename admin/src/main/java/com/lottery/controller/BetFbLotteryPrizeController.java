package com.lottery.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.BetFbLotteryPrize;
import com.lottery.entity.TblBasePushMsg;
import com.lottery.service.BetFbLotteryPrizeService;
import com.lottery.util.DateFomatUtil;

@Controller
@RequestMapping("/betFbLotteryPrize")
public class BetFbLotteryPrizeController {

	@Autowired
	BetFbLotteryPrizeService betFbLotteryPrizeService;

	@RequestMapping("/betFbLotteryPrizePath")
	public String homePath(Map<String, Object> mapValue) {
		BetFbLotteryPrize betFbLotteryPrize = new BetFbLotteryPrize();
		// 查询默前10条记录
		List<BetFbLotteryPrize> betFbLotteryList =betFbLotteryPrizeService.searchBetFbLotteryByCondition(betFbLotteryPrize);
				betFbLotteryPrize.setPageNum(0);
		List<BetFbLotteryPrize> betFbLotteryPrizeList =betFbLotteryPrizeService.searchBetFbLotteryPrizeByCondition(betFbLotteryPrize);
		for (BetFbLotteryPrize betFbLotteryPrize2 : betFbLotteryPrizeList) {
			betFbLotteryPrize2.setBeginSaleTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getBeginSaleTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLotteryPrize2.setStopTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getStopTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLotteryPrize2.setOpenTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getOpenTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLotteryPrize2.setCreateTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLotteryPrize2.setUpateTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getUpateTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		Integer totallNum =betFbLotteryPrizeService.searchBetFbLotteryPrizeCountByCondition(betFbLotteryPrize);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", betFbLotteryPrizeList);
		mapValue.put("betFbLotteryList", betFbLotteryList);
		return "betFbLotteryPrizeHome";
	}

	/**
	 * 根据条件查询
	 * 
	 * @param msgTitle
	 * @param pushType
	 * @param sendTtatus
	 * @return
	 */
	@RequestMapping("/searchBetFbLotteryPrize")
	@ResponseBody
	public Map searchBetFbLotteryPrize(BetFbLotteryPrize betFbLotteryPrize) {
		Map dataMap = new HashMap<>();
		// 查询默前10条记录
		List<BetFbLotteryPrize> betFbLotteryList =betFbLotteryPrizeService.searchBetFbLotteryByCondition(betFbLotteryPrize);
		List<BetFbLotteryPrize> betFbLotteryPrizeList =betFbLotteryPrizeService.searchBetFbLotteryPrizeByCondition(betFbLotteryPrize);
		Integer totallNum =betFbLotteryPrizeService.searchBetFbLotteryPrizeCountByCondition(betFbLotteryPrize);
		for (BetFbLotteryPrize betFbLotteryPrize2 : betFbLotteryPrizeList) {
			betFbLotteryPrize2.setBeginSaleTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getBeginSaleTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLotteryPrize2.setStopTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getStopTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLotteryPrize2.setOpenTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getOpenTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLotteryPrize2.setCreateTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLotteryPrize2.setUpateTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getUpateTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", betFbLotteryPrizeList);
		dataMap.put("betFbLotteryList", betFbLotteryList);
		return dataMap;
	}
	/**
	 * 保存更新记录
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping("/updateBetFbLotteryPrize")
	@ResponseBody
	public String updateBbetFbLotteryPrize(BetFbLotteryPrize betFbLotteryPrize) {
	return betFbLotteryPrizeService.updateBetFbLotteryPrize(betFbLotteryPrize)>0?"sucess":"false";
	}

	/**
	 * 更新数据
	 * @param mapValue
	 * @return
	 */
	@RequestMapping("/updateBetFbLotteryPrizePath")
	public String updateBetFbLotteryPrizePath(Map<String, Object> mapValue,Integer id) {
		BetFbLotteryPrize betFbLotteryPrize =betFbLotteryPrizeService.searchBetFbLotteryById(id);
		betFbLotteryPrize.setBeginSaleTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize.getBeginSaleTime()));
		betFbLotteryPrize.setCreateTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize.getCreateTime()));
		betFbLotteryPrize.setOpenTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize.getOpenTime()));
		betFbLotteryPrize.setStopTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize.getStopTime()));	
		betFbLotteryPrize.setUpateTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize.getUpateTime()));
		mapValue.put("dataList", betFbLotteryPrize);
		return "updateBetFbLotteryPrize";
	}
	
	
	
	/**
	 * 新增页面跳转
	 * @param mapValue
	 * @return
	 */
	@RequestMapping("/addBetFbLotteryPrizePath")
	public String addBetFbLotteryPrizePath() {
		return "addBetFbLotteryPrize";
	}
	
	/**
	 * 新增
	 * @param mapValue
	 * @return
	 */
	@RequestMapping("/addBetFbLotteryPrize")
	@ResponseBody
	public String addBetFbLotteryPrize(BetFbLotteryPrize betFbLotteryPrize) {
		System.out.println();
		return betFbLotteryPrizeService.addBetFbLotteryPrize(betFbLotteryPrize)>0?"sucess":"false";
	}
	
	
	
	
	/**
	 * 更新数据
	 * @param mapValue
	 * @return
	 */
	@RequestMapping("/betFbLotteryPrizeDetailPath")
	public String betFbLotteryPrizeDetailPath(Map<String, Object> mapValue,Integer id) {
		BetFbLotteryPrize betFbLotteryPrize2 =betFbLotteryPrizeService.searchBetFbLotteryById(id);
		betFbLotteryPrize2.setBeginSaleTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getBeginSaleTime(), "yyyy-MM-dd HH:mm:ss"));
		betFbLotteryPrize2.setStopTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getStopTime(), "yyyy-MM-dd HH:mm:ss"));
		betFbLotteryPrize2.setOpenTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getOpenTime(), "yyyy-MM-dd HH:mm:ss"));
		betFbLotteryPrize2.setCreateTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
		betFbLotteryPrize2.setUpateTimeTow(DateFomatUtil.formatDateTime(betFbLotteryPrize2.getUpateTime(), "yyyy-MM-dd HH:mm:ss"));
		mapValue.put("dataList", betFbLotteryPrize2);
		return "betFbLotteryPrizeDetail";
	}



}
