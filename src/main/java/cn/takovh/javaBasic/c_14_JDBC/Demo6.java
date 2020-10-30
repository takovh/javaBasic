package cn.takovh.javaBasic.c_14_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 测试事务的基本概念和用法
 * @author tako_
 *
 */
public class Demo6 {
	public static void main(String[] args) throws InterruptedException {
		Connection conn = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			conn = DriverManager.getConnection("c_14_JDBC:mysql://localhost:3306/testjdbc","root","111111");
			conn.setAutoCommit(false);//JDBC默认true,会自动提交事务
			
			ps1 = conn.prepareStatement("insert into t_user(username,pwd) values(?,?)");
			ps1.setObject(1, "张煜");
			ps1.setObject(2, 123456);
			ps1.execute();
			System.out.println("插入一条记录。。。");
			
			Thread.sleep(3000);
			ps2 = conn.prepareStatement("insert into t_user(username,pwd) values(?,?,?)");
			ps2.setObject(1, "尹杰");
			ps2.setObject(2, 123456);
			ps2.execute();
			System.out.println("插入一条记录。。。");
			
			conn.commit();//提交事务
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.err.println("数据库加载失败");
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				System.err.println("事务回滚中。。。");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				if(ps1!=null) ps1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(ps2!=null) ps2.close();
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
