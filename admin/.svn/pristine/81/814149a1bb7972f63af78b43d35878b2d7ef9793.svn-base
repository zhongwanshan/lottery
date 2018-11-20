package com.lottery.serviceImp;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lottery.dao.LotteryOrderRouteMapper;
import com.lottery.dao.LotteryOrderRouteShopMapper;
import com.lottery.entity.LotteryOrderRoute;
import com.lottery.entity.LotteryOrderRouteShop;
import com.lottery.service.LotteryOrderRouteService;
@Service(value ="LotteryOrderRouteService")
public class LotteryOrderRouteServiceImp implements LotteryOrderRouteService {
	
	@Autowired
	LotteryOrderRouteMapper lotteryOrderRouteMapper;
	
	@Autowired
	LotteryOrderRouteShopMapper lotteryOrderRouteShopMapper;

	@Override
	public List<LotteryOrderRoute> searchLotteryOrderRouteByCondition(LotteryOrderRoute LotteryOrderRoute) {
		// TODO Auto-generated method stub
		return lotteryOrderRouteMapper.searchLotteryOrderRouteByCondition(LotteryOrderRoute);
	}

	@Override
	public Integer searchLotteryOrderRouteCountByCondition(LotteryOrderRoute LotteryOrderRoute) {
		// TODO Auto-generated method stub
		return lotteryOrderRouteMapper.searchLotteryOrderRouteCountByCondition(LotteryOrderRoute);
	}

	@Override
	public LotteryOrderRoute searchLotteryOrderRouteById(Integer id) {
		// TODO Auto-generated method stub
		return lotteryOrderRouteMapper.selectByPrimaryKey(id);
	}
    @Transactional
	@Override
	public Integer updateLotteryOrderRoute(LotteryOrderRoute lotteryOrderRoute) {
		//更新规则表
		   int num =lotteryOrderRouteMapper.updateByPrimaryKeySelective(lotteryOrderRoute);
		   if(num>0) {
			   //根据id删除guiz
			   int numTow =		lotteryOrderRouteShopMapper.deleteByRouteId(lotteryOrderRoute.getId());
				LotteryOrderRouteShop lotteryOrderRouteShop = new LotteryOrderRouteShop();
				lotteryOrderRouteShop.setRuleName(lotteryOrderRoute.getRuleName());
				lotteryOrderRouteShop.setLottoTypeId(lotteryOrderRoute.getLottoTypeId());
				lotteryOrderRouteShop.setMinOrderPrice(lotteryOrderRoute.getMinOrderPrice());
				lotteryOrderRouteShop.setMaxOrderPrice(lotteryOrderRoute.getMaxOrderPrice());
				lotteryOrderRouteShop.setMinPayMoney(lotteryOrderRoute.getMinPayMoney());
				lotteryOrderRouteShop.setMaxPayMoney(lotteryOrderRoute.getMaxPayMoney());
				
				 //保存分发规则关联的用户
				String[] isList=lotteryOrderRoute.getLotteryShopIds().split(",");
				for (String string : isList) {
					lotteryOrderRouteShop.setRouteId(lotteryOrderRoute.getId());
					lotteryOrderRouteShop.setShopId(Long.valueOf(string));
					lotteryOrderRouteShop.setCrateTime(new Date());
				//插入关联数据表
					lotteryOrderRouteShopMapper.insertSelective(lotteryOrderRouteShop);
				}
				 return 1;
			
				}else {
					return 0;
				}}
			

    /**
     * 保存分发规则
     */
	@Override
	@Transactional
	public Integer saveLotteryOrderRoute(LotteryOrderRoute lotteryOrderRoute) {
		//保存分发规则
		int recordNum =lotteryOrderRouteMapper.insertSelective(lotteryOrderRoute);
		LotteryOrderRouteShop lotteryOrderRouteShop = new LotteryOrderRouteShop();
		lotteryOrderRouteShop.setRuleName(lotteryOrderRoute.getRuleName());
		lotteryOrderRouteShop.setLottoTypeId(lotteryOrderRoute.getLottoTypeId());
		lotteryOrderRouteShop.setMinOrderPrice(lotteryOrderRoute.getMinOrderPrice());
		lotteryOrderRouteShop.setMaxOrderPrice(lotteryOrderRoute.getMaxOrderPrice());
		lotteryOrderRouteShop.setMinPayMoney(lotteryOrderRoute.getMinPayMoney());
		lotteryOrderRouteShop.setMaxPayMoney(lotteryOrderRoute.getMaxPayMoney());
		if (recordNum>0) {
		 //保存分发规则关联的用户
		if(!lotteryOrderRoute.getLotteryShopIds().equals("")) {
		String[] isList=lotteryOrderRoute.getLotteryShopIds().split(",");
		Set<String> dataSet = new HashSet<String>();
		for (String string : isList) {
			dataSet.add(string);
		}
		for (String string : dataSet) {
			lotteryOrderRouteShop.setRouteId(lotteryOrderRoute.getId());
			lotteryOrderRouteShop.setShopId(Long.valueOf(string));
			lotteryOrderRouteShop.setCrateTime(new Date());
		//插入关联数据表
			lotteryOrderRouteShopMapper.insertSelective(lotteryOrderRouteShop);
		}
		}
		 return 1;
		}else {
			return 0;
		}
	}
	 /**
     * 更新保存选择用户
     */
	@Override
	@Transactional
	public Integer saveLotteryUser(Integer ruleId, String lotteryShopIds) {
		//根据id删除guiz
		lotteryOrderRouteShopMapper.deleteByRouteId(ruleId);
		//根据id查询规则
		LotteryOrderRoute  lotteryOrderRoute = lotteryOrderRouteMapper.selectByPrimaryKey(ruleId);
		LotteryOrderRouteShop lotteryOrderRouteShop = new LotteryOrderRouteShop();
		lotteryOrderRouteShop.setRuleName(lotteryOrderRoute.getRuleName());
		lotteryOrderRouteShop.setLottoTypeId(lotteryOrderRoute.getLottoTypeId());
		lotteryOrderRouteShop.setMinOrderPrice(lotteryOrderRoute.getMinOrderPrice());
		lotteryOrderRouteShop.setMaxOrderPrice(lotteryOrderRoute.getMaxOrderPrice());
		lotteryOrderRouteShop.setMinPayMoney(lotteryOrderRoute.getMinPayMoney());
		lotteryOrderRouteShop.setMaxPayMoney(lotteryOrderRoute.getMaxPayMoney());
		if (lotteryOrderRoute!=null) {
		 //保存分发规则关联的用户
		if(!lotteryShopIds.equals("")) {
		String[] isList=lotteryShopIds.split(",");
		Set<String> dataSet = new HashSet<String>();
		for (String string : isList) {
			dataSet.add(string);
		}
		for (String string : isList) {
			lotteryOrderRouteShop.setRouteId(lotteryOrderRoute.getId());
			lotteryOrderRouteShop.setShopId(Long.valueOf(string));
			lotteryOrderRouteShop.setCrateTime(new Date());
		//插入关联数据表
			lotteryOrderRouteShopMapper.insertSelective(lotteryOrderRouteShop);
		}
		}
		 return 1;
		}else{
			return 0;
		}
	}

	@Override
	public List<LotteryOrderRouteShop> queryLotteryOrderRouteShopList(Integer id) {
		// TODO Auto-generated method stub
		return lotteryOrderRouteShopMapper.queryLotteryOrderRouteShopList(id);
	}

	@Override
	public Integer changeLotteryOrderRouteStatus(LotteryOrderRoute lotteryOrderRoute) {
		// TODO Auto-generated method stub
		return lotteryOrderRouteMapper.updateByPrimaryKeySelective(lotteryOrderRoute);
	}

}
