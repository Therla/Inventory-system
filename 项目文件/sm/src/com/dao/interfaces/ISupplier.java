package com.dao.interfaces;

import java.util.List;

import com.pojo.Supplier;

/**
 * ��Ӧ����Ϣ
 * @author Ytt
 *
 */
public interface ISupplier {
	/**
	 * ���й�Ӧ����Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Supplier> findAll() throws Exception;
}
