package com.dao.interfaces.imp.proxy;

import java.sql.Connection;

import com.connection.DatabaseConnection;
import com.dao.interfaces.IAdmi;
import com.dao.interfaces.imp.AdmiImp;
import com.pojo.Admi;
/**
 * admiImp的代理类
 * @author Ytt
 *
 */
public class AdmiProxy implements IAdmi{
	private IAdmi dao;
	private Connection conn;
	public AdmiProxy() throws Exception{
		conn=new DatabaseConnection().getConnection();
		dao=new AdmiImp(conn);
	}
	/**
	 * 员工登录验证
	 */
	@Override
	public Admi checkLogin(String admi_account, String admi_pwd)
			throws Exception {
		// TODO Auto-generated method stub
		return dao.checkLogin(admi_account, admi_pwd);
	}
	@Override
	public boolean changePwd(String id, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return dao.changePwd(id, pwd);
	}
}
