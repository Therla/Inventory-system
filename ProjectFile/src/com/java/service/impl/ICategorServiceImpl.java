package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mappers.ICategoryMapper;
import com.java.pojo.Commodity_category;
import com.java.service.ICategorService;
@Service
public class ICategorServiceImpl implements ICategorService{
	@Autowired
	private ICategoryMapper categoryMapper;

	@Override
	public List<Commodity_category> findAll() throws Exception {
		// TODO Auto-generated method stub
		return categoryMapper.findAll();
	}


}
