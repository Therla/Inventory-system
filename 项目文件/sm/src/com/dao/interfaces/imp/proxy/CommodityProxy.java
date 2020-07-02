package com.dao.interfaces.imp.proxy;

import java.sql.Connection;
import java.util.List;

import com.connection.DatabaseConnection;
import com.dao.interfaces.IAdmi;
import com.dao.interfaces.ICommodity;
import com.dao.interfaces.imp.AdmiImp;
import com.dao.interfaces.imp.CommodityImp;
import com.pojo.Commodity;

/**
 * CommodityImp的代理
 * @author Ytt
 *
 */
public class CommodityProxy implements ICommodity{
	private ICommodity dao;
	private Connection conn;
	public CommodityProxy() throws Exception{
		conn=new DatabaseConnection().getConnection();
		dao=new CommodityImp(conn);
	}
	/**
	 * 商品信息录入
	 */
	@Override
	public boolean doInsert(Commodity cod) throws Exception {
		// TODO Auto-generated method stub
		return dao.doInsert(cod);
	}
	@Override
	/**
	 * 所有用户信息
	 */
	public List<Commodity> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
}
