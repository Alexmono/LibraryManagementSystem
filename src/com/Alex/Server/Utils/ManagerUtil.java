package com.Alex.Server.Utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Alex.Server.Pojo.Manager;

public class ManagerUtil {

	private JdbcUtil jdbcUtil = new JdbcUtil();

	public Manager getManager(String sql) {
		Manager manager = null;
		ResultSet rs = jdbcUtil.executeQuery(sql);
		if (rs != null) {
			try {
				rs.next();
				manager.setmId(rs.getString(0));
				manager.setManagerName(rs.getString(1));
				manager.setAccountNumber(rs.getString(2));
				manager.setPassWord(rs.getString(3));
				manager.setAge(rs.getInt(4));
				manager.setSex(rs.getInt(5));
				manager.setPhoneNumber(rs.getString(6));
				manager.setEmail(rs.getString(7));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return manager;
		} else
			return null;
	}

}
