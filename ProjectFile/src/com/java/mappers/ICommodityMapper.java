package com.java.mappers;

import java.util.List;

import com.java.pojo.Commodity;

/**
 * ��Ʒ��Ϣ 
 * @author Yu
 *
 */
public interface ICommodityMapper {
	/**
	 * ��Ʒ��Ϣ¼��
	 * @param cod  
	 * @return
	 * @throws Exception
	 */
	public int doInsert(Commodity cod) throws Exception;
	/**
	 * ������Ʒ��Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Commodity> findAll() throws Exception;
}
