package com.java.service;

import java.util.List;

import com.java.pojo.Emp_sale;

public interface ISaleService {
	/*
	 * �������ۼ�¼
	 */
	public List<Emp_sale> findAll() throws Exception;
	/**
	 * ���ۼ�¼���
	 */
	public int doInsert(Emp_sale e) throws Exception;
}
