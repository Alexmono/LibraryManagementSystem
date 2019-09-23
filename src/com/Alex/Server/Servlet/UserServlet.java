package com.Alex.Server.Servlet;

import java.sql.SQLException;

import com.Alex.Server.Pojo.User;
import com.Alex.Server.Service.UserService;
import com.Alex.Server.Service.UserServiceImpl;

public class UserServlet {

	private UserService userService = new UserServiceImpl();

	/**
	 * 用户登录
	 * 
	 * @param accountNumber
	 * @param passWord
	 * @return User
	 * @throws SQLException
	 */
	public User userLogin(String accountNumber, String passWord) {
		User user = userService.foundUserByAccountNumber(accountNumber);
		if (passWord.equals(user.getPassWord()))
			return user;
		else
			return null;
	}

	/**
	 * 查找账号是否被占用
	 * @param accountNumber
	 * @return Boolean
	 */
	public Boolean accountNumberisEmpty(String accountNumber) {
		User user = userService.foundUserByAccountNumber(accountNumber);
		if (user == null)
			return true;
		else
			return false;
	}

	/**
	 * 用户注册
	 * 
	 * @param user
	 * @return Boolean
	 */
	public Boolean userRegistered(User user) {
		return userService.registered(user);
	}
}
