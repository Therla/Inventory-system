package com.dao.interfaces.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.interfaces.IInventory;
import com.pojo.Commodity_inventory;
import com.pojo.Purchase;

public class InventoryImp implements IInventory{
	private Connection conn=null;
	private	PreparedStatement prst=null;
	public InventoryImp(Connection conn){
		this.conn=conn;
	}
	@Override
	public List<Commodity_inventory> findAll() throws Exception {
		List<Commodity_inventory> list=new ArrayList<Commodity_inventory>();
		String sql="select * from Commodity_inventory";
		prst=conn.prepareStatement(sql);
		ResultSet rs=prst.executeQuery();
		while(rs.next()){
			Commodity_inventory c=new Commodity_inventory();
			c.setCommodity_id(rs.getString(2));
			c.setCommodity_name(rs.getString(3));
			c.setCommodity_type(rs.getString(5));
			c.setInventory_quantity(rs.getInt(7));
			list.add(c);
		}
		return list;
	}
}
