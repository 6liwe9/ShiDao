package com.shidao.web.commons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RequestInterceptor implements HandlerInterceptor {

	String[] allowUrls= {"user","Login","Register","Forget"};
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session =request.getSession();   
        UserToken user =(UserToken) session.getAttribute("userToken");
        String url =request.getRequestURL().toString();  
        for(String s:allowUrls) {
        	if(url.contains(s))
        		return true;
        }
        if(user ==null)  
        {  
        	response.sendRedirect(request.getContextPath()+"/Login.html");  
        	System.out.println("redeict");
        }
        return true;  
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		System.out.println("拦截器postHandle()请求处理之后进行调用，但是在视图被渲染之前(Controller方法调用之后)");

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		System.out.println(
				"拦截器afterCompletion()在整个请求结束之后被调用，也就是在DispatcherServlet渲染了对应的视图之后执行(主要是用于进行资源清理工作)");

	}

}
