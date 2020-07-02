package com.dao.interfaces.imp.proxy;

import java.sql.Connection;
import java.util.List;

import com.connection.DatabaseConnection;
import com.dao.interfaces.IInventory;
import com.dao.interfaces.IPurchase;
import com.dao.interfaces.imp.InventoryImp;
import com.dao.interfaces.imp.PurchaseImp;
import com.pojo.Commodity_inventory;

public class InventoryProxy implements IInventory{
	private IInventory  dao;
	private Connection conn;
	public InventoryProxy () throws Exception{
		conn=new DatabaseConnection().getConnection();
		dao=new InventoryImp(conn);
	}
	@Override
	public List<Commodity_inventory> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
