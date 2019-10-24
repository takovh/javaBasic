package cn.zhang.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 测试PreparedStatement的基本用法
 * ps.setObject(parameterIndex, x);
 * @author tako_
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","111111");
			
			String sql = "insert into t_user(username,pwd,regTime) values(?,?,?)";//?占位符
			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1, "Mary");//参数索引从1开始
//			ps.setString(2, "258");
//			ps.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			
			ps.setObject(1, "Mike");//参数索引从1开始
			ps.setObject(2, "369");
			ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
			//插入一行记录
			//ps.execute();
			int count = ps.executeUpdate();
			System.out.println("count=" + count);
		} catch (ClassNotFoundException e) {
			System.err.println("数据库加载失败");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
