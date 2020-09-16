package com.java.service;

import java.util.List;

import com.java.pojo.Commodity;


public interface ICommodityService {
	/**
	 * 商品信息录入
	 */
	public int doInsert(Commodity cod) throws Exception;
	/**
	 * 所有商品信息
	 */
	public List<Commodity> findAll() throws Exception;
}
