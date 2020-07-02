package com.dao.interfaces.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.interfaces.ISale;
import com.pojo.Emp;
import com.pojo.Emp_sale;

public class SaleImp implements ISale{
	private Connection conn=null;
	private	PreparedStatement prst=null;
	public SaleImp(Connection conn){
		this.conn=conn;
	}
	@Override
	public List<Emp_sale> findAll() throws Exception {
		List<Emp_sale> list=new ArrayList<Emp_sale>();
		String sql="select * from emp_sale";
		prst=conn.prepareStatement(sql);
		ResultSet rs=prst.executeQuery();
		while(rs.next()){
			Emp_sale s=new Emp_sale();
			s.setEmp_id(rs.getString(2));
			s.setEmp_name(rs.getString(3));
			s.setCommodity_id(rs.getString(4));
			s.setCommodity_name(rs.getString(5));
			s.setCommodity_type(rs.getString(6));
			s.setCommodity_price(rs.getFloat(7));
			s.setNumber(rs.getInt(8));
			s.setSelling_time(rs.getDate(9));
			s.setTotal_price(rs.getFloat(10));
			list.add(s);
		}
		return list;
	}
	@Override
	public boolean doInsert(Emp_sale e) throws Exception {
		boolean flag=false;
		String sql="insert into emp_sale(emp_id,emp_name,commodity_id,commodity_name,commodity_type,commodity_price,number,selling_time) values(?,?,?,?,?,?,?,?)";
		prst=conn.prepareStatement(sql);
		prst.setString(1,e.getEmp_id());
		prst.setString(2, e.getEmp_name());
		prst.setString(3, e.getCommodity_id());
		prst.setString(4, e.getCommodity_name());
		prst.setString(5, e.getCommodity_type());
		prst.setFloat(6, e.getCommodity_price());
		prst.setInt(7, e.getNumber());
		prst.setDate(8, new java.sql.Date(e.getSelling_time().getTime()));
		if(prst.executeUpdate()>0)
			flag=true;
		return flag;
	}
}
