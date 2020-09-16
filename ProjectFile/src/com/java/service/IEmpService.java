package com.java.service;

import java.util.List;

import com.java.pojo.Emp;

public interface IEmpService {
	/**
	 * Ա����¼��֤
	 */
	public Emp checkLogin(String emp_account,String emp_pwd) throws Exception;
	/**
	 * Ա����Ϣ����
	 */
	public int doInsert(Emp emp) throws Exception;
	/**
	 * ��ѯ����Ա����Ϣ
	 */
	public List<Emp> findAll() throws Exception;
	/**
	 * Ա�������޸�
	 */
	public int changePwd(String id,String pwd) throws Exception;
	/**
	 * Ա����Ϣ����
	 */
	public int doUpdate(Emp emp) throws Exception;
}
