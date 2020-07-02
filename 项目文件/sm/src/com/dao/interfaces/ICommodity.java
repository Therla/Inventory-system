package com.dao.interfaces;

import java.util.List;

import com.pojo.Commodity;
import com.pojo.Emp;

/**
 * 商品信息 
 * @author Ytt
 *
 */
public interface ICommodity {
	/**
	 * 商品信息录入
	 * @param cod  
	 * @return
	 * @throws Exception
	 */
	public boolean doInsert(Commodity cod) throws Exception;
	/**
	 * 所有商品信息
	 * @return
	 * @throws Exception
	 */
	public List<Commodity> findAll() throws Exception;
}
