package com.java.service;

import java.util.List;

import com.java.pojo.Supplier;

public interface ISupplierService {
	/**
	 * 所有供应商信息
	 */
	public List<Supplier> findAll() throws Exception;
}
