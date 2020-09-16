package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mappers.ISupplierMapper;
import com.java.pojo.Supplier;
import com.java.service.ISupplierService;
@Service
public class ISupplierServiceImpl implements ISupplierService{
	@Autowired
	private ISupplierMapper supplierMapper;

	@Override
	public List<Supplier> findAll() throws Exception {
		// TODO Auto-generated method stub
		return supplierMapper.findAll();
	}

	
}
