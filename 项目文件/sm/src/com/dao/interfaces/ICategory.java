package com.dao.interfaces;

import java.util.List;

import com.pojo.Commodity_category;

/**
 * �����Ϣ
 * @author Ytt
 *
 */
public interface ICategory {
	/**
	 * ���������Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Commodity_category> findAll() throws Exception;
}
