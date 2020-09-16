package com.java.mappers;

import java.util.List;

import com.java.pojo.Purchase;


/**
 * ������Ϣ
 * @author Ytt
 *
 */
public interface IPurchaseMapper {
	/**
	 * ������Ϣ¼��
	 * @param pc
	 * @return
	 * @throws Exception
	 */
	public int doInsert(Purchase pc) throws Exception;
	/**
	 * ��ѯ������¼
	 * @return
	 * @throws Exception
	 */
	public List<Purchase> findAll() throws Exception;
}
