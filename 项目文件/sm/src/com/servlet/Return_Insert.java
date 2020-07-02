package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DaoFactory;
import com.pojo.Purchase;
import com.pojo.Return;

public class Return_Insert extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String commodity_id=req.getParameter("commodity_id");
			String commodity_name=req.getParameter("commodity_name");
			String supplier_id=req.getParameter("supplier_id");
			DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");  
			Date return_time=format1.parse(req.getParameter("return_time"));
			int number=Integer.parseInt(req.getParameter("number"));
			float price=Float.parseFloat(req.getParameter("price"));
			Return re=new Return(commodity_id, commodity_name, supplier_id, return_time, price, number);
			System.out.println(re);
			if(DaoFactory.getReturn().doInsert(re)){
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
