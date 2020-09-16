package com.java.service;

import java.util.List;

import com.java.pojo.Commodity_category;
public interface ICategorService {
	/**
	 * 显示所有类别信息
	 */
	public List<Commodity_category> findAll() throws Exception;
}
