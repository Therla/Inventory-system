package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.pojo.Commodity_inventory;
import com.java.service.IInventoryService;

@Controller
public class IInventoryController {
	@Autowired
	private IInventoryService inventoryService;
	
	@RequestMapping("/inventory_selectall")
	@ResponseBody
	public Commodity_inventory inventory_selectAll(){
		try {;
			List<Commodity_inventory> list = inventoryService.findAll();
			return (Commodity_inventory) list;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
