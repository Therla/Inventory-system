package com.java.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import com.java.service.ISaleService;
import com.java.pojo.Emp_sale;

@Controller
public class ISaleController {
	@Autowired
	private ISaleService saleService;

	@RequestMapping("/sale_selectall")
	@ResponseBody
	public List<Emp_sale> sale_selectAll(){
		try {;
		List<Emp_sale> list=saleService.findAll();
		return  list;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}
	
	@RequestMapping("/sale_insert")
	@ResponseBody
	public String sale_insert(Emp_sale es){
		try {
			if(saleService.doInsert(es) > 0 ){
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
}
