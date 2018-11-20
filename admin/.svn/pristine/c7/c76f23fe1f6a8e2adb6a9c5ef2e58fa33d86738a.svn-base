package com.lottery.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lottery.entity.TblBasePushMsg;
@Mapper
public interface TblBasePushMsgMapper {
	
	//根据条件查询最新10条数据
   public List<TblBasePushMsg> searchMessagesByCondition(TblBasePushMsg tblBasePushMsg);
 
	//根据条件查询总页数
   public Integer searchTotallPageNum(TblBasePushMsg tblBasePushMsg);
   
   //根据条件查询总页数
   public Integer saveTblBasePushMsg(TblBasePushMsg tblBasePushMsg);
   //根据id查询
   public List<TblBasePushMsg> queryBasePushMsgById(Integer id);
   
   //根据id删除
   public Integer deletebasePushMsgById(Integer id);
   
   //根据条件查询总页数
   public Integer updateTblBasePushMsg(TblBasePushMsg tblBasePushMsg);
   
   
   
		
}
