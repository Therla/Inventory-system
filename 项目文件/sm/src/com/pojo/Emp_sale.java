package com.pojo;

import java.util.Date;
/**
 * 销售信息
 * @author Ytt
 *
 */
public class Emp_sale {
	private String emp_id;
	private String emp_name;
	private String commodity_id;
	private String commodity_name;
	private String commodity_type;
	private float commodity_price;
	private int number;
	private Date selling_time;
	private float total_price;
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getCommodity_id() {
		return commodity_id;
	}
	public void setCommodity_id(String commodity_id) {
		this.commodity_id = commodity_id;
	}
	public String getCommodity_name() {
		return commodity_name;
	}
	public void setCommodity_name(String commodity_name) {
		this.commodity_name = commodity_name;
	}
	public String getCommodity_type() {
		return commodity_type;
	}
	public void setCommodity_type(String commodity_type) {
		this.commodity_type = commodity_type;
	}
	public float getCommodity_price() {
		return commodity_price;
	}
	public void setCommodity_price(float commodity_price) {
		this.commodity_price = commodity_price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getSelling_time() {
		return selling_time;
	}
	public void setSelling_time(Date selling_time) {
		this.selling_time = selling_time;
	}
	public float getTotal_price() {
		return total_price;
	}
	public void setTotal_price(float total_price) {
		this.total_price = total_price;
	}
	@Override
	public String toString() {
		return "Emp_sale [emp_id=" + emp_id + ", emp_name="
				+ emp_name + ", commodity_id=" + commodity_id
				+ ", commodity_name=" + commodity_name + ", commodity_type="
				+ commodity_type + ", commodity_price=" + commodity_price
				+ ", number=" + number + ", selling_time=" + selling_time
				+ ", total_price=" + total_price + "]\n";
	}
	public Emp_sale(String emp_id, String emp_name,
			String commodity_id, String commodity_name, String commodity_type,
			float commodity_price, int number, Date selling_time,
			float total_price) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.commodity_id = commodity_id;
		this.commodity_name = commodity_name;
		this.commodity_type = commodity_type;
		this.commodity_price = commodity_price;
		this.number = number;
		this.selling_time = selling_time;
		this.total_price = total_price;
	}
	public Emp_sale() {
		super();
	}
	
}
