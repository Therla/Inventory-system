package com.java.service;

import com.java.pojo.Admi;

public interface IAdmiService {
	/**
	 * ��¼��֤
	 */
	public Admi checkLogin(String admi_account,String admi_pwd) throws Exception;
	/**
	 *	�����޸�
	 */
	public int changePwd(String id,String pwd) throws Exception;
}
