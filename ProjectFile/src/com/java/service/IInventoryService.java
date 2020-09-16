package com.java.service;

import java.util.List;

import com.java.pojo.Commodity_inventory;
public interface IInventoryService {
	/**
	 * 所有库存信息
	 */
	public List<Commodity_inventory> findAll() throws Exception;
}
