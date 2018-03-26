package com.cqupt.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import com.cqupt.ssm.model.User;
import com.cqupt.ssm.util.WebConstant;

/**
 * Web后台公共控制器
 * @author Mauger
 * @version V1.0.0
 */
public class WebCommonController 
{

	/**
	 * 获取当前登陆用户信息
	 * @param req HttpServletRequest
	 * @return User
	 */
	protected User getCurrentUser(HttpServletRequest req) 
	{
		return (User) req.getSession().getAttribute(WebConstant.WEB_CURRENT_USER);
	}
	
}
