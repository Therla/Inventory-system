package com.java.mappers;

import java.util.List;

import com.java.pojo.Return;


/**
 * �˻���Ϣ
 * @author Ytt
 *
 */
public interface IReturnMapper {
	/**
	 * �˻���Ϣ¼��
	 * @param rs
	 * @return
	 * @throws Exception
	 */
	public int doInsert(Return re) throws Exception;
	/**
	 * ��ѯ�˻���Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Return> findAll() throws Exception;
}
