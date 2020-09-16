package com.java.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.pojo.Return;
import com.java.service.IReturnService;

@Controller
public class IReturnController {
	@Autowired
	private IReturnService returnService;

	@RequestMapping("/return_insert")
	@ResponseBody
	public String return_insert(Return re){
		try {
			if(returnService.doInsert(re) > 0){
				return "录入成功";
			}else{
				return "录入失败";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "录入失败";
		}
	}
	
	@RequestMapping("/return_selectall")
	@ResponseBody
	public List<Return> return_selectAll(){
		try {;
		List<Return> list=returnService.findAll();
		return list;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}
}
