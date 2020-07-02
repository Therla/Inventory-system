package com.dao.interfaces.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.interfaces.ICommodity;
import com.pojo.Commodity;
import com.pojo.Emp;
/**
 * 商品信息的数据库操作
 * @author Ytt
 *
 */
public class CommodityImp implements ICommodity{
	private Connection conn=null;
	private	PreparedStatement prst=null;
	public CommodityImp(Connection conn){
		this.conn=conn;
	}
	/**
	 * 插入数据
	 */
	@Override
	public boolean doInsert(Commodity cod) throws Exception {
		// TODO Auto-generated method stub
		boolean flag=false;
		String sql="insert into commodity values(?,?,?,?,?,?,?)";
		prst=conn.prepareStatement(sql);
		prst.setString(1, cod.getCommodity_id());
		prst.setString(2, cod.getCommodity_name());
		prst.setString(3, cod.getCategory_number());
		prst.setString(4, cod.getCommodity_type());
		prst.setFloat(5, cod.getCommodity_price());
		prst.setString(6, cod.getProduction_address());
		prst.setString(7, cod.getRemarks_information());
		if(prst.executeUpdate()>0)
			flag=true;
		return flag;
	}
	/**
	 * 
	 */
	@Override
	public List<Commodity> findAll() throws Exception {
		List<Commodity> list=new ArrayList<Commodity>();
		String sql="select * from commodity";
		prst=conn.prepareStatement(sql);
		ResultSet rs=prst.executeQuery();
		while(rs.next()){
			Commodity com=new Commodity();
			com.setCommodity_id(rs.getString(1));
			com.setCommodity_name(rs.getString(2));
			com.setCategory_number(rs.getString(3));
			com.setCommodity_type(rs.getString(4));
			com.setCommodity_price(rs.getFloat(5));
			com.setProduction_address(rs.getString(6));
			com.setRemarks_information(rs.getString(7));
			list.add(com);
		}
		return list;
	}

}
