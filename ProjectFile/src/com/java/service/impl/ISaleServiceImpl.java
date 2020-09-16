package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mappers.ISaleMapper;
import com.java.pojo.Emp_sale;
import com.java.service.ISaleService;
@Service
public class ISaleServiceImpl implements ISaleService{
	@Autowired
	private ISaleMapper saleMapper;
	@Override
	public List<Emp_sale> findAll() throws Exception {
		// TODO Auto-generated method stub
		return saleMapper.findAll();
	}

	@Override
	public int doInsert(Emp_sale e) throws Exception {
		// TODO Auto-generated method stub
		return saleMapper.doInsert(e);
	}

}
