package com.neusoft.entity;

import java.io.Serializable;

/**
 * ��Ʒ��Ϣʵ����
 * @author Administrator
 *
 */
public class T_Product_List implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1491825141484460664L;
	
	private int pid;	//id
	private String pro_item_no;	//��Ʒ���
	private String pro_name;	//��Ʒ����
	private String pro_category_no;	//��Ʒ�����
	private String pro_spec_no;	//��Ʒ�����
	private String pro_img_src;	//ͼƬ����
	private double pro_price;	//��Ʒ�۸�
	private int pro_hits;		//�����
	private int isRecommand;	//�Ƿ��Ƽ�
	private int isSpecial_offer;//�Ƿ��ؼ�
	private int isUp_Line;		//�Ƿ�����    1�ϼ�  2δ�ϼ�
	private String pro_paritculars;//��ϸ����
	
	public T_Product_List(){
		
	}

	public T_Product_List(int pid, String pro_item_no, String pro_name, String pro_category_no, String pro_spec_no,
			String pro_img_src, double pro_price, int pro_hits, int isRecommand, int isSpecial_offer, int isUp_Line,
			String pro_paritculars) {
		this.pid = pid;
		this.pro_item_no = pro_item_no;
		this.pro_name = pro_name;
		this.pro_category_no = pro_category_no;
		this.pro_spec_no = pro_spec_no;
		this.pro_img_src = pro_img_src;
		this.pro_price = pro_price;
		this.pro_hits = pro_hits;
		this.isRecommand = isRecommand;
		this.isSpecial_offer = isSpecial_offer;
		this.isUp_Line = isUp_Line;
		this.pro_paritculars = pro_paritculars;
	}
	
	public T_Product_List( String pro_item_no, String pro_name, String pro_category_no, String pro_spec_no,
			String pro_img_src, double pro_price, int pro_hits, int isRecommand, int isSpecial_offer, int isUp_Line,
			String pro_paritculars) {
		this.pro_item_no = pro_item_no;
		this.pro_name = pro_name;
		this.pro_category_no = pro_category_no;
		this.pro_spec_no = pro_spec_no;
		this.pro_img_src = pro_img_src;
		this.pro_price = pro_price;
		this.pro_hits = pro_hits;
		this.isRecommand = isRecommand;
		this.isSpecial_offer = isSpecial_offer;
		this.isUp_Line = isUp_Line;
		this.pro_paritculars = pro_paritculars;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPro_item_no() {
		return pro_item_no;
	}

	public void setPro_item_no(String pro_item_no) {
		this.pro_item_no = pro_item_no;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getPro_category_no() {
		return pro_category_no;
	}

	public void setPro_category_no(String pro_category_no) {
		this.pro_category_no = pro_category_no;
	}

	public String getPro_spec_no() {
		return pro_spec_no;
	}

	public void setPro_spec_no(String pro_spec_no) {
		this.pro_spec_no = pro_spec_no;
	}

	public String getPro_img_src() {
		return pro_img_src;
	}

	public void setPro_img_src(String pro_img_src) {
		this.pro_img_src = pro_img_src;
	}

	public double getPro_price() {
		return pro_price;
	}

	public void setPro_price(double pro_price) {
		this.pro_price = pro_price;
	}

	public int getPro_hits() {
		return pro_hits;
	}

	public void setPro_hits(int pro_hits) {
		this.pro_hits = pro_hits;
	}

	public int getIsRecommand() {
		return isRecommand;
	}

	public void setIsRecommand(int isRecommand) {
		this.isRecommand = isRecommand;
	}

	public int getIsSpecial_offer() {
		return isSpecial_offer;
	}

	public void setIsSpecial_offer(int isSpecial_offer) {
		this.isSpecial_offer = isSpecial_offer;
	}

	public int getIsUp_Line() {
		return isUp_Line;
	}

	public void setIsUp_Line(int isUp_Line) {
		this.isUp_Line = isUp_Line;
	}

	public String getPro_paritculars() {
		return pro_paritculars;
	}

	public void setPro_paritculars(String pro_paritculars) {
		this.pro_paritculars = pro_paritculars;
	}

	@Override
	public String toString() {
		return "T_Product_List [pid=" + pid + ", pro_item_no=" + pro_item_no + ", pro_name=" + pro_name
				+ ", pro_category_no=" + pro_category_no + ", pro_spec_no=" + pro_spec_no + ", pro_img_src="
				+ pro_img_src + ", pro_price=" + pro_price + ", pro_hits=" + pro_hits + ", isRecommand=" + isRecommand
				+ ", isSpecial_offer=" + isSpecial_offer + ", isUp_Line=" + isUp_Line + ", pro_paritculars="
				+ pro_paritculars + "]";
	}
	
	
	
}
