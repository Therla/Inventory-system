package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DaoFactory;
import com.pojo.Emp;

public class Emp_update extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String emp_id=req.getParameter("emp_id");
			String emp_name=req.getParameter("emp_name");
			String emp_account=req.getParameter("emp_account");
			String emp_pwd=req.getParameter("emp_pwd");
			String sex=req.getParameter("sex");
			String addres=req.getParameter("addres");
			String phone=req.getParameter("phone");
			Emp emp=new Emp(emp_id,emp_name,emp_account,emp_pwd,sex,addres,phone);
			if(DaoFactory.getEmp().doUpdate(emp)){
				resp.getWriter().write("修改成功");
			}else{
				resp.getWriter().write("修改失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.getWriter().write("修改失败");
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

}
