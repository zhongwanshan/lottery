package com.lottery.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.TblBasePushMsg;
import com.lottery.service.TblBasePushMsgService;

@Controller
@RequestMapping("/message")
public class MessageController {
	
	@Autowired
	TblBasePushMsgService tblBasePushMsgService;
	
	@RequestMapping("/homePath")
	public String homePath(){
	  return "home";
	}
	@RequestMapping("/addMessagePath")
	public String addMessagePath(){
	  return "addMessage";
	}
	@RequestMapping("/updateUserPath")
	public String updateMessagePath(Integer id){
	  return "updateUser";
	}
	@RequestMapping("/messageDetailPath")
	public String messageDetailPath(){
	  return "messageDetail";
	}
	
	@RequestMapping("/messageListPath")
	public String messageListPath(Map<String, Object> mapValue){
	  //查询默认按id排序的数据
     List<TblBasePushMsg> tblBasePushMsgList  =tblBasePushMsgService.searchMessagesByCondition("", 4, 4,0);
     Integer totallNum = tblBasePushMsgService.searchTotallPageNum("", 4, 4,0);
     //查询总页数
      mapValue.put("totallNum", totallNum/10);
      mapValue.put("dataList", tblBasePushMsgList); 		
	  return "messageList";
	}
	
	/**
	 * 根据条件查询message数据
	 * @param msgTitle
	 * @param pushType
	 * @param sendTtatus
	 * @return
	 */
	@RequestMapping("/searchMessage")
	@ResponseBody
	public List<TblBasePushMsg> searchMessages(String msgTitle,Integer pushType,Integer sendTtatus,Integer pageNum){
		List<TblBasePushMsg> tblBasePushMsgList  =tblBasePushMsgService.searchMessagesByCondition(msgTitle, pushType, sendTtatus,pageNum);
	  return tblBasePushMsgList;
	}
	/**
	 * 消息新增
	 * @param TblBasePushMsg
	 * @return
	 */
	@RequestMapping("/addMessages")
	@ResponseBody
	public List<TblBasePushMsg> addMessages(TblBasePushMsg TblBasePushMsg){
		
	 
	  return null;
	}
	/**
	 * 消息修改
	 * @param TblBasePushMsg
	 * @return
	 */
	@RequestMapping("/updateMessages")
	@ResponseBody
	public List<TblBasePushMsg> updateMessages(TblBasePushMsg TblBasePushMsg){
		
	 
	  return null;
	}
	/**
	 * 消息详情
	 * @param TblBasePushMsg
	 * @return
	 */
	
	@RequestMapping("/messagesDetail")
	@ResponseBody
	public List<TblBasePushMsg> messagesDetail(TblBasePushMsg TblBasePushMsg){
		
	 
	  return null;
	}

}
