package com.dao.interfaces.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.interfaces.IEmp;
import com.pojo.Admi;
import com.pojo.Emp;
/**
 * 员工信息的数据库操作
 * @author Ytt
 *
 */
public class EmpImp implements IEmp{
	private Connection conn=null;
	private	PreparedStatement prst=null;
	public EmpImp(Connection conn){
		this.conn=conn;
	}
	/**
	 * 员工登录验证
	 */
	@Override
	public Emp checkLogin(String emp_account, String emp_pwd) throws Exception {
		Emp emp=null;
		String sql="select * from emp where emp_account=? and emp_pwd=?";
		prst=conn.prepareStatement(sql);
		prst.setString(1, emp_account);
		prst.setString(2, emp_pwd);
		ResultSet rs=prst.executeQuery();
		if(rs.next()){
			emp=new Emp(
					rs.getString("emp_id"),
					rs.getString("emp_name"),
					rs.getString("sex"),
					rs.getString("addres"),
					rs.getString("phone"),
					emp_account,
					emp_pwd
					);
		}
		return emp;
	}
	/**
	 * 员工信息插入
	 */
	@Override
	public boolean doInsert(Emp emp) throws Exception {
		boolean flag=false;
		String sql="insert into emp values(?,?,?,?,?,?,?)";
		prst=conn.prepareStatement(sql);
		prst.setString(1, emp.getEmp_id());
		prst.setString(2, emp.getEmp_name());
		prst.setString(3, emp.getEmp_account());
		prst.setString(4, emp.getEmp_pwd());
		prst.setString(5, emp.getSex());
		prst.setString(6, emp.getAddres());
		prst.setString(7, emp.getPhone());
		if(prst.executeUpdate()>0)
			flag=true;
		return flag;
	}
	/**
	 * 查找员工信息
	 */
	@Override
	public List<Emp> findAll() throws Exception {
		List<Emp> list=new ArrayList<Emp>();
		String sql="select * from emp";
		prst=conn.prepareStatement(sql);
		ResultSet rs=prst.executeQuery();
		while(rs.next()){
			Emp emp=new Emp();
			emp.setEmp_id(rs.getString(1));
			emp.setEmp_name(rs.getString(2));
			emp.setEmp_account(rs.getString(3));
			emp.setEmp_pwd(rs.getString(4));
			emp.setSex(rs.getString(5));
			emp.setAddres(rs.getString(6));
			emp.setPhone(rs.getString(7));
			list.add(emp);
		}
		return list;
	}
	/**
	 * 密码修改
	 */
	@Override
	public boolean changePwd(String id, String pwd) throws Exception {
		boolean flag=false;
		String sql="update emp set emp_pwd=? where emp_id=?";
		prst=conn.prepareStatement(sql);
		prst.setString(1, pwd);
		prst.setString(2,id);
		if(prst.executeUpdate()>0)
			flag=true;
		return flag;
	}
	/**
	 * 信息修改
	 */
	@Override
	public boolean doUpdate(Emp emp) throws Exception {
		boolean flag=false;
		String sql="update emp set emp_name=?,emp_account=?,emp_pwd=?,sex=?,addres=?,phone=? where emp_id=?";
		prst=conn.prepareStatement(sql);
		prst.setString(1, emp.getEmp_name());
		prst.setString(2, emp.getEmp_account());
		prst.setString(3, emp.getEmp_pwd());
		prst.setString(4, emp.getSex());
		prst.setString(5, emp.getAddres());
		prst.setString(6, emp.getPhone());
		prst.setString(7, emp.getEmp_id());
		if(prst.executeUpdate()>0)
			flag=true;
		return flag;
	}
}
