package com.dao.interfaces.imp.proxy;

import java.sql.Connection;
import java.util.List;

import com.connection.DatabaseConnection;
import com.dao.interfaces.IPurchase;
import com.dao.interfaces.IReturn;
import com.dao.interfaces.imp.PurchaseImp;
import com.dao.interfaces.imp.ReturnImp;
import com.pojo.Return;
/**
 * ReturnImp代理
 * @author Ytt
 *
 */
public class ReturnProxy implements IReturn{
	private IReturn  dao;
	private Connection conn;
	public ReturnProxy () throws Exception{
		conn=new DatabaseConnection().getConnection();
		dao=new ReturnImp(conn);
	}
	/**
	 * 退货信息录入
	 */
	@Override
	public boolean doInsert(Return re) throws Exception {
		// TODO Auto-generated method stub
		return dao.doInsert(re);
	}
	@Override
	public List<Return> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
