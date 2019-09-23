package com.Alex.Server.Service;

import java.sql.SQLException;

import com.Alex.Server.Dao.UserDao;
import com.Alex.Server.Dao.UserDaoImpl;
import com.Alex.Server.Pojo.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();

	/*
	 * 根据accountNumber查询User
	 * (non-Javadoc)
	 * @see com.Alex.Server.Service.UserService#foundUserByAccountNumber(java.lang.String)
	 */
	public User foundUserByAccountNumber(String accountNumber){
		return userDao.getUser(accountNumber);
	}

	/*
	 * 添加User
	 * (non-Javadoc)
	 * @see com.Alex.Server.Service.UserService#registered(com.Alex.Server.Pojo.User)
	 */
	public Boolean registered(User user) {
		return userDao.insertUser(user);
	}
}
