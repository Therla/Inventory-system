package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mappers.IInventoryMapper;
import com.java.pojo.Commodity_inventory;
import com.java.service.IInventoryService;
@Service
public class IInventoryServiceImpl implements IInventoryService{
	@Autowired
	private IInventoryMapper inventoryMapper;
	@Override
	public List<Commodity_inventory> findAll() throws Exception {
		// TODO Auto-generated method stub
		return inventoryMapper.findAll();
	}

}
