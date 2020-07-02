package com.dao.interfaces.imp.proxy;

import java.sql.Connection;
import java.util.List;

import com.connection.DatabaseConnection;
import com.dao.interfaces.IAdmi;
import com.dao.interfaces.IEmp;
import com.dao.interfaces.imp.AdmiImp;
import com.dao.interfaces.imp.EmpImp;
import com.pojo.Admi;
import com.pojo.Emp;
/**
 * empImp的代理类
 * @author Ytt
 *
 */
public class EmpProxy implements IEmp{
	private IEmp dao;
	private Connection conn;
	public EmpProxy() throws Exception{
		conn=new DatabaseConnection().getConnection();
		dao=new EmpImp(conn);
	}
	/**
	 * 员工登录验证
	 */
	@Override
	public Emp checkLogin(String emp_account, String emp_pwd) throws Exception {
		// TODO Auto-generated method stub
		return dao.checkLogin(emp_account, emp_pwd);
	}
	/**
	 * 员工信息录入
	 */
	@Override
	public boolean doInsert(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		return dao.doInsert(emp);
	}
	/**
	 * 所有员工信息
	 */
	@Override
	public List<Emp> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	/**
	 * 密码修改
	 */
	@Override
	public boolean changePwd(String id, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return dao.changePwd(id, pwd);
	}
	/**
	 * 信息修改
	 */
	@Override
	public boolean doUpdate(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		return dao.doUpdate(emp);
	}
	
}
