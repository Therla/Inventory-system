package com.java.service;

import java.util.List;

import com.java.pojo.Commodity;


public interface ICommodityService {
	/**
	 * ��Ʒ��Ϣ¼��
	 */
	public int doInsert(Commodity cod) throws Exception;
	/**
	 * ������Ʒ��Ϣ
	 */
	public List<Commodity> findAll() throws Exception;
}
