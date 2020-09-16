package com.java.mappers;

import com.java.pojo.Admi;
/**
 * 管理员信息
 * @author Yu
 *
 */
public interface IAdmiMapper {
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
	 * @param id 用户id
	 * @param pwd 新密码
	 * @return
	 * @throws Exception
	 */
	public int changePwd(String id,String pwd) throws Exception;
}
