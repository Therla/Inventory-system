package com.dao.interfaces;

import java.util.List;

import com.pojo.Emp;
/**
 * 员工信息
 * @author Ytt
 *
 */
public interface IEmp {
	/**
	 * 员工登录验证
	 * @param emp_account 用户名
	 * @param emp_pwd	密码
	 * @return emp对象
	 * @throws Exception
	 */
	public Emp checkLogin(String emp_account,String emp_pwd) throws Exception;
	/**
	 * 员工信息插入
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public boolean doInsert(Emp emp) throws Exception;
	/**
	 * 查询所有员工信息
	 * @return
	 * @throws Exception
	 */
	public List<Emp> findAll() throws Exception;
	/**
	 * 员工密码修改
	 * @param id
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	public boolean changePwd(String id,String pwd) throws Exception;
	/**
	 * 员工信息更改
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public boolean doUpdate(Emp emp) throws Exception;
}
