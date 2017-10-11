package com.neusoft.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ����ʵ����
 * @author Administrator
 *
 */
public class Orderinfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2580948285120789914L;
	
	private int id;
	private String orderno;
	private int orderstatus;	//����״̬
	private int paystatus;		//֧����ʽ
	private Date ordertime;		//�µ�ʱ��
	private Date paytime;		//����ʱ��
	private int addrinfo;		//�ջ���id
	private String mask; 		//��ע
	private int pid;			//��Ʒ���
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	private int num;			//��Ʒ����
	private double totalprice;  //��Ʒ�ܼ�
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public int getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(int orderstatus) {
		this.orderstatus = orderstatus;
	}
	public int getPaystatus() {
		return paystatus;
	}
	public void setPaystatus(int paystatus) {
		this.paystatus = paystatus;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public Date getPaytime() {
		return paytime;
	}
	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}
	public int getAddrinfo() {
		return addrinfo;
	}
	public void setAddrinfo(int addrinfo) {
		this.addrinfo = addrinfo;
	}
	public String getMask() {
		return mask;
	}
	public void setMask(String mask) {
		this.mask = mask;
	}
	@Override
	public String toString() {
		return "Orderinfo [id=" + id + ", orderno=" + orderno + ", orderstatus=" + orderstatus + ", paystatus="
				+ paystatus + ", ordertime=" + ordertime + ", paytime=" + paytime + ", addrinfo=" + addrinfo + ", mask="
				+ mask + ", num=" + num +", pid=" + pid + ", totalprice=" + totalprice + "]";
	}
	
}
