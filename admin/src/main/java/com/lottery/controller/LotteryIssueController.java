package com.lottery.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.LotteryIssue;
import com.lottery.entity.LotteryOrderRoute;
import com.lottery.service.LotteryIssueService;
import com.lottery.service.UserBaseInfoService;
import com.lottery.util.DateFomatUtil;

@Controller
@RequestMapping("/lotteryIssue")
public class LotteryIssueController {

	@Autowired
	LotteryIssueService lotteryIssueService;
	@Autowired
	UserBaseInfoService userBaseInfoService;

	@RequestMapping("/lotteryIssuePath")
	public String homePath(Map<String, Object> mapValue) {
		LotteryIssue lotteryIssue = new LotteryIssue();
		lotteryIssue.setPageNum(0);
		// 查询默前10条记录
		List<LotteryIssue> lotteryIssueList = lotteryIssueService.searchLotteryIssueByCondition(lotteryIssue);
		for (LotteryIssue lotteryIssue2 : lotteryIssueList) {
			lotteryIssue2
					.setStopTimeTow(DateFomatUtil.formatDateTime(lotteryIssue2.getStopTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryIssue2.setCreateTimeTow(
					DateFomatUtil.formatDateTime(lotteryIssue2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryIssue2
					.setOpenTimeTow(DateFomatUtil.formatDateTime(lotteryIssue2.getOpenTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryIssue2.setLastModifyTimeTow(
					DateFomatUtil.formatDateTime(lotteryIssue2.getLastModifyTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		Integer totallNum = lotteryIssueService.searchLotteryIssueCountByCondition(lotteryIssue);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", lotteryIssueList);
		return "lotteryIssueHome";
	}

	/**
	 * 根据条件查询
	 * 
	 * @param msgTitle
	 * @param pushType
	 * @param sendTtatus
	 * @return
	 */
	@RequestMapping("/searchLotteryIssue")
	@ResponseBody
	public Map searchLotteryIssue(LotteryIssue lotteryIssue) {
		Map dataMap = new HashMap<>();
		// 查询默前10条记录
		List<LotteryIssue> lotteryIssueList = lotteryIssueService.searchLotteryIssueByCondition(lotteryIssue);
		for (LotteryIssue lotteryIssue2 : lotteryIssueList) {
			lotteryIssue2
					.setStopTimeTow(DateFomatUtil.formatDateTime(lotteryIssue2.getStopTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryIssue2.setCreateTimeTow(
					DateFomatUtil.formatDateTime(lotteryIssue2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryIssue2
					.setOpenTimeTow(DateFomatUtil.formatDateTime(lotteryIssue2.getOpenTime(), "yyyy-MM-dd HH:mm:ss"));
			lotteryIssue2.setLastModifyTimeTow(
					DateFomatUtil.formatDateTime(lotteryIssue2.getLastModifyTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		Integer totallNum = lotteryIssueService.searchLotteryIssueCountByCondition(lotteryIssue);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", lotteryIssueList);
		return dataMap;
	}

	@RequestMapping("/updatelotteryIssuePath")
	public String updatelotteryIssuePath(Map<String, Object> mapValue, Integer id) {
		LotteryIssue lotteryIssue = lotteryIssueService.searchLotteryIssueById(id);

		lotteryIssue.setStopTimeTow(DateFomatUtil.formatDateTime(lotteryIssue.getStopTime()));
		lotteryIssue
				.setCreateTimeTow(DateFomatUtil.formatDateTime(lotteryIssue.getCreateTime()));
		lotteryIssue.setOpenTimeTow(DateFomatUtil.formatDateTime(lotteryIssue.getOpenTime()));
		lotteryIssue.setLastModifyTimeTow(
				DateFomatUtil.formatDateTime(lotteryIssue.getLastModifyTime()));

		mapValue.put("dataList", lotteryIssue);
		return "updatelotteryIssue";
	}
	
	
	@RequestMapping("/updatelotteryIssue")
	@ResponseBody
	public String updatelotteryIssue(LotteryIssue lotteryIssue) {
		Integer num = lotteryIssueService.updateLotteryIssue(lotteryIssue);
		return num>0?"sucess":"false";
	}

}
