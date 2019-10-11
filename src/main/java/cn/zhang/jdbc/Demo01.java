package cn.zhang.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 测试跟数据库建立连接
 * Class.forName("com.mysql.jdbc.Driver");
 * DriverManager.getConnection(url, user, password)
 * @author tako_
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			long start = System.currentTimeMillis();
			//建立连接(连接对象内部其实包含了Socket对象，是一个远程连接，比较耗时！这是Connection对象管理的一个要点！)
			//真正开发中，为了提高效率，都会使用连接池来管理连接对象！
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","111111");
			long end = System.currentTimeMillis();
			System.out.println(conn);
			System.out.println("建立连接耗时：" + (end-start) + "ms");
		} catch (ClassNotFoundException e) {
			System.err.println("数据库加载失败");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
