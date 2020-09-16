package com.java.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.pojo.Emp;
import com.java.service.IEmpService;
@Controller
public class IEmpController {
	@Autowired
	private IEmpService empService;
	
	@RequestMapping("/emp_insert")
	@ResponseBody
	public String emp_Insert(Emp emp){
		try {
			if(empService.doInsert(emp) > 0){
				return "¼��ɹ�";
			}else{
				return "¼��ʧ��";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "¼��ʧ��";
		}
	}
	
	@RequestMapping("/emp_selectall")
	@ResponseBody
	public List<Emp> emp_Selectall(){
		try {
		List<Emp> list=empService.findAll();
		return list;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}
	
	@RequestMapping("/emp_update")
	@ResponseBody
	public String emp_Update(Emp emp){
		try {
			if(empService.doUpdate(emp) > 0){
				return "�޸ĳɹ�";
			}else{
				return "�޸�ʧ��";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "�޸�ʧ��";
		}
	}
	
	@RequestMapping("/emp_changepwd")
	@ResponseBody
	public String emp_ChangePwd(String emp_id, String emp_pwd){
		try {
			if(empService.changePwd(emp_id, emp_pwd) > 0){
				return "�޸ĳɹ�";
			}else{
				return "�޸�ʧ��";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "�޸�ʧ��";
		}
	}
}
