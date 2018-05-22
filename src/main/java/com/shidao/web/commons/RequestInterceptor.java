package com.shidao.web.commons;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RequestInterceptor implements HandlerInterceptor {
	static {
		Properties properties = new Properties();
		  // 使用ClassLoader加载properties配置文件生成对应的输入流
		    InputStream in = RequestInterceptor.class.getClassLoader().getResourceAsStream("url.properties");
		   // 使用properties对象加载输入流
	     try {
			properties.load(in);
			 String url=properties.getProperty("allowurl");
			 allowUrls=url;
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		     //获取key对应的value值
	    

	}
	static String allowUrls;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session =request.getSession();   
        UserToken user =(UserToken) session.getAttribute("userToken");
        String url =request.getRequestURL().toString();  
        String[] urls=allowUrls.split(";");
        for(String s:urls) {
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
