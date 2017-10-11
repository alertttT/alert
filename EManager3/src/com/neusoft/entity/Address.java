package com.neusoft.entity;

import java.io.Serializable;

/**
 * ��ַʵ����
 * @author Administrator
 *
 */
public class Address implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2422650927734565901L;
	
	private int id;
	private String province; //ʡ
	private String city;	//��
	private String area;	//�� ��
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
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
		return "Address [id=" + id + ", province=" + province + ", city=" + city + ", area=" + area + "]";
	}
	
	
}
