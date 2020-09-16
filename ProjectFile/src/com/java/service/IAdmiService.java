package com.java.service;

import com.java.pojo.Admi;

public interface IAdmiService {
	/**
	 * µÇÂ¼ÑéÖ¤
	 */
	public Admi checkLogin(String admi_account,String admi_pwd) throws Exception;
	/**
	 *	ÃÜÂëĞŞ¸Ä
	 */
	public int changePwd(String id,String pwd) throws Exception;
}
