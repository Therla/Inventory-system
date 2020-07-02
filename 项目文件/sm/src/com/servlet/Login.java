package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DaoFactory;
import com.pojo.Admi;
import com.pojo.Emp;
/**
 * 登录请求处理
 * @author Ytt
 *
 */
public class Login extends HttpServlet {
	@Override
	/**
	 * 登录请求处理，进行权限判定
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String oper=req.getParameter("oper");
		HttpSession hs=req.getSession();
		if("1".equals(oper)){
			try {
				Admi admi=DaoFactory.getAdmi().checkLogin(username, password);
				if(admi!=null){
					//管理员登录成功
					hs.setAttribute("info", admi);
					resp.sendRedirect("/sm/admi/index.jsp");
				}else{
					//管理员登录失败
					req.setAttribute("erro", "用户或密码错误");
					req.getRequestDispatcher("login.jsp").forward(req, resp);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				Emp emp=DaoFactory.getEmp().checkLogin(username, password);
				if(emp!=null){
					//员工登录成功
					hs.setAttribute("info", emp);
					resp.sendRedirect("/sm/staff/index.jsp");
				}else{
					//员工登录失败
					req.setAttribute("erro","用户或密码错误");
					req.getRequestDispatcher("login.jsp").forward(req, resp);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

}
