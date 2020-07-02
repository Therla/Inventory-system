package com.dao.interfaces.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dao.interfaces.IAdmi;
import com.pojo.Admi;
/**
 * 管理员信息的数据库操作
 * @author Ytt
 *
 */
public class AdmiImp implements IAdmi{
	private Connection conn=null;
	private	PreparedStatement prst=null;
	public AdmiImp(Connection conn){
		this.conn=conn;
	}
	/**
	 * 管理员登录验证
	 */
	@Override
	public Admi checkLogin(String admi_account, String admi_pwd)
			throws Exception {
		Admi admi=null;
		String sql="select * from admi where admi_account=? and admi_pwd=?";
		prst=conn.prepareStatement(sql);
		prst.setString(1, admi_account);
		prst.setString(2, admi_pwd);
		ResultSet rs=prst.executeQuery();
		if(rs.next()){
			admi=new Admi(rs.getString("admi_id"),rs.getString("admi_name"),admi_account,admi_pwd);
		}
		return admi;
	}
	/**
	 * 密码修改
	 */
	@Override
	public boolean changePwd(String id, String pwd) throws Exception {
		boolean flag=false;
		String sql="update admi set admi_pwd=? where admi_id=?";
		prst=conn.prepareStatement(sql);
		prst.setString(1, pwd);
		prst.setString(2,id);
		if(prst.executeUpdate()>0)
			flag=true;
		return flag;
	}

}
