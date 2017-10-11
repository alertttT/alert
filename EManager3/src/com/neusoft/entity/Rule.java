package com.neusoft.entity;

import java.io.Serializable;

public class Rule implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3632051636385719499L;


	private int id;	//���id
	private int pid;	//������Ʒid
	private String	pm_size;	//��Ļ�ߴ��С 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPm_size() {
		return pm_size;
	}
	public void setPm_size(String pm_size) {
		this.pm_size = pm_size;
	}
	@Override
	public String toString() {
		return "Rule [id=" + id + ", pid=" + pid + ", pm_size=" + pm_size + "]";
	}
	
	
}

