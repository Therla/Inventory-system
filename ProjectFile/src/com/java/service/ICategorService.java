package com.java.service;

import java.util.List;

import com.java.pojo.Commodity_category;
public interface ICategorService {
	/**
	 * ��ʾ���������Ϣ
	 */
	public List<Commodity_category> findAll() throws Exception;
}
