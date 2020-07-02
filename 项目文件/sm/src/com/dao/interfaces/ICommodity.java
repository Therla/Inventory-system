package com.dao.interfaces;

import java.util.List;

import com.pojo.Commodity;
import com.pojo.Emp;

/**
 * ��Ʒ��Ϣ 
 * @author Ytt
 *
 */
public interface ICommodity {
	/**
	 * ��Ʒ��Ϣ¼��
	 * @param cod  
	 * @return
	 * @throws Exception
	 */
	public boolean doInsert(Commodity cod) throws Exception;
	/**
	 * ������Ʒ��Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Commodity> findAll() throws Exception;
}
