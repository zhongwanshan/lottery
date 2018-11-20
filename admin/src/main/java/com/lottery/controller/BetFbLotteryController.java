package com.lottery.controller;

import java.sql.Date;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.BetFbLottery;
import com.lottery.service.BetFbLotteryService;
import com.lottery.util.DateFomatUtil;

@Controller
@RequestMapping("/betFbLottery")
public class BetFbLotteryController {

	@Autowired
	BetFbLotteryService betFbLotteryService;
	
	@RequestMapping("/betFbLotteryPath")
	public String homePath(Map<String, Object> mapValue) {
		BetFbLottery betFbLottery = new BetFbLottery();
		betFbLottery.setPageNum(0);
		// 查询默前10条记录
		List<BetFbLottery> betFbLotteryList = betFbLotteryService.searchBetFbLotteryByCondition(betFbLottery);
		for (BetFbLottery betFbLottery2 : betFbLotteryList) {
			betFbLottery2.setCreateTimeTow(DateFomatUtil.formatDateTime(betFbLottery2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLottery2.setLastUpdateTimeTow(
					DateFomatUtil.formatDateTime(betFbLottery2.getLastUpdateTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLottery2
					.setMatchTimeTow(DateFomatUtil.formatDateTime(betFbLottery2.getMatchTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		Integer totallNum = betFbLotteryService.searchBetFbLotteryCountByCondition(betFbLottery);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", betFbLotteryList);
		return "betFbLotteryHome";
	}

	/**
	 * 根据条件查询
	 * 
	 * @param msgTitle
	 * @param pushType
	 * @param sendTtatus
	 * @return
	 */
	@RequestMapping("/searchBetFbLottery")
	@ResponseBody
	public Map searchBetFbLottery(BetFbLottery betFbLottery) {
		Map dataMap = new HashMap<>();
		// 查询默前10条记录
		List<BetFbLottery> betFbLotteryList = betFbLotteryService.searchBetFbLotteryByCondition(betFbLottery);
		for (BetFbLottery betFbLottery2 : betFbLotteryList) {
			betFbLottery2.setCreateTimeTow(DateFomatUtil.formatDateTime(betFbLottery2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLottery2.setLastUpdateTimeTow(
					DateFomatUtil.formatDateTime(betFbLottery2.getLastUpdateTime(), "yyyy-MM-dd HH:mm:ss"));
			betFbLottery2
					.setMatchTimeTow(DateFomatUtil.formatDateTime(betFbLottery2.getMatchTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		Integer totallNum = betFbLotteryService.searchBetFbLotteryCountByCondition(betFbLottery);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", betFbLotteryList);
		return dataMap;
	}

	@RequestMapping("/updateBetFbLotteryPath")
	public String updateBetFbLotteryPath(Map<String, Object> mapValue, Integer id) throws ParseException {
		BetFbLottery betFbLottery = betFbLotteryService.searchBetFbLotteryById(id);
		betFbLottery.setCreateTimeTow(DateFomatUtil.formatDateTime(betFbLottery.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
		betFbLottery.setLastUpdateTimeTow(
				DateFomatUtil.formatDateTime(betFbLottery.getLastUpdateTime(), "yyyy-MM-dd HH:mm:ss"));
		betFbLottery
				.setMatchTimeTow(DateFomatUtil.formatDateTime(betFbLottery.getMatchTime(), "yyyy-MM-dd HH:mm:ss"));
		 mapValue.put("dataList", betFbLottery); 
		return "updateBetFbLottery";
	}

	@RequestMapping("/updateBetFbLottery")
	@ResponseBody
	public String updateBetFbLottery(BetFbLottery betFbLottery) {
		 Integer num = betFbLotteryService.updateBetFbLottery(betFbLottery); 
		return num>0?"sucess":"false"; 
	}

}
