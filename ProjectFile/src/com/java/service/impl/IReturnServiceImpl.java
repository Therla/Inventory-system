package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mappers.IReturnMapper;
import com.java.pojo.Return;
import com.java.service.IReturnService;
@Service
public class IReturnServiceImpl  implements IReturnService{
	@Autowired
	private IReturnMapper returnMapper;
	@Override
	public int doInsert(Return re) throws Exception {
		// TODO Auto-generated method stub
		return returnMapper.doInsert(re);
	}

	@Override
	public List<Return> findAll() throws Exception {
		// TODO Auto-generated method stub
		return returnMapper.findAll();
	}

}
