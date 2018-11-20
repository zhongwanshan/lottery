package com.lottery.dao;

import com.lottery.entity.BaseBankInfo;
import com.lottery.entity.BaseBankInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BaseBankInfoMapper {
    long countByExample(BaseBankInfoExample example);

    int deleteByExample(BaseBankInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseBankInfo record);

    int insertSelective(BaseBankInfo record);

    List<BaseBankInfo> selectByExample(BaseBankInfoExample example);

    BaseBankInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseBankInfo record, @Param("example") BaseBankInfoExample example);

    int updateByExample(@Param("record") BaseBankInfo record, @Param("example") BaseBankInfoExample example);

    int updateByPrimaryKeySelective(BaseBankInfo record);

    int updateByPrimaryKey(BaseBankInfo record);
    //查询银行信息
    List<BaseBankInfo> selectBaseBankInfoList(BaseBankInfo baseBankInfo);
    
    
    
}