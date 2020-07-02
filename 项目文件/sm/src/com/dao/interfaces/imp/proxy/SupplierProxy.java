package com.dao.interfaces.imp.proxy;

import java.sql.Connection;
import java.util.List;

import com.connection.DatabaseConnection;
import com.dao.interfaces.IEmp;
import com.dao.interfaces.ISupplier;
import com.dao.interfaces.imp.EmpImp;
import com.dao.interfaces.imp.SupplierImp;
import com.pojo.Supplier;

public class SupplierProxy implements ISupplier{
	private ISupplier dao;
	private Connection conn;
	public SupplierProxy() throws Exception{
		conn=new DatabaseConnection().getConnection();
		dao=new SupplierImp(conn);
	}
	@Override
	public List<Supplier> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
