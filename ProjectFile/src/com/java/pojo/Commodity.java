package com.java.pojo;
/**
 * 商品信息
 * @author Yu
 *
 */
public class Commodity {
	private String commodity_id;
	private String commodity_name;
	private String category_number;
	private String commodity_type;
	private float commodity_price;
	private String production_address;
	private String remarks_information;
	
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
	public String getCategory_number() {
		return category_number;
	}
	public void setCategory_number(String category_number) {
		this.category_number = category_number;
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
	public String getProduction_address() {
		return production_address;
	}
	public void setProduction_address(String production_address) {
		this.production_address = production_address;
	}
	public String getRemarks_information() {
		return remarks_information;
	}
	public void setRemarks_information(String remarks_information) {
		this.remarks_information = remarks_information;
	}
	@Override
	public String toString() {
		return "Commodity [commodity_id=" + commodity_id + ", commodity_name="
				+ commodity_name + ", commodity_number=" + category_number
				+ ", commodity_type=" + commodity_type + ", commodity_price="
				+ commodity_price + ", production_address="
				+ production_address + ", remarks_information="
				+ remarks_information + "]\n";
	}
	public Commodity(String commodity_id, String commodity_name,
			String category_number, String commodity_type,
			float commodity_price, String production_address,
			String remarks_information) {
		super();
		this.commodity_id = commodity_id;
		this.commodity_name = commodity_name;
		this.category_number = category_number;
		this.commodity_type = commodity_type;
		this.commodity_price = commodity_price;
		this.production_address = production_address;
		this.remarks_information = remarks_information;
	}
	public Commodity() {
		super();
	}	
	
}
