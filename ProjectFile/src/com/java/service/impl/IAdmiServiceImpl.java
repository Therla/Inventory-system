package com.java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mappers.IAdmiMapper;
import com.java.pojo.Admi;
import com.java.service.IAdmiService;
@Service
public class IAdmiServiceImpl implements IAdmiService{
	@Autowired
	private IAdmiMapper admiMapper;
	@Override
	public Admi checkLogin(String admi_account, String admi_pwd)
			throws Exception {
		// TODO Auto-generated method stub
		return admiMapper.checkLogin(admi_account, admi_pwd);
	}

	@Override
	public int changePwd(String id, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return admiMapper.changePwd(id, pwd);
	}

}
