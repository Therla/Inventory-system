package com.java.mappers;

import java.util.List;

import com.java.pojo.Commodity_inventory;



/**
 * �����Ϣ
 * @author Ytt
 *	
 */
public interface IInventoryMapper {
	public List<Commodity_inventory> findAll() throws Exception;
}
