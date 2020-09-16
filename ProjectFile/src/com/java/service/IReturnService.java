package com.java.service;

import java.util.List;

import com.java.pojo.Return;

public interface IReturnService {
	/**
	 * 退货信息录入
	 */
	public int doInsert(Return re) throws Exception;
	/**
	 * 查询退货信息
	 */
	public List<Return> findAll() throws Exception;
}
