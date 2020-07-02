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
 * CommodityImp�Ĵ���
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
	 * ��Ʒ��Ϣ¼��
	 */
	@Override
	public boolean doInsert(Commodity cod) throws Exception {
		// TODO Auto-generated method stub
		return dao.doInsert(cod);
	}
	@Override
	/**
	 * �����û���Ϣ
	 */
	public List<Commodity> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
}
