package com.java.mappers;

import java.util.List;

import com.java.pojo.Commodity;

/**
 * 商品信息 
 * @author Yu
 *
 */
public interface ICommodityMapper {
	/**
	 * 商品信息录入
	 * @param cod  
	 * @return
	 * @throws Exception
	 */
	public int doInsert(Commodity cod) throws Exception;
	/**
	 * 所有商品信息
	 * @return
	 * @throws Exception
	 */
	public List<Commodity> findAll() throws Exception;
}
