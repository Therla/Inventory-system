package com.java.pojo;
/**
 * 员工信息
 * @author Yu
 *
 */
public class Emp {
		private String emp_id;
		private String emp_name;
		private String sex;
		private String addres;
		private String phone;
		private String emp_account;
		private String emp_pwd;
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
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getAddres() {
			return addres;
		}
		public void setAddres(String addres) {
			this.addres = addres;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmp_account() {
			return emp_account;
		}
		public void setEmp_account(String emp_account) {
			this.emp_account = emp_account;
		}
		public String getEmp_pwd() {
			return emp_pwd;
		}
		public void setEmp_pwd(String emp_pwd) {
			this.emp_pwd = emp_pwd;
		}
		@Override
		public String toString() {
			return "emp [emp_id=" + emp_id + ", emp_name=" + emp_name + ", sex="
					+ sex + ", addres=" + addres + ", phone=" + phone
					+ ", emp_account=" + emp_account + ", emp_pwd=" + emp_pwd + "]\n";
		}
		public Emp(String emp_id, String emp_name, String sex, String addres,
				String phone, String emp_account, String emp_pwd) {
			this.emp_id = emp_id;
			this.emp_name = emp_name;
			this.sex = sex;
			this.addres = addres;
			this.phone = phone;
			this.emp_account = emp_account;
			this.emp_pwd = emp_pwd;
		}
		public Emp() {}
		

}
