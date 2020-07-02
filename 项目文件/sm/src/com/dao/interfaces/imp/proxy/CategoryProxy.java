package com.dao.interfaces.imp.proxy;

import java.sql.Connection;
import java.util.List;

import com.connection.DatabaseConnection;
import com.dao.interfaces.ICategory;
import com.dao.interfaces.imp.CategoryImp;
import com.pojo.Commodity_category;

/**
 * categoryimp 的代理
 * @author Ytt
 *
 */
public class CategoryProxy implements ICategory{
	private  ICategory dao;
	private Connection conn;
	public CategoryProxy() throws Exception{
		conn=new DatabaseConnection().getConnection();
		dao=new CategoryImp(conn);
	}
	/**
	 * 所有类别信息
	 */
	@Override
	public List<Commodity_category> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
