package com.Alex.Server.Dao;

import java.sql.SQLException;

import com.Alex.Server.Pojo.User;

public interface UserDao {
	/**
	 * 通过accountNumber获取User
	 * @param accountNumber
	 * @return
	 * @throws SQLException
	 */
	User getUser(String accountNumber);
	
	/**
	 * 添加User
	 * @param user
	 * @return
	 */
	Boolean insertUser(User user);

}
