package com.java.mappers;

import java.util.List;

import com.java.pojo.Emp_sale;
/**
 * ���ۼ�¼
 * @author Ytt
 *
 */
public interface ISaleMapper {
	/*
	 * �������ۼ�¼
	 */
	public List<Emp_sale> findAll() throws Exception;
	/**
	 * ���ۼ�¼���
	 * @return
	 * @throws Exception
	 */
	public int doInsert(Emp_sale e) throws Exception;
}
