package com.java.mappers;

import java.util.List;

import com.java.pojo.Emp_sale;
/**
 * 销售记录
 * @author Ytt
 *
 */
public interface ISaleMapper {
	/*
	 * 所有销售记录
	 */
	public List<Emp_sale> findAll() throws Exception;
	/**
	 * 销售记录添加
	 * @return
	 * @throws Exception
	 */
	public int doInsert(Emp_sale e) throws Exception;
}
