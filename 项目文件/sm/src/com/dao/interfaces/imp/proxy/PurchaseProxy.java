package com.dao.interfaces.imp.proxy;

import java.sql.Connection;
import java.util.List;

import com.connection.DatabaseConnection;
import com.dao.interfaces.ICommodity;
import com.dao.interfaces.IPurchase;
import com.dao.interfaces.imp.CommodityImp;
import com.dao.interfaces.imp.PurchaseImp;
import com.pojo.Purchase;

/**
 * PurchaseImp代理
 * @author Ytt
 *
 */
public class PurchaseProxy implements IPurchase{
	private IPurchase  dao;
	private Connection conn;
	public PurchaseProxy () throws Exception{
		conn=new DatabaseConnection().getConnection();
		dao=new PurchaseImp(conn);
	}
	/**
	 * 进货信息录入
	 */
	@Override
	public boolean doInsert(Purchase pc) throws Exception {
		// TODO Auto-generated method stub
		return dao.doInsert(pc);
	}
	@Override
	public List<Purchase> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
