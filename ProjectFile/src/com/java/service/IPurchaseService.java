package com.java.service;

import java.util.List;


import com.java.pojo.Purchase;

public interface IPurchaseService {
	/**
	 * ������Ϣ¼��
	 */
	public int doInsert(Purchase pc) throws Exception;
	/**
	 * ��ѯ������¼
	 */
	public List<Purchase> findAll() throws Exception;
}
