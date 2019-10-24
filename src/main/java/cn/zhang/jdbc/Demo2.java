package cn.zhang.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试执行sql语句，以及sql注入问题
 * @author tako_
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","111111");
			Statement stmt = conn.createStatement();
			String sql = "insert into t_user(username,pwd,regTime) values('赵六',147,now())";
			//测试sql注入
			//String id = "5 or 1=1"
			//String sql = "delete from t_test where id="+id;
			stmt.execute(sql);
		} catch (ClassNotFoundException e) {
			System.err.println("数据库加载失败");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
