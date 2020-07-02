package com.dao;

import java.util.List;

import com.dao.interfaces.IAdmi;
import com.dao.interfaces.ICategory;
import com.dao.interfaces.ICommodity;
import com.dao.interfaces.IEmp;
import com.dao.interfaces.IInventory;
import com.dao.interfaces.IPurchase;
import com.dao.interfaces.IReturn;
import com.dao.interfaces.ISale;
import com.dao.interfaces.ISupplier;
import com.dao.interfaces.imp.proxy.AdmiProxy;
import com.dao.interfaces.imp.proxy.CategoryProxy;
import com.dao.interfaces.imp.proxy.CommodityProxy;
import com.dao.interfaces.imp.proxy.EmpProxy;
import com.dao.interfaces.imp.proxy.InventoryProxy;
import com.dao.interfaces.imp.proxy.PurchaseProxy;
import com.dao.interfaces.imp.proxy.ReturnProxy;
import com.dao.interfaces.imp.proxy.SaleProxy;
import com.dao.interfaces.imp.proxy.SupplierProxy;
import com.google.gson.Gson;
import com.pojo.Admi;
import com.pojo.Emp;
/**
 * 工厂
 * @author Ytt
 *
 */
public class DaoFactory {
	/**
	 * 
	 * @return admi的dao
	 * @throws Exception
	 */
	public static  IAdmi getAdmi() throws Exception{
		return new AdmiProxy();
	}
	/**
	 * 
	 * @return emp的dao
	 * @throws Exception
	 */
	public static IEmp getEmp() throws Exception{
		return new EmpProxy();
	}
	/**
	 * 
	 * @return commodity的dao
	 * @throws Exception
	 */
	public static ICommodity getCommodity() throws Exception{
		return new CommodityProxy();
	}
	/**
	 * Purchase的dao
	 * @return
	 * @throws Exception
	 */
	public static IPurchase getPurchase() throws Exception{
		return new PurchaseProxy();
	}
	/**
	 * Return的dao
	 * @return
	 * @throws Exception
	 */
	public static IReturn getReturn() throws Exception{
		return new ReturnProxy();
	}
	/**
	 * Category的dao
	 * @return
	 * @throws Exception
	 */
	public static ICategory getCategory() throws Exception{
		return new CategoryProxy();
	}
	public static ISale getSale() throws Exception{
		return new SaleProxy();
	}
	public static IInventory getInventory() throws Exception{
		return new InventoryProxy();
	}
	public static ISupplier getSupplier() throws Exception{
		return new SupplierProxy();
	}
}
