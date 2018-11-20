package com.lottery.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.TblBasePushMsg;
import com.lottery.service.TblBasePushMsgService;
import com.lottery.util.DateFomatUtil;

@Controller
@RequestMapping("/basePushMsg")
public class BasePushMsgController {

	@Autowired
	TblBasePushMsgService tblBasePushMsgService;

	@RequestMapping("/home")
	public String homePath2() {
		return "home2";
	}

	@RequestMapping("/basePushMsgPath")
	public String homePath(Map<String, Object> mapValue) {
		// 查询默认按id排序的数据
		List<TblBasePushMsg> tblBasePushMsgList = tblBasePushMsgService.searchMessagesByCondition("", 4, 4, 0);
		for (TblBasePushMsg tblBasePushMsg : tblBasePushMsgList) {
			if (tblBasePushMsg.getRegTime() != null) {
				tblBasePushMsg.setRegTimeTow(
						DateFomatUtil.formatDateTime(tblBasePushMsg.getRegTime(), "yyyy-MM-dd HH:mm:ss"));
			}
			if (tblBasePushMsg.getPlanBeginTime() != null) {
				tblBasePushMsg.setPlanBeginTimeTow(
						DateFomatUtil.formatDateTime(tblBasePushMsg.getPlanBeginTime(), "yyyy-MM-dd HH:mm:ss"));
			}
			if (tblBasePushMsg.getSendBeginTime() != null) {
				tblBasePushMsg.setSendBeginTow(
						DateFomatUtil.formatDateTime(tblBasePushMsg.getSendBeginTime(), "yyyy-MM-dd HH:mm:ss"));
			}
			if (tblBasePushMsg.getSendEndTime() != null) {
				tblBasePushMsg.setSendEndTimeTow(
						DateFomatUtil.formatDateTime(tblBasePushMsg.getSendEndTime(), "yyyy-MM-dd HH:mm:ss"));
			}
		}
		Integer totallNum = tblBasePushMsgService.searchTotallPageNum("", 4, 4, 0);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		mapValue.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		mapValue.put("dataList", tblBasePushMsgList);
		return "basePushMsgHome";
	}

	@RequestMapping("/addbasePushMsgPath")
	public String addMessagePath() {
		return "addBasePushMsg";
	}

	@RequestMapping("/updateUserPath")
	public String updateMessagePath(Integer id) {
		return "updateUser";
	}

	@RequestMapping("/messageDetailPath")
	public String messageDetailPath() {
		return "messageDetail";
	}

	/**
	 * 根据条件查询message数据
	 * 
	 * @param msgTitle
	 * @param pushType
	 * @param sendTtatus
	 * @return
	 */
	@RequestMapping("/searchBasePushMsgMessage")
	@ResponseBody
	public Map searchMessages(String msgTitle, Integer pushType, Integer sendStatus, Integer pageNum) {
		Map dataMap = new HashMap<>();
		List<TblBasePushMsg> tblBasePushMsgList = tblBasePushMsgService.searchMessagesByCondition(msgTitle, pushType,
				sendStatus, pageNum);
		Integer totallNum = tblBasePushMsgService.searchTotallPageNum(msgTitle, pushType, sendStatus, pageNum);
		// 查询总页数
		String totallNumTOW = String.valueOf(Math.ceil(Double.valueOf(totallNum) / 10.0));
		dataMap.put("totallNum", totallNumTOW.substring(0, totallNumTOW.indexOf(".")).equals("0") ? "1"
				: totallNumTOW.substring(0, totallNumTOW.indexOf(".")));
		dataMap.put("dataList", tblBasePushMsgList);
		return dataMap;
	}

	/**
	 * 消息新增
	 * 
	 * @param TblBasePushMsg
	 * @return
	 */
	@RequestMapping("/addTblBasePushMsg")
	@ResponseBody
	public String addTblBasePushMsg(TblBasePushMsg tblBasePushMsg) {
		tblBasePushMsg.setSendStatus(0);
		tblBasePushMsg.setMsgType(0);
		tblBasePushMsg.setRegTime(new Date());
		tblBasePushMsg.setSendUser("admin");
		return tblBasePushMsgService.saveTblBasePushMsg(tblBasePushMsg) > 0 ? "sucess" : "false";
	}

	/**
	 * 保存修改休息
	 * 
	 * @param TblBasePushMsg
	 * @return
	 */
	@RequestMapping("/saveTblBasePushMsg")
	@ResponseBody
	public String updateTblBasePushMsg(TblBasePushMsg tblBasePushMsg) {
		tblBasePushMsg.setSendStatus(0);
		tblBasePushMsg.setMsgType(0);
		/*tblBasePushMsg.setRegTime(new Date(DateFomatUtil.formatDateTime(new Date(), "yyyy-MM-dd HH:mm:ss")));*/
		tblBasePushMsg.setSendUser("admin");
		return tblBasePushMsgService.updateTblBasePushMsg(tblBasePushMsg) > 0 ? "sucess" : "false";
	}

	/**
	 * 消息修改
	 * 
	 * @param TblBasePushMsg
	 * @return
	 */
	@RequestMapping("/updateBasePushMsg")
	public String updateBasePushMsg(Map<String, Object> mapValue, Integer id) {
		TblBasePushMsg tblBasePushMsg = tblBasePushMsgService.queryBasePushMsgById(id);
		tblBasePushMsg.setSendUser(DateFomatUtil.formatDateTime(tblBasePushMsg.getPlanBeginTime()));
		mapValue.put("dataList", tblBasePushMsg);
		return "updateBasePushMsg";
	}

	/**
	 * 消息删除
	 * 
	 * @param TblBasePushMsg
	 * @return
	 */
	@RequestMapping("/deletebasePushMsgById")
	@ResponseBody
	public String deletebasePushMsgById(Integer id) {

		return tblBasePushMsgService.deletebasePushMsgById(id) > 0 ? "sucess" : "false";
	}

	/**
	 * 消息详情
	 * 
	 * @param TblBasePushMsg
	 * @return
	 */

	@RequestMapping("/basePushMsgDetail")
	public String basePushMsgDetail(Map<String, Object> mapValue, Integer id) {
		TblBasePushMsg tblBasePushMsg = tblBasePushMsgService.queryBasePushMsgById(id);
		if (tblBasePushMsg.getPlanBeginTime() != null) {
			tblBasePushMsg.setPlanBeginTimeTow(
					DateFomatUtil.formatDateTime(tblBasePushMsg.getPlanBeginTime(), "yyyy-MM-dd HH:mm:ss"));
		}
		mapValue.put("dataList", tblBasePushMsg);
		return "basePushMsgDetail";
	}

}
