package com.neusoft.entity;

import java.io.Serializable;

/**
 * ��ҵ�ַ��Ϣʵ����
 * @author Administrator
 *
 */
public class Consumer_Addr implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7949264591180731433L;
	
	private int id;
	private String name;	//�������
	private String addr;	//�����ϸ��ַ
	private String phone;	//��ϵ��ʽ
	private String provice;		//ʡ
	private String city;		//��
	private String area;		//��
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProvice() {
		return provice;
	}
	public void setProvice(String provice) {
		this.provice = provice;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Consumer_Addr [id=" + id + ", name=" + name + ", addr=" + addr + ", phone=" + phone + ", provice="
				+ provice + ", city=" + city + ", area=" + area + "]";
	}
	
	
	
	
}
