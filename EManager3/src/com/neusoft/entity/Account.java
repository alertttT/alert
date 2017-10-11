package com.neusoft.entity;

import java.io.Serializable;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6301075639694428811L;
	
	private int id; //�û�id  ����
	
	private String username; //�û�����
	
	private String password; //�û�����
	
	private String ip;
	
	private long logindate;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public long getLogindate() {
		return logindate;
	}

	public void setLogindate(long logindate) {
		this.logindate = logindate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password=" + password + ", ip=" + ip + ", logindate="
				+ logindate + "]";
	}

	
}
