package com.Alex.Server.Dao;


import com.Alex.Server.Pojo.User;
import com.Alex.Server.Utils.UserUtil;

public class UserDaoImpl implements UserDao {

	private UserUtil userUtil = new UserUtil();
	
	public User getUser(String accountNumber) {
		String sql = "SELECT * FROM library_user WHERE accountNumber = " + accountNumber + ";";
		User user = userUtil.getUser(sql);
		if (user != null)
			return user;
		else
			return null;
	}

	public Boolean insertUser(User user) {
		String sql = "INSERT INTO library_user (userName,accountNumber,passWord,age,sex,email) VALUES ('"
				+ user.getUserName() + "','" + user.getAccountNumber() + "','" + user.getPassWord() + "',"
				+ user.getAge() + "," + user.getSex() + ",'" + user.getEmail() + "');";
		return  userUtil.insertUser(sql);
	}

}
