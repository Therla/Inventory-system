package com.dao.interfaces.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import com.connection.DatabaseConnection;
import com.dao.DaoFactory;
import com.dao.interfaces.IReturn;
import com.pojo.Purchase;
import com.pojo.Return;
/**
 * 退货信息的数据库操作
 * @author Ytt
 *
 */
public class ReturnImp implements IReturn{
	private Connection conn=null;
	private	PreparedStatement prst=null;
	public ReturnImp(Connection conn){
		this.conn=conn;
	}
	/**
	 * 退货信息 录入
	 */
	@Override
	public boolean doInsert(Return re) throws Exception {
		boolean flag=false;
		String sql="insert into return_goods(commodity_id,commodity_name,supplier_id,return_time,price,number) values(?,?,?,?,?,?)";
		System.out.println(re);
		prst=conn.prepareStatement(sql);
		prst.setString(1, re.getCommodity_id());
		prst.setString(2, re.getCommodity_name());
		prst.setString(3, re.getSupplier_id());
		prst.setDate(4,new java.sql.Date(re.getReturn_time().getTime()));
		prst.setFloat(5, re.getPrice());
		prst.setInt(6, re.getNumber());
		if(prst.executeUpdate()>0)
			flag=true;
		return flag;
	}
	@Override
	public List<Return> findAll() throws Exception {
		List<Return> list=new ArrayList<Return>();
		String sql="select * from return_goods";
		prst=conn.prepareStatement(sql);
		ResultSet rs=prst.executeQuery();
		while(rs.next()){
			Return p=new Return();
			p.setCommodity_id(rs.getString(2));
			p.setCommodity_name(rs.getString(3));
			p.setSupplier_id(rs.getString(4));
			p.setReturn_time(rs.getDate(5));
			p.setPrice(rs.getFloat(6));
			p.setNumber(rs.getInt(7));
			list.add(p);
		}
		return list;
	}
}
