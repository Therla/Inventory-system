package com.java.mappers;

import java.util.List;

import com.java.pojo.Return;


/**
 * 退货信息
 * @author Ytt
 *
 */
public interface IReturnMapper {
	/**
	 * 退货信息录入
	 * @param rs
	 * @return
	 * @throws Exception
	 */
	public int doInsert(Return re) throws Exception;
	/**
	 * 查询退货信息
	 * @return
	 * @throws Exception
	 */
	public List<Return> findAll() throws Exception;
}
