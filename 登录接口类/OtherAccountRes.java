package com.jing.maven.account.response;

public class OtherAccountRes {
	
	private String className = "OtherAccountRes";
	
	/**
	 * 我的信息ID
	 */
	private String myinfoId;
	
	/**
	 * 环信账号
	 */
	private String username;
	
	/**
	 * 环信token，有效期为7天
	 */
	private String accessToken;


	public String getMyinfoId() {
		return myinfoId;
	}

	public void setMyinfoId(String myinfoId) {
		this.myinfoId = myinfoId;
	}

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

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	

}
