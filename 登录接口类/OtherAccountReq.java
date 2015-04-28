package com.jing.maven.account.request;

public class OtherAccountReq {
	
	private String className = "OtherAccountReq";
	
	/**
	 * type 1为QQ第三方登录； 2为微信第三方登录；
	 */
	private String type;
	
	/**
	 * QQ第三方主键
	 */
	private String uId;
	
	/**
	 * QQ第三方密钥
	 */
	private String accessToken;
	
	/**
	 * QQ oauth_consumer_key
	 */
	private String authKey;
	
	/**
	 * mac地址
	 */
	private String mac;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}
	

}
