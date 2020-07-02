package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DaoFactory;
import com.pojo.Commodity;

public class Admi_Changepwd extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String admi_id=req.getParameter("admi_id");
			String admi_pwd=req.getParameter("admi_pwd");
			if(DaoFactory.getAdmi().changePwd(admi_id, admi_pwd)){
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
