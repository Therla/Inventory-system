package com.java.service;

import java.util.List;

import com.java.pojo.Supplier;

public interface ISupplierService {
	/**
	 * ���й�Ӧ����Ϣ
	 */
	public List<Supplier> findAll() throws Exception;
}
