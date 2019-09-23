package com.Alex.Server.Service;

import java.sql.SQLException;

import com.Alex.Server.Pojo.User;

public interface UserService {
	/**
	 * 根据accountNumber查询User
	 * 
	 * @param accountNumber
	 * @return
	 * @throws SQLException
	 */
	User foundUserByAccountNumber(String accountNumber);

	/**
	 * 添加User
	 * 
	 * @param user
	 * @return
	 */
	Boolean registered(User user);

}
