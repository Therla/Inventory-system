package com.dao.interfaces.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.interfaces.ISupplier;
import com.pojo.Emp;
import com.pojo.Supplier;

public class SupplierImp implements ISupplier{
	private Connection conn=null;
	private	PreparedStatement prst=null;
	public SupplierImp(Connection conn){
		this.conn=conn;
	}
	@Override
	public List<Supplier> findAll() throws Exception {
		List<Supplier> list=new ArrayList<Supplier>();
		String sql="select * from supplier";
		prst=conn.prepareStatement(sql);
		ResultSet rs=prst.executeQuery();
		while(rs.next()){
			Supplier s=new Supplier();
			s.setSupplier_id(rs.getString(1));
			s.setSupplier_name(rs.getString(2));
			s.setOrganization_code(rs.getString(3));
			s.setContacts(rs.getString(4));
			s.setContact_number(rs.getString(5));
			s.setCorporate_representative(rs.getString(6));
			s.setEmail(rs.getString(7));
			list.add(s);
		}
		return list;
	}
}
