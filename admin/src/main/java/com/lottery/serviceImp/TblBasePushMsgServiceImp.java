package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.TblBasePushMsgMapper;
import com.lottery.entity.TblBasePushMsg;
import com.lottery.service.TblBasePushMsgService;
import com.lottery.util.ConstantUtil;
@Service(value = "tblBasePushMsgService")
public class TblBasePushMsgServiceImp implements TblBasePushMsgService {
	
	@Autowired
	TblBasePushMsgMapper tblBasePushMsgMapper;
    //根据条件查询最新10行数据
	@Override
	public List<TblBasePushMsg> searchMessagesByCondition(String msgTitle, Integer pushType, Integer sendTtatus,Integer pageNum) {
		TblBasePushMsg tblBasePushMsg = new TblBasePushMsg();
		tblBasePushMsg.setMsgTitle(msgTitle);
		tblBasePushMsg.setPushType(pushType);
		tblBasePushMsg.setSendStatus(sendTtatus);
		if (pageNum!=null) {
			tblBasePushMsg.setPageNum(pageNum);
		}
		List<TblBasePushMsg> tblBasePushMsgList = tblBasePushMsgMapper.searchMessagesByCondition(tblBasePushMsg);
		return tblBasePushMsgList;
	}
	@Override
	public Integer searchTotallPageNum(String msgTitle, Integer pushType, Integer sendTtatus,
			Integer pageNum) {
		TblBasePushMsg tblBasePushMsg = new TblBasePushMsg();
		tblBasePushMsg.setMsgTitle(msgTitle);
		tblBasePushMsg.setPushType(pushType);
		tblBasePushMsg.setSendStatus(sendTtatus);
		return tblBasePushMsgMapper.searchTotallPageNum(tblBasePushMsg);
	}
	@Override
	public Integer saveTblBasePushMsg(TblBasePushMsg TblBasePushMsg) {
		
		return tblBasePushMsgMapper.saveTblBasePushMsg(TblBasePushMsg);
	}
	@Override
	public TblBasePushMsg queryBasePushMsgById(Integer id) {
		// TODO Auto-generated method stub
		return tblBasePushMsgMapper.queryBasePushMsgById(id).get(0);
	}
	@Override
	public Integer deletebasePushMsgById(Integer id) {
		// TODO Auto-generated method stub
		return tblBasePushMsgMapper.deletebasePushMsgById(id);
	}
	@Override
	public Integer updateTblBasePushMsg(TblBasePushMsg tblBasePushMsg) {
		// TODO Auto-generated method stub
		return tblBasePushMsgMapper.updateTblBasePushMsg(tblBasePushMsg);
	}
	
	

}
