package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DaoFactory;
import com.google.gson.Gson;
import com.pojo.Commodity_category;
import com.pojo.Emp;
/**
 * 返回查询到的所有类别信息
 * @author Ytt
 *
 */
public class Category_Selectall extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 resp.setContentType("application/json;charset=utf-8");
		try {;
			List<Commodity_category> list=DaoFactory.getCategory().findAll();
			resp.getWriter().write(new Gson().toJson(list));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
