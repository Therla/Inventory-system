package com.java.mappers;

import java.util.List;

import com.java.pojo.Commodity_category;

/**
 * �����Ϣ
 * @author Yu
 *
 */
public interface ICategoryMapper {
	/**
	 * ���������Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Commodity_category> findAll() throws Exception;
}
