package com.dao.interfaces;

import java.util.List;

import com.pojo.Return;


/**
 * �˻���Ϣ
 * @author Ytt
 *
 */
public interface IReturn {
	/**
	 * �˻���Ϣ¼��
	 * @param rs
	 * @return
	 * @throws Exception
	 */
	public boolean doInsert(Return re) throws Exception;
	/**
	 * ��ѯ�˻���Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Return> findAll() throws Exception;
}
