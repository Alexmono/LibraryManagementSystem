package com.Alex.Server.Dao;

import com.Alex.Server.Pojo.Manager;
import com.Alex.Server.Utils.ManagerUtil;

public class ManagerDaoImpl implements ManagerDao {

	private ManagerUtil managerUtil = new ManagerUtil();

	public Manager getManager(String accountNumber) {
		String sql = "SELECT * FROM library_manager WHERE accountNumber = " + accountNumber + ";";
		Manager manager = managerUtil.getManager(sql);
		if (manager != null)
			return manager;
		else
			return null;
	}

}
