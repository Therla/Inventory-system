package com.dao.interfaces;

import java.util.List;

import com.pojo.Commodity_inventory;

/**
 * �����Ϣ
 * @author Ytt
 *	
 */
public interface IInventory {
	public List<Commodity_inventory> findAll() throws Exception;
}
