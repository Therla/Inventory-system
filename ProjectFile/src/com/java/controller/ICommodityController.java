package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.java.service.ICommodityService;
import com.java.pojo.Commodity;

@Controller
public class ICommodityController {
	@Autowired
	private ICommodityService commodityService;
	
	@RequestMapping("/goods_selectall")
	@ResponseBody
	public List<Commodity> goods_Selectall(){
		List<Commodity> list = null;
		try {
			list = commodityService.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/commodity_insert")
	@ResponseBody
	public String goods_Insert(String commodity_id, String commodity_name, String category_number,
			String commodity_type, Float commodity_price, String production_address, String remarks_information){
		try {

			Commodity cod=new Commodity(commodity_id, commodity_name, category_number, commodity_type, commodity_price, production_address, remarks_information);
			if(commodityService.doInsert(cod) > 0){
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
