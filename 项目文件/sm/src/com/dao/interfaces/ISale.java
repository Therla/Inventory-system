package com.dao.interfaces;

import java.util.List;

import com.pojo.Emp_sale;

/**
 * ���ۼ�¼
 * @author Ytt
 *
 */
public interface ISale {
	/*
	 * �������ۼ�¼
	 */
	public List<Emp_sale> findAll() throws Exception;
	/**
	 * ���ۼ�¼���
	 * @return
	 * @throws Exception
	 */
	public boolean doInsert(Emp_sale e) throws Exception;
}
