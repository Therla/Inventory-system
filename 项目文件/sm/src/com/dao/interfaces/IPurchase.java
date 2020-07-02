package com.dao.interfaces;

import java.util.List;

import com.pojo.Purchase;

/**
 * 进货信息
 * @author Ytt
 *
 */
public interface IPurchase {
	/**
	 * 进货信息录入
	 * @param pc
	 * @return
	 * @throws Exception
	 */
	public boolean doInsert(Purchase pc) throws Exception;
	/**
	 * 查询进货记录
	 * @return
	 * @throws Exception
	 */
	public List<Purchase> findAll() throws Exception;
}
