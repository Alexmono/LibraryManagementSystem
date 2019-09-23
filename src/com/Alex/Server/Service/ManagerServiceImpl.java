package com.Alex.Server.Service;

import com.Alex.Server.Dao.ManagerDao;
import com.Alex.Server.Dao.ManagerDaoImpl;
import com.Alex.Server.Pojo.Manager;

public class ManagerServiceImpl implements ManagerService {

	private ManagerDao managerDao = new ManagerDaoImpl();
	
	public Manager foundManagerByAccountNumber(String accountNumber) {
		return managerDao.getManager(accountNumber);
	}

}
