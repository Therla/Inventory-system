package com.pojo;
/**
 * 商品库存信息
 * @author Ytt
 *
 */
public class Commodity_inventory {
	private String commodity_id;
	private String commodity_name;
	private String category_number;
	private String commodity_type;
	private float purchase_price;
	private int inventory_quantity;
	private float total_inventory_price;
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
	public float getPurchase_price() {
		return purchase_price;
	}
	public void setPurchase_price(float purchase_price) {
		this.purchase_price = purchase_price;
	}
	public int getInventory_quantity() {
		return inventory_quantity;
	}
	public void setInventory_quantity(int inventory_quantity) {
		this.inventory_quantity = inventory_quantity;
	}
	public float getTotal_inventory_price() {
		return total_inventory_price;
	}
	public void setTotal_inventory_price(float total_inventory_price) {
		this.total_inventory_price = total_inventory_price;
	}
	@Override
	public String toString() {
		return "Commodity_inventory [commodity_id="
				+ commodity_id + ", commodity_name=" + commodity_name
				+ ", category_number=" + category_number + ", commodity_type="
				+ commodity_type + ", purchase_price=" + purchase_price
				+ ", inventory_quantity=" + inventory_quantity
				+ ", total_inventory_price=" + total_inventory_price + "]\n";
	}
	public Commodity_inventory(String commodity_id,
			String commodity_name, String category_number,
			String commodity_type, float purchase_price,
			int inventory_quantity, float total_inventory_price) {
		super();
		this.commodity_id = commodity_id;
		this.commodity_name = commodity_name;
		this.category_number = category_number;
		this.commodity_type = commodity_type;
		this.purchase_price = purchase_price;
		this.inventory_quantity = inventory_quantity;
		this.total_inventory_price = total_inventory_price;
	}
	public Commodity_inventory() {
		super();
	}
	
}
