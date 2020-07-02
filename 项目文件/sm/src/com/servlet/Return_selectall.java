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
import com.pojo.Purchase;
import com.pojo.Return;
/**
 * 返回所有退货信息
 * @author Ytt
 *
 */
public class Return_selectall extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 resp.setContentType("application/json;charset=utf-8");
		try {;
			List<Return> list=DaoFactory.getReturn().findAll();
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
