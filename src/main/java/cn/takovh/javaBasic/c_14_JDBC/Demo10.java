package cn.takovh.javaBasic.c_14_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 测试BLOB
 * @author tako_
 *
 */
public class Demo10 {
	public static void main(String[] args) throws InterruptedException {
		Connection conn = null;
		PreparedStatement ps1 = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			conn = DriverManager.getConnection("c_14_JDBC:mysql://localhost:3306/testjdbc","root","111111");
			ps1 = conn.prepareStatement("select * from t_user where lastLoginTime>? and lastLoginTime<? order by lastLoginTime");
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.err.println("数据库加载失败");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps1!=null) ps1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
