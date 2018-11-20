package com.lottery.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.BaseAdminUser;
import com.lottery.entity.TblBaseAdminUser;
import com.lottery.entity.UserBaseInfo;
import com.lottery.service.BaseAdminUserService;
import com.lottery.service.LotteryMainOrderService;
import com.lottery.util.MD5Utils;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	BaseAdminUserService baseAdminUserService;
	@Autowired
	LotteryMainOrderService lotteryMainOrderService;
	/**
	 * 跳转到登录页面
	 * @param mapValue
	 * @return
	 */
	@RequestMapping("/loginHome")
	
	public String homePath() {
      
		return "loginPage";
	}
	/**
	 * 登录，跳转到首页
	 * @param mapValue
	 * @return
	 */
	@RequestMapping( value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String login(BaseAdminUser baseAdminUser,HttpServletRequest request) {
		baseAdminUser.setSysUserPwd(MD5Utils.getMD5String(baseAdminUser.getSysUserPwd()));
		baseAdminUser.setUserStatus(Short.valueOf(1+""));
		BaseAdminUser  userBaseInfoList =baseAdminUserService.login(baseAdminUser);
		HttpSession session = request.getSession();
		if(userBaseInfoList!=null) {
		session.setAttribute("user", userBaseInfoList.getSysUserCode());
		session.setAttribute("userBaseInfoList", userBaseInfoList);
		}
		return userBaseInfoList!=null?"sucess":"false";
	}
	/**
	 * 退出登录
	 * @param userBaseInfo 
	 * @param request
	 * @return
	 */
	@RequestMapping("/loginOut")
	@ResponseBody
	public String loginOut(UserBaseInfo userBaseInfo,HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return session.getAttribute("user")==null?"sucess":"false";
	}
	
	@RequestMapping("/home")
	public String home(Map<String, Object> mapValue,HttpServletRequest request){
		HttpSession session = request.getSession();
		mapValue.put("user", session.getAttribute("user"));
		mapValue.put("userBaseInfoList", session.getAttribute("userBaseInfoList"));
		//查询今天订单总量
		int orderCount =lotteryMainOrderService.searchTodayOrderCount();
		//查询今天付款订单总量
		int orderPayCount =lotteryMainOrderService.searchTodayPayOrderCount();
		
		mapValue.put("orderCount", orderCount);
		mapValue.put("orderPayCount", orderPayCount);
		
		
	  return "home2";
	}
	
}
