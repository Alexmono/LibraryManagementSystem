package com.Alex.Server.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Alex.Server.Pojo.User;

public class JdbcUtil {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/_library?&useSSL=true";
	private static String user = "root";
	private static String password = "root";

	/*
	 * 创建实列对象
	 */
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;

	/**
	 * 获取数据库连接
	 * 
	 * @return Connection
	 */
	@SuppressWarnings("finally")
	public Connection getConnection() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.err.println("Driver is happend erro!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Connection is happend erro!");
			e.printStackTrace();
		} finally {
			if (con != null)
				return con;
			else
				return null;
		}
	}

	/**
	 * 关闭数据库连接
	 */
	public void closeConnection() {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 执行查询语句
	 * @param sql
	 * @return
	 */
	public ResultSet executeQuery(String sql) {
		try { 
			con = getConnection(); // 调用getConnection()方法构造Connection对象的一个实例conn
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery(sql);
		} catch (SQLException ex) {
			System.err.println(ex.getMessage()); // 输出异常信息
		}
		return rs; // 返回结果集对象
	}
	/**
	 * 执行更新操作语句
	 * @param sql
	 * @return
	 */
	public int executeUpdate(String sql) {
		int result = 0; // 定义保存返回值的变量
		try { 
			con = getConnection(); // 调用getConnection()方法构造Connection对象的一个实例conn
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			result = st.executeUpdate(sql); // 执行更新操作
		} catch (SQLException ex) {
			result = 0; // 将保存返回值的变量赋值为0
		}
		return result; // 返回保存返回值的变量
	}
}
