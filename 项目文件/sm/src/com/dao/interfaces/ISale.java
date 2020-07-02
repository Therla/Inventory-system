package com.dao.interfaces;

import java.util.List;

import com.pojo.Emp_sale;

/**
 * 销售记录
 * @author Ytt
 *
 */
public interface ISale {
	/*
	 * 所有销售记录
	 */
	public List<Emp_sale> findAll() throws Exception;
	/**
	 * 销售记录添加
	 * @return
	 * @throws Exception
	 */
	public boolean doInsert(Emp_sale e) throws Exception;
}
