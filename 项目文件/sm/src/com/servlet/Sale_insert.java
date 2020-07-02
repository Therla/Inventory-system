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
import com.pojo.Emp_sale;
import com.pojo.Purchase;

public class Sale_insert extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
			String emp_id=req.getParameter("emp_id");
			String emp_name=req.getParameter("emp_name");
			String commodity_id=req.getParameter("commodity_id");
			String commodity_name=req.getParameter("commodity_name");
			String commodity_type=req.getParameter("commodity_type");
			DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");  
			Date selling_time=format1.parse(req.getParameter("selling_time"));
			int number=Integer.parseInt(req.getParameter("number"));
			float commodity_price=Float.parseFloat(req.getParameter("commodity_price"));
			Emp_sale es=new Emp_sale(emp_id, emp_name, commodity_id, commodity_name, commodity_type, commodity_price, number, selling_time, 0);
			System.out.println(es);
			if(DaoFactory.getSale().doInsert(es)){
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
