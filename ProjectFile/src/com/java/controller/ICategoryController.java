package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.service.ICategorService;

import com.java.pojo.Commodity_category;

@Controller
public class ICategoryController {
	@Autowired
	private ICategorService categorService;
	
	@RequestMapping("/category_selectall")
	@ResponseBody
	public List<Commodity_category> Category_Selectall(){
		try {
		List<Commodity_category> list=categorService.findAll();
		return list;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;

	}
}
