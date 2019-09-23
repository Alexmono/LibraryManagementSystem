package com.Alex.Server.Utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Alex.Server.Pojo.User;

public class UserUtil {

	private JdbcUtil jdbcUtil = new JdbcUtil();

	/**
	 * 查询并返回所得的user
	 * 
	 * @param sql
	 * @return
	 */
	public User getUser(String sql) {
		User user = null;
		ResultSet rs = jdbcUtil.executeQuery(sql);
		if (rs != null) {
			try {
				rs.next();
				user.setuId(rs.getString(0));
				user.setUserName(rs.getString(1));
				user.setAccountNumber(rs.getString(2));
				user.setPassWord(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setSex(rs.getInt(5));
				user.setEmail(rs.getString(6));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return user;
		} else
			return null;
	}
	/**
	 * 添加用户操作
	 * @param sql
	 * @return
	 */
	public Boolean insertUser(String sql) {
		int result = jdbcUtil.executeUpdate(sql);
		if (result != 0)
			return true;
		else
			return false;
	}
}
