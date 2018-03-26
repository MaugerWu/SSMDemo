package com.cqupt.ssm.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.cqupt.ssm.util.WebConstant;

/**
 * 后台访问拦截器
 * @author wuMaoZheng
 * @date 2017年11月17日 下午11:02:59
 * @version V1.0.0
 */
public class WebInterceptor implements HandlerInterceptor
{

    /**
     * {@inheritDoc }
     */
    @Override
    public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object obj, Exception e) throws Exception
    {
        Logger.getLogger(this.getClass()).info("Session延时10分钟...");
        req.getSession().setMaxInactiveInterval(600); // 十分钟超时
    }

    
    /**
     * {@inheritDoc }
     */
    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse res, Object obj, ModelAndView modelAndView) throws Exception
    {
    }

    
    /**
     * {@inheritDoc }
     */
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception
    {
        Object attribute = req.getSession().getAttribute(WebConstant.WEB_CURRENT_USER);
        
        if (null == attribute)
        {
            // 请求的路径
            String contextPath = req.getContextPath();
            res.sendRedirect(contextPath + "/login");
            Logger.getLogger(this.getClass()).error("当前会话还未登录!");
            return false;
        }
        return true;
    }

}
