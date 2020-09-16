package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.pojo.Purchase;
import com.java.service.IPurchaseService;

@Controller
public class IPurchaseController {
	@Autowired
	private IPurchaseService purchaseService;
	
	@RequestMapping("/purchase_insert")
	@ResponseBody
	public String purchase_insert(Purchase pc){
		try {
			if(purchaseService.doInsert(pc) > 0){
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
	
	@RequestMapping("/purchase_selectall")
	@ResponseBody
	public List<Purchase> purchase_selectAll(){
		try {;
		List<Purchase> list=purchaseService.findAll();
		return  list;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}
}
