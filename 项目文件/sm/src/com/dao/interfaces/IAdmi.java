package com.dao.interfaces;

import com.pojo.Admi;
/**
 * ����Ա��Ϣ
 * @author Ytt
 *
 */
public interface IAdmi {
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
	 * @param id 
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	public boolean changePwd(String id,String pwd) throws Exception;
}
