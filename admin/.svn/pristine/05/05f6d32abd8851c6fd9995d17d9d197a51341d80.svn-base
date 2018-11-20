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

import com.lottery.entity.BetMatchbk;
import com.lottery.service.BetMatchbkService;
import com.lottery.util.DateFomatUtil;

@Controller
@RequestMapping("/betMatchbk")
public class BetMatchbkController {

	@Autowired
	BetMatchbkService betMatchbkService;
	
	@RequestMapping("/betMatchbkPath")
	public String homePath(Map<String, Object> mapValue) {
		BetMatchbk betMatchbk = new BetMatchbk();
		betMatchbk.setPageNum(0);
		// 查询默前10条记录
		List<BetMatchbk> betMatchbkList = betMatchbkService.searchBetMatchbkByCondition(betMatchbk);
		for (BetMatchbk betMatchbk2 : betMatchbkList) {
			betMatchbk2.setDtimeTow(DateFomatUtil.formatDateTime(betMatchbk2.getDtime(), "yyyy-MM-dd HH:mm:ss"));
			betMatchbk2.setmMatchtimeTow(betMatchbk2.getmMatchtime());
			betMatchbk2.setLastUpdateTimeTow(
					DateFomatUtil.formatDateTime(betMatchbk2.getLastUpdateTime(), "yyyy-MM-dd HH:mm:ss"));
			betMatchbk2
					.setCreateTimeTow(DateFomatUtil.formatDateTime(betMatchbk2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		Integer totallNum = betMatchbkService.searchBetMatchbkCountByCondition(betMatchbk);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", betMatchbkList);
		return "betMatchbkHome";
	}

	/**
	 * 根据条件查询
	 * 
	 * @param msgTitle
	 * @param pushType
	 * @param sendTtatus
	 * @return
	 */
	@RequestMapping("/searchBetMatchbk")
	@ResponseBody
	public Map searchBetMatchbk(BetMatchbk betMatchbk) {
		Map dataMap = new HashMap<>();
		// 查询默前10条记录
		// 查询默前10条记录
		List<BetMatchbk> betMatchbkList = betMatchbkService.searchBetMatchbkByCondition(betMatchbk);
		for (BetMatchbk betMatchbk2 : betMatchbkList) {
			betMatchbk2.setDtimeTow(DateFomatUtil.formatDateTime(betMatchbk2.getDtime(), "yyyy-MM-dd HH:mm:ss"));
			betMatchbk2.setmMatchtimeTow(betMatchbk2.getmMatchtime());
			betMatchbk2.setLastUpdateTimeTow(
					DateFomatUtil.formatDateTime(betMatchbk2.getLastUpdateTime(), "yyyy-MM-dd HH:mm:ss"));
			betMatchbk2
					.setCreateTimeTow(DateFomatUtil.formatDateTime(betMatchbk2.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		Integer totallNum = betMatchbkService.searchBetMatchbkCountByCondition(betMatchbk);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", betMatchbkList);
		return dataMap;
	}

	@RequestMapping("/updateBetMatchbkPath")
	public String updateBetMatchbkPath(Map<String, Object> mapValue, Integer id) throws ParseException {
		BetMatchbk betMatchbk = betMatchbkService.searchBetMatchbkById(id);
		betMatchbk.setDtimeTow(DateFomatUtil.formatDateTime(betMatchbk.getDtime(), "yyyy-MM-dd HH:mm:ss"));
		betMatchbk.setmMatchtimeTow(DateFomatUtil.formatDateTime(DateFomatUtil.formatDateTime(betMatchbk.getmMatchtime(), "yyyy-MM-dd HH:mm:ss")));
		betMatchbk.setLastUpdateTimeTow(DateFomatUtil.formatDateTime(betMatchbk.getLastUpdateTime()));
		betMatchbk.setCreateTimeTow(DateFomatUtil.formatDateTime(betMatchbk.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
		 mapValue.put("dataList", betMatchbk); 
		return "updateBetMatchbk";
	}

	@RequestMapping("/updateBetMatchbk")
	@ResponseBody
	public String updateBetMatchbk(BetMatchbk betMatchbk) {
		 Integer num = betMatchbkService.updateBetMatchbk(betMatchbk); 
		return num>0?"sucess":"false"; 
	}

}
