package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mappers.ICommodityMapper;
import com.java.pojo.Commodity;
import com.java.service.ICommodityService;
@Service
public class ICommodityServiceImpl implements ICommodityService{
	@Autowired
	private ICommodityMapper commodityMapper;
	@Override
	public int doInsert(Commodity cod) throws Exception {
		// TODO Auto-generated method stub
		return commodityMapper.doInsert(cod);
	}

	@Override
	public List<Commodity> findAll() throws Exception {
		// TODO Auto-generated method stub
		return commodityMapper.findAll();
	}

}
