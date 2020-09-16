package com.java.service;

import java.util.List;


import com.java.pojo.Purchase;

public interface IPurchaseService {
	/**
	 * 进货信息录入
	 */
	public int doInsert(Purchase pc) throws Exception;
	/**
	 * 查询进货记录
	 */
	public List<Purchase> findAll() throws Exception;
}
