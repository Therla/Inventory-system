package com.java.service;

import java.util.List;

import com.java.pojo.Return;

public interface IReturnService {
	/**
	 * �˻���Ϣ¼��
	 */
	public int doInsert(Return re) throws Exception;
	/**
	 * ��ѯ�˻���Ϣ
	 */
	public List<Return> findAll() throws Exception;
}
