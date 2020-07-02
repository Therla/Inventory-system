package com.dao.interfaces.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.interfaces.ICategory;
import com.pojo.Commodity_category;
import com.pojo.Emp;
/**
 * 类别信息的数据库操作
 * @author Ytt
 *
 */
public class CategoryImp implements ICategory{
	private Connection conn=null;
	private	PreparedStatement prst=null;
	public CategoryImp (Connection conn){
		this.conn=conn;
	}
	
	/**
	 * 所有类别信息
	 */
	@Override
	public List<Commodity_category> findAll() throws Exception {
		List<Commodity_category> list=new ArrayList<Commodity_category>();
		String sql="select * from commodity_category";
		prst=conn.prepareStatement(sql);
		ResultSet rs=prst.executeQuery();
		while(rs.next()){
			Commodity_category ca=new Commodity_category();
			ca.setCategory_number(rs.getString(1));
			ca.setCommodity_type(rs.getString(2));
			ca.setCategory_description(rs.getString(3));
			list.add(ca);
		}
		return list;
	}

}
