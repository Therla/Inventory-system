package com.java.mappers;

import java.util.List;

import com.java.pojo.Emp;
/**
 * Ա����Ϣ
 * @author Yu
 *
 */
public interface IEmpMapper {
	/**
	 * Ա����¼��֤
	 * @param emp_account �û���
	 * @param emp_pwd	����
	 * @return emp����
	 * @throws Exception
	 */
	public Emp checkLogin(String emp_account,String emp_pwd) throws Exception;
	/**
	 * Ա����Ϣ����
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public int doInsert(Emp emp) throws Exception;
	/**
	 * ��ѯ����Ա����Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Emp> findAll() throws Exception;
	/**
	 * Ա�������޸�
	 * @param id
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	public int changePwd(String id,String pwd) throws Exception;
	/**
	 * Ա����Ϣ����
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public int doUpdate(Emp emp) throws Exception;
}
