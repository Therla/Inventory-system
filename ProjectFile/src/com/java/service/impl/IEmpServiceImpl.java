package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.java.mappers.IEmpMapper;
import com.java.pojo.Emp;
import com.java.service.IEmpService;
@Service
public class IEmpServiceImpl implements IEmpService{
	@Autowired
	private IEmpMapper empMapper;

	@Override
	public Emp checkLogin(String emp_account, String emp_pwd) throws Exception {
		// TODO Auto-generated method stub
		return empMapper.checkLogin(emp_account, emp_pwd);
	}

	@Override
	public int doInsert(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		return empMapper.doInsert(emp);
	}

	@Override
	public List<Emp> findAll() throws Exception {
		// TODO Auto-generated method stub
		return empMapper.findAll();
	}

	@Override
	public int changePwd(String id, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return empMapper.changePwd(id, pwd);
	}

	@Override
	public int doUpdate(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		return empMapper.doUpdate(emp);
	}


}
