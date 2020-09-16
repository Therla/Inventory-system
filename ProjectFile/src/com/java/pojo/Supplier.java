package com.java.pojo;
/**
 * 供应商信息
 * @author Yu
 *
 */
public class Supplier {
	private String supplier_id;
	private String supplier_name;
	private String organization_code;
	private String contacts;
	private String contact_number;
	private String corporate_representative;
	private String email;
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getOrganization_code() {
		return organization_code;
	}
	public void setOrganization_code(String organization_code) {
		this.organization_code = organization_code;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getCorporate_representative() {
		return corporate_representative;
	}
	public void setCorporate_representative(String corporate_representative) {
		this.corporate_representative = corporate_representative;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Supplier [supplier_id=" + supplier_id + ", supplier_name="
				+ supplier_name + ", organization_code=" + organization_code
				+ ", contacts=" + contacts + ", contact_number="
				+ contact_number + ", corporate_representative="
				+ corporate_representative + ", email=" + email + "]\n";
	}
	public Supplier(String supplier_id, String supplier_name,
			String organization_code, String contacts, String contact_number,
			String corporate_representative, String email) {
		super();
		this.supplier_id = supplier_id;
		this.supplier_name = supplier_name;
		this.organization_code = organization_code;
		this.contacts = contacts;
		this.contact_number = contact_number;
		this.corporate_representative = corporate_representative;
		this.email = email;
	}
	public Supplier() {
		super();
	}

}
