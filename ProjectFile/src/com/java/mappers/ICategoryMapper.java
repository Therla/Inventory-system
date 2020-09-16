package com.java.mappers;

import java.util.List;

import com.java.pojo.Commodity_category;

/**
 * 类别信息
 * @author Yu
 *
 */
public interface ICategoryMapper {
	/**
	 * 所有类别信息
	 * @return
	 * @throws Exception
	 */
	public List<Commodity_category> findAll() throws Exception;
}
