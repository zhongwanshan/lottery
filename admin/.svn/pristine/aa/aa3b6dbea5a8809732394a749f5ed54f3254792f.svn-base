package com.lottery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lottery.entity.TblBasePushMsg;

public interface TblBasePushMsgService {
	
	//根据条件查询最新10条数据
	public List<TblBasePushMsg> searchMessagesByCondition(String msgTitle,Integer pushType,Integer sendTtatus,Integer pageNum);
		
	//查询总页数
	public Integer searchTotallPageNum(String msgTitle,Integer pushType,Integer sendTtatus,Integer pageNum);
	
	//查询总页数
	public Integer saveTblBasePushMsg(TblBasePushMsg TblBasePushMsg);
	
	public TblBasePushMsg queryBasePushMsgById(Integer id);
	public Integer deletebasePushMsgById(Integer id);
	
	//查询总页数
	public Integer updateTblBasePushMsg(TblBasePushMsg TblBasePushMsg);
	
	

	

}
