package com.dao.interfaces.imp.proxy;

import java.sql.Connection;
import java.util.List;

import com.connection.DatabaseConnection;
import com.dao.interfaces.IReturn;
import com.dao.interfaces.ISale;
import com.dao.interfaces.imp.ReturnImp;
import com.dao.interfaces.imp.SaleImp;
import com.pojo.Emp_sale;

public class SaleProxy implements ISale{
	private ISale  dao;
	private Connection conn;
	public SaleProxy() throws Exception{
		conn=new DatabaseConnection().getConnection();
		dao=new SaleImp(conn);
	}
	@Override
	public List<Emp_sale> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public boolean doInsert(Emp_sale e) throws Exception {
		// TODO Auto-generated method stub
		return dao.doInsert(e);
	}

}
