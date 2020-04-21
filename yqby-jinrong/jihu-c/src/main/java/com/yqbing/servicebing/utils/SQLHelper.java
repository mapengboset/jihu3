package com.yqbing.servicebing.utils;

import java.sql.*;

/**
 * SQL帮助类
 * 
 * @author mapb
 * 
 */
public class SQLHelper {

	/**
	 * 获取字符串值
	 * 
	 * @param result 结果集
	 * @param index 序号
	 * @return 字符串值
	 * @throws SQLException SQL异常
	 */
	public static String getString(ResultSet result, int index) throws SQLException {
		if (result.getObject(index) == null) {
			return null;
		}
		return result.getString(index);
	}

	/**
	 * 获取整型值
	 * 
	 * @param result 结果集
	 * @param index 序号
	 * @return 整型值
	 * @throws SQLException SQL异常
	 */
	public static Integer getInt(ResultSet result, int index) throws SQLException {
		if (result.getObject(index) == null) {
			return null;
		}
		return result.getInt(index);
	}

	/**
	 * 关闭结果集
	 * 
	 * @param result 结果集
	 * @return 关闭结果
	 */
	public static boolean close(ResultSet result) {
		boolean closed = false;
		if (result != null) {
			try {
				result.close();
				closed = true;
			}
			catch (SQLException ignore) {
			}
		}
		return closed;
	}

	/**
	 * 关闭声明
	 * 
	 * @param statement 声明
	 * @return 关闭结果
	 */
	public static boolean close(Statement statement) {
		boolean closed = false;
		if (statement != null) {
			try {
				statement.close();
				closed = true;
			}
			catch (SQLException ignore) {
			}
		}
		return closed;
	}

	/**
	 * 关闭连接
	 * 
	 * @param connection 连接
	 * @return 关闭结果
	 */
	public static boolean close(Connection connection) {
		boolean closed = false;
		if (connection != null) {
			try {
				connection.close();
				closed = true;
			}
			catch (SQLException ignore) {
			}
		}
		return closed;
	}

}
