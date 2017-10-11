package com.neusoft.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * �����ʺ���Ϣ
 * @author Administrator
 *
 */
public class Account_Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2713825668095860952L;
	
	private int id;	
	private String loginname;	//���ҵ�½��
	private String password; 	//��������
	private Date registertime;	//ע��ʱ��
	private Date lastlogintime; //���һ�ε�½ʱ��
	private String ip;	//ip��ַ
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegistertime() {
		return registertime;
	}
	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}
	public Date getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@Override
	public String toString() {
		return "Account_Product [id=" + id + ", loginname=" + loginname + ", password=" + password + ", registertime="
				+ registertime + ", lastlogintime=" + lastlogintime + ", ip=" + ip + "]";
	}
	
	
	
	
}
