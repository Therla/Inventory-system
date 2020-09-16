package com.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.service.IAdmiService;
import com.java.service.IEmpService;
import com.java.pojo.Admi;
import com.java.pojo.Emp;

@Controller
public class IAdmiController {
	@Autowired
	private IAdmiService admiService;
	@Autowired
	private IEmpService empService;
	
	@RequestMapping("/login")
	public String login(String username,String password,String oper,HttpServletRequest req){
		HttpSession hs=req.getSession();
		if("1".equals(oper)){
			try {
				Admi admi=admiService.checkLogin(username, password);
				if(admi!=null){
					//管理员登录成功
					hs.setAttribute("info", admi);
					return "admi/index";
				}else{
					//管理员登录失败
					req.setAttribute("erro", "用户或密码错误");
					return "login";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				Emp emp=empService.checkLogin(username, password);
				if(emp!=null){
					//员工登录成功
					hs.setAttribute("info", emp);
					return "staff/index";
				}else{
					//员工登录失败
					req.setAttribute("erro","用户或密码错误");
					return "login";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "login";
	}
	@RequestMapping("/admi_changepwd")
	@ResponseBody
	public String changePwd(String admi_id,String admi_pwd){
		try {
			if(admiService.changePwd(admi_id, admi_pwd)>0){
				return "修改成功";
			}else{
				return "修改失败";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "修改失败";
	}
	
	@RequestMapping("/signOut")
	public String signOut(HttpServletRequest req){
		HttpSession hs=req.getSession();
		hs.invalidate();
		return "login";
	}
	
}
