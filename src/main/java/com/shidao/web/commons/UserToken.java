package com.shidao.web.commons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UserToken {
	String userName;
	Long userId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public static UserToken getUserToker(HttpServletRequest request) {
		HttpSession session =request.getSession();   
        UserToken user =(UserToken) session.getAttribute("userToken");
        return user;
	}
}
