package com.java.service;

import java.util.List;

import com.java.pojo.Commodity_inventory;
public interface IInventoryService {
	/**
	 * ���п����Ϣ
	 */
	public List<Commodity_inventory> findAll() throws Exception;
}
