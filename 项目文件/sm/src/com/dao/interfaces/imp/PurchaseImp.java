package com.dao.interfaces.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.interfaces.IPurchase;
import com.pojo.Emp;
import com.pojo.Purchase;
/**
 * 进货信息的数据库操作
 * @author Ytt
 *
 */
public class PurchaseImp implements IPurchase{
	private Connection conn=null;
	private	PreparedStatement prst=null;
	public PurchaseImp(Connection conn){
		this.conn=conn;
	}
	/**
	 * 进货信息录入
	 */
	@Override
	public boolean doInsert(Purchase pc) throws Exception {
		boolean flag=false;
		String sql="insert into purchase(commodity_id,commodity_name,supplier_id,purchase_time,price,number) values(?,?,?,?,?,?)";
		prst=conn.prepareStatement(sql);
		prst.setString(1, pc.getCommodity_id());
		prst.setString(2, pc.getCommodity_name());
		prst.setString(3, pc.getSupplier_id());
		prst.setDate(4,new java.sql.Date(pc.getPurchase_time().getTime()));
		prst.setFloat(5, pc.getPrice());
		prst.setInt(6, pc.getNumber());
		if(prst.executeUpdate()>0)
			flag=true;
		return flag;
	}
	@Override
	public List<Purchase> findAll() throws Exception {
		List<Purchase> list=new ArrayList<Purchase>();
		String sql="select * from purchase";
		prst=conn.prepareStatement(sql);
		ResultSet rs=prst.executeQuery();
		while(rs.next()){
			Purchase p=new Purchase();
			p.setCommodity_id(rs.getString(2));
			p.setCommodity_name(rs.getString(3));
			p.setSupplier_id(rs.getString(4));
			p.setPurchase_time(rs.getDate(5));
			p.setPrice(rs.getFloat(6));
			p.setNumber(rs.getInt(7));
			list.add(p);
		}
		return list;
	}

}
