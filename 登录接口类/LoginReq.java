package com.jing.maven.account.request;

public class LoginReq {
	
	private String className = "LoginReq";
	
	/**
	 * 用户名， 字母，数字或者字母数字组合
	 */
	private String username;
	
	/**
	 * 密码
	 */
	private String password;
	


	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
