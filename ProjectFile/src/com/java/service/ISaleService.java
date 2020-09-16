package com.java.service;

import java.util.List;

import com.java.pojo.Emp_sale;

public interface ISaleService {
	/*
	 * 所有销售记录
	 */
	public List<Emp_sale> findAll() throws Exception;
	/**
	 * 销售记录添加
	 */
	public int doInsert(Emp_sale e) throws Exception;
}
