package com.dao.interfaces;

import java.util.List;

import com.pojo.Commodity_category;

/**
 * 类别信息
 * @author Ytt
 *
 */
public interface ICategory {
	/**
	 * 所有类别信息
	 * @return
	 * @throws Exception
	 */
	public List<Commodity_category> findAll() throws Exception;
}
