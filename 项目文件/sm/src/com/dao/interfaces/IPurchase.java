package com.dao.interfaces;

import java.util.List;

import com.pojo.Purchase;

/**
 * ������Ϣ
 * @author Ytt
 *
 */
public interface IPurchase {
	/**
	 * ������Ϣ¼��
	 * @param pc
	 * @return
	 * @throws Exception
	 */
	public boolean doInsert(Purchase pc) throws Exception;
	/**
	 * ��ѯ������¼
	 * @return
	 * @throws Exception
	 */
	public List<Purchase> findAll() throws Exception;
}
