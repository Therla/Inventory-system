package com.java.service;

import java.util.List;

import com.java.pojo.Emp;

public interface IEmpService {
	/**
	 * 员工登录验证
	 */
	public Emp checkLogin(String emp_account,String emp_pwd) throws Exception;
	/**
	 * 员工信息插入
	 */
	public int doInsert(Emp emp) throws Exception;
	/**
	 * 查询所有员工信息
	 */
	public List<Emp> findAll() throws Exception;
	/**
	 * 员工密码修改
	 */
	public int changePwd(String id,String pwd) throws Exception;
	/**
	 * 员工信息更改
	 */
	public int doUpdate(Emp emp) throws Exception;
}
