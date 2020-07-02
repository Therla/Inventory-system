package com.pojo;

import java.util.Date;

/**
 * ÕÀªı–≈œ¢
 * @author Ytt
 *
 */
public class Return {
	private String commodity_id;
	private String commodity_name;
	private String supplier_id;
	private Date return_time;
	private float price;
	private int number;
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
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	public Date getReturn_time() {
		return return_time;
	}
	public void setReturn_time(Date return_time) {
		this.return_time = return_time;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Return [commodity_id=" + commodity_id
				+ ", commodity_name=" + commodity_name + ", supplier_id="
				+ supplier_id + ", return_time=" + return_time + ", price="
				+ price + ", number=" + number + "]\n";
	}
	public Return(String commodity_id, String commodity_name,
			String supplier_id, Date return_time, float price, int number) {
		super();
		this.commodity_id = commodity_id;
		this.commodity_name = commodity_name;
		this.supplier_id = supplier_id;
		this.return_time = return_time;
		this.price = price;
		this.number = number;
	}
	public Return() {
		super();
	}
	
}
