package com.lottery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.BaseCityMapper;
import com.lottery.dao.BaseDistrictMapper;
import com.lottery.dao.BaseProvinceMapper;
import com.lottery.entity.BaseCity;
import com.lottery.entity.BaseDistrict;
import com.lottery.entity.BaseProvince;
import com.lottery.service.BaseAddressService;
@Service(value ="baseAddressService")
public class BaseAddressServiceImp implements BaseAddressService {
	@Autowired
	BaseCityMapper baseCityMapper;
	@Autowired
	BaseDistrictMapper baseDistrictMapper;
	@Autowired
	BaseProvinceMapper baseProvinceMapper;
	@Override
	public List<BaseProvince> querAllProvince() {
		
		return baseProvinceMapper.querAllProvince();
	}
	/**
	 * 查询城市列表
	 */
	@Override
	public List<BaseCity> querAllCityById(Integer provinceId) {
		   
		return baseCityMapper.selectCityListByProvinceId(provinceId);
	}
	@Override
	public List<BaseDistrict> querAllDistrictById(Integer cityId) {
		// TODO Auto-generated method stub
		return baseDistrictMapper.querAllDistrictById(cityId);
	}

}
