package com.java.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.java.service.ISupplierService;

import com.java.pojo.Supplier;

@Controller
public class ISupplierController {
	@Autowired
	private ISupplierService supplierService;

	@RequestMapping("/supplier_selectall")
	@ResponseBody
	public List<Supplier> supplier_selectAll(){
		try {;
		List<Supplier> list=supplierService.findAll();
		return list;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}
}
