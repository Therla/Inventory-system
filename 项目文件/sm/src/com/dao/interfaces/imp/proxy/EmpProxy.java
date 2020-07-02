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
 * empImp�Ĵ�����
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
	 * Ա����¼��֤
	 */
	@Override
	public Emp checkLogin(String emp_account, String emp_pwd) throws Exception {
		// TODO Auto-generated method stub
		return dao.checkLogin(emp_account, emp_pwd);
	}
	/**
	 * Ա����Ϣ¼��
	 */
	@Override
	public boolean doInsert(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		return dao.doInsert(emp);
	}
	/**
	 * ����Ա����Ϣ
	 */
	@Override
	public List<Emp> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	/**
	 * �����޸�
	 */
	@Override
	public boolean changePwd(String id, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return dao.changePwd(id, pwd);
	}
	/**
	 * ��Ϣ�޸�
	 */
	@Override
	public boolean doUpdate(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		return dao.doUpdate(emp);
	}
	
}
