package com.crane.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.crane.po.model.User;
import com.crane.po.vo.AjaxResponse;
import com.crane.service.UserService;

/**
* @author  Crane:
* @version 5.0
* @time 2017年3月8日 下午9:18:29
* 
*/
@Controller
public class UserController extends BaseController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	private UserService userService;
	
	/*@RequestMapping(value="login")
	public ModelAndView login(HttpServletRequest request,HttpSession session){
		ModelAndView view = new ModelAndView("/page/login");
		if (null != session.getAttribute(Constants.SESSION_ERROR_LOGIN_COUNT)
				&& (Integer) session.getAttribute(Constants.SESSION_ERROR_LOGIN_COUNT) >= Constants.MAX_LOGIN_ERROR_COUNT) {
			view.addObject("checkCode", "checkCode");
		}
		return view;
	}*/
	
	@RequestMapping(value="regist")
	public ModelAndView regist(HttpServletRequest request){
		ModelAndView view = new ModelAndView("/page/regist");
		return view;
	}
	
	@ResponseBody
	@RequestMapping(value = "regist.do")
	public AjaxResponse<Object> registerDo(HttpSession session, User user, String checkCode){
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value = "login.do")
	public AjaxResponse<Object> loginDo(HttpSession session, HttpServletResponse response, String account,
			String password, String rememberMe, String checkCode) {
		return null;
	}
	
}
