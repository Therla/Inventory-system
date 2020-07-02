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
import com.pojo.Emp;
import com.pojo.Purchase;

public class Purchase_insert extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String commodity_id=req.getParameter("commodity_id");
			String commodity_name=req.getParameter("commodity_name");
			String supplier_id=req.getParameter("supplier_id");
			DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");  
			Date purchase_time=format1.parse(req.getParameter("purchase_time"));
			int number=Integer.parseInt(req.getParameter("number"));
			float price=Float.parseFloat(req.getParameter("price"));
			Purchase pc=new Purchase(commodity_id, commodity_name, supplier_id, purchase_time, price, number);
			System.out.println(pc);
			if(DaoFactory.getPurchase().doInsert(pc)){
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
