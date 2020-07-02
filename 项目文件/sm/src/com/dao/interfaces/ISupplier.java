package com.dao.interfaces;

import java.util.List;

import com.pojo.Supplier;

/**
 * 供应商信息
 * @author Ytt
 *
 */
public interface ISupplier {
	/**
	 * 所有供应商信息
	 * @return
	 * @throws Exception
	 */
	public List<Supplier> findAll() throws Exception;
}
