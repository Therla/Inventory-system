package com.dao.interfaces;

import com.pojo.Admi;
/**
 * 管理员信息
 * @author Ytt
 *
 */
public interface IAdmi {
	/**
	 * 登录验证
	 * @param admi_account 用户名
	 * @param admi_pwd	密码
	 * @return admi类型对象
	 * @throws Exception
	 */
	public Admi checkLogin(String admi_account,String admi_pwd) throws Exception;
	/**
	 *	密码修改
	 * @param id 
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	public boolean changePwd(String id,String pwd) throws Exception;
}
