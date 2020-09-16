package com.java.mappers;

import com.java.pojo.Admi;
/**
 * ����Ա��Ϣ
 * @author Yu
 *
 */
public interface IAdmiMapper {
	/**
	 * ��¼��֤
	 * @param admi_account �û���
	 * @param admi_pwd	����
	 * @return admi���Ͷ���
	 * @throws Exception
	 */
	public Admi checkLogin(String admi_account,String admi_pwd) throws Exception;
	/**
	 *	�����޸�
	 * @param id �û�id
	 * @param pwd ������
	 * @return
	 * @throws Exception
	 */
	public int changePwd(String id,String pwd) throws Exception;
}
