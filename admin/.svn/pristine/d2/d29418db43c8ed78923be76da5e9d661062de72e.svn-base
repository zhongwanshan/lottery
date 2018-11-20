package com.lottery.dao;

import com.lottery.entity.BaseDistrict;
import com.lottery.entity.BaseDistrictExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BaseDistrictMapper {
    long countByExample(BaseDistrictExample example);

    int deleteByExample(BaseDistrictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseDistrict record);

    int insertSelective(BaseDistrict record);

    List<BaseDistrict> selectByExample(BaseDistrictExample example);

    BaseDistrict selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseDistrict record, @Param("example") BaseDistrictExample example);

    int updateByExample(@Param("record") BaseDistrict record, @Param("example") BaseDistrictExample example);

    int updateByPrimaryKeySelective(BaseDistrict record);

    int updateByPrimaryKey(BaseDistrict record);
    
    List<BaseDistrict> querAllDistrictById(Integer cityId);
    
    
    
}