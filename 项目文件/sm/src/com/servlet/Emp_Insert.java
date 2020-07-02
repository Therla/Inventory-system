package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DaoFactory;
import com.google.gson.Gson;
import com.pojo.Emp;
/**
 * �û���Ϣ����
 * @author Ytt
 *
 */
public class Emp_Insert extends HttpServlet {
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
			System.out.println(emp);
			if(DaoFactory.getEmp().doInsert(emp)){
				resp.getWriter().write("¼��ɹ�");
			}else{
				resp.getWriter().write("¼��ʧ��");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.getWriter().write("¼��ʧ��");
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

}
