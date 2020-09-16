package com.java.pojo;
/**
 * 商品类别
 * @author Yu
 *
 */
public class Commodity_category {
	private String category_number;
	private String commodity_type;
	private String category_description;
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
	public String getCategory_description() {
		return category_description;
	}
	public void setCategory_description(String category_description) {
		this.category_description = category_description;
	}
	@Override
	public String toString() {
		return "Commodity_category [category_number=" + category_number
				+ ", commodity_type=" + commodity_type
				+ ", category_description=" + category_description + "]\n";
	}
	public Commodity_category() {
	}
	public Commodity_category(String category_number, String commodity_type,
			String category_description) {
		this.category_number = category_number;
		this.commodity_type = commodity_type;
		this.category_description = category_description;
	}
	
}
