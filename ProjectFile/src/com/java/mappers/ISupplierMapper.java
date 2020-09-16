package com.java.mappers;

import java.util.List;

import com.java.pojo.Supplier;



/**
 * 供应商信息
 * @author Ytt
 *
 */
public interface ISupplierMapper {
	/**
	 * 所有供应商信息
	 * @return
	 * @throws Exception
	 */
	public List<Supplier> findAll() throws Exception;
}
