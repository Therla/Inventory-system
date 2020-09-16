package com.java.mappers;

import java.util.List;

import com.java.pojo.Purchase;


/**
 * 进货信息
 * @author Ytt
 *
 */
public interface IPurchaseMapper {
	/**
	 * 进货信息录入
	 * @param pc
	 * @return
	 * @throws Exception
	 */
	public int doInsert(Purchase pc) throws Exception;
	/**
	 * 查询进货记录
	 * @return
	 * @throws Exception
	 */
	public List<Purchase> findAll() throws Exception;
}
