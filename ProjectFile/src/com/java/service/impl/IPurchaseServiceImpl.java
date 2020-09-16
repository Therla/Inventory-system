package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mappers.IPurchaseMapper;

import com.java.pojo.Purchase;
import com.java.service.IPurchaseService;

@Service
public class IPurchaseServiceImpl  implements IPurchaseService{
	@Autowired
	private IPurchaseMapper purchaseMapper;

	@Override
	public int doInsert(Purchase pc) throws Exception {
		// TODO Auto-generated method stub
		return purchaseMapper.doInsert(pc);
	}

	@Override
	public List<Purchase> findAll() throws Exception {
		// TODO Auto-generated method stub
		return purchaseMapper.findAll();
	}


}
