package com.lottery.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.BetMatchfb;
import com.lottery.service.BetMatchfbService;
import com.lottery.service.UserBaseInfoService;
import com.lottery.util.DateFomatUtil;

@Controller
@RequestMapping("/betMatchfb")
public class BetMatchfbController {

	@Autowired
	BetMatchfbService betMatchfbService;
	
	@RequestMapping("/betMatchfbPath")
	public String homePath(Map<String, Object> mapValue) {
		BetMatchfb betMatchfb = new BetMatchfb();
		betMatchfb.setPageNum(0);
		// 查询默前10条记录
		List<BetMatchfb> betMatchfbList = betMatchfbService.searchBetMatchfbByCondition(betMatchfb);
		for (BetMatchfb betMatchfb2 : betMatchfbList) {
			betMatchfb2.setmTimeTow(DateFomatUtil.formatDateTime(betMatchfb2.getmTime(), "yyyy-MM-dd HH:mm:ss"));
			betMatchfb2.setdTimeTow(DateFomatUtil.formatDateTime(betMatchfb2.getdTime(), "yyyy-MM-dd HH:mm:ss"));
			betMatchfb2.setLastUpdateTimeTow(
					DateFomatUtil.formatDateTime(betMatchfb2.getLastUpdateTime(), "yyyy-MM-dd HH:mm:ss"));
			betMatchfb2
					.setCreateTimeTow(DateFomatUtil.formatDateTime(betMatchfb2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		Integer totallNum = betMatchfbService.searchBetMatchfbCountByCondition(betMatchfb);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", betMatchfbList);
		return "betMatchfbHome";
	}

	/**
	 * 根据条件查询
	 * 
	 * @param msgTitle
	 * @param pushType
	 * @param sendTtatus
	 * @return
	 */
	@RequestMapping("/searchBetMatchfb")
	@ResponseBody
	public Map searchBetMatchfb(BetMatchfb betMatchfb) {
		Map dataMap = new HashMap<>();
		// 查询默前10条记录
		List<BetMatchfb> betMatchfbList = betMatchfbService.searchBetMatchfbByCondition(betMatchfb);
		for (BetMatchfb betMatchfb2 : betMatchfbList) {
			betMatchfb2.setmTimeTow(DateFomatUtil.formatDateTime(betMatchfb2.getmTime(), "yyyy-MM-dd HH:mm:ss"));
			betMatchfb2.setdTimeTow(DateFomatUtil.formatDateTime(betMatchfb2.getdTime(), "yyyy-MM-dd HH:mm:ss"));
			betMatchfb2.setLastUpdateTimeTow(
					DateFomatUtil.formatDateTime(betMatchfb2.getLastUpdateTime(), "yyyy-MM-dd HH:mm:ss"));
			betMatchfb2
					.setCreateTimeTow(DateFomatUtil.formatDateTime(betMatchfb2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		Integer totallNum = betMatchfbService.searchBetMatchfbCountByCondition(betMatchfb);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", betMatchfbList);
		return dataMap;
	}

	@RequestMapping("/updateBetMatchfbPath")
	public String updateBetMatchfbPath(Map<String, Object> mapValue, Integer id) {
		BetMatchfb betMatchfb = betMatchfbService.searchBetMatchfbById(id);
		betMatchfb.setmTimeTow(DateFomatUtil.formatDateTime(betMatchfb.getmTime(), "yyyy-MM-dd HH:mm:ss"));
		betMatchfb.setdTimeTow(DateFomatUtil.formatDateTime(betMatchfb.getdTime()));
		betMatchfb.setLastUpdateTimeTow(DateFomatUtil.formatDateTime(betMatchfb.getLastUpdateTime()));
		betMatchfb.setCreateTimeTow(DateFomatUtil.formatDateTime(betMatchfb.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
		 mapValue.put("dataList", betMatchfb); 
		return "updateBetMatchfb";
	}

	@RequestMapping("/updateBetMatchfb")
	@ResponseBody
	public String updateBetMatchfb(BetMatchfb betMatchfb) {
		 Integer num = betMatchfbService.updateBetMatchfb(betMatchfb); 
		return num>0?"sucess":"false"; 
	}

}
