package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DaoFactory;
import com.pojo.Commodity;
import com.pojo.Emp;

public class Commodity_Insert extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String commodity_id=req.getParameter("commodity_id");
			String commodity_name=req.getParameter("commodity_name");
			String category_number=req.getParameter("category_number");
			String commodity_type=req.getParameter("commodity_type");
			Float commodity_price=Float.parseFloat(req.getParameter("commodity_price"));
			String production_address=req.getParameter("production_address");
			String remarks_information=req.getParameter("remarks_information");
			Commodity cod=new Commodity(commodity_id, commodity_name, category_number, commodity_type, commodity_price, production_address, remarks_information);
			System.out.println(cod);
			if(DaoFactory.getCommodity().doInsert(cod)){
				resp.getWriter().write("录入成功");
			}else{
				resp.getWriter().write("录入失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.getWriter().write("录入失败");
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
