package com.java.mappers;

import java.util.List;

import com.java.pojo.Supplier;



/**
 * ��Ӧ����Ϣ
 * @author Ytt
 *
 */
public interface ISupplierMapper {
	/**
	 * ���й�Ӧ����Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Supplier> findAll() throws Exception;
}
