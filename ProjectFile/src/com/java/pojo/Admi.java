package com.java.pojo;
/**
 * 管理员信息
 * @author Yu
 *
 */
public class Admi {
	private String admi_id;
	private String admi_name;
	private String admi_account;
	private String admi_pwd;
	public String getAdmi_id() {
		return admi_id;
	}
	public void setAdmi_id(String admi_id) {
		this.admi_id = admi_id;
	}
	public String getAdmi_name() {
		return admi_name;
	}
	public void setAdmi_name(String admi_name) {
		this.admi_name = admi_name;
	}
	public String getAdmi_account() {
		return admi_account;
	}
	public void setAdmi_account(String admi_account) {
		this.admi_account = admi_account;
	}
	public String getAdmi_pwd() {
		return admi_pwd;
	}
	public void setAdmi_pwd(String admi_pwd) {
		this.admi_pwd = admi_pwd;
	}
	@Override
	public String toString() {
		return "Admi [admi_id=" + admi_id + ", admi_name=" + admi_name
				+ ", admi_account=" + admi_account + ", admi_pwd=" + admi_pwd
				+ "]\n";
	}
	
	public Admi() {
	}
	public Admi(String admi_id, String admi_name, String admi_account,
			String admi_pwd) {
		this.admi_id = admi_id;
		this.admi_name = admi_name;
		this.admi_account = admi_account;
		this.admi_pwd = admi_pwd;
	}
	
}
