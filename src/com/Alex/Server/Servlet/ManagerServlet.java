package com.Alex.Server.Servlet;

import com.Alex.Server.Pojo.Manager;
import com.Alex.Server.Service.ManagerService;
import com.Alex.Server.Service.ManagerServiceImpl;

public class ManagerServlet {
	private ManagerService managerService = new ManagerServiceImpl();

	public Manager managerLogin(String accountNumber, String passWord) {
		Manager manager = managerService.foundManagerByAccountNumber(accountNumber);
		if (passWord.equals(manager.getPassWord()))
			return manager;
		else
			return null;
	}
}
