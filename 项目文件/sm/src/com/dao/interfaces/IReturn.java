package com.dao.interfaces;

import java.util.List;

import com.pojo.Return;


/**
 * 退货信息
 * @author Ytt
 *
 */
public interface IReturn {
	/**
	 * 退货信息录入
	 * @param rs
	 * @return
	 * @throws Exception
	 */
	public boolean doInsert(Return re) throws Exception;
	/**
	 * 查询退货信息
	 * @return
	 * @throws Exception
	 */
	public List<Return> findAll() throws Exception;
}
