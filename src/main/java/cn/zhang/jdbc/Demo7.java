package cn.zhang.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

/**
 * 测试时间处理（java.sql.Date,Time,Timestamp）
 * @author tako_
 *
 */
public class Demo7 {
	public static void main(String[] args) throws InterruptedException {
		Connection conn = null;
		PreparedStatement ps1 = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","111111");
			for(int i=0;i<1000;i++) {
				ps1 = conn.prepareStatement("insert into t_user(username,pwd,regTime,lastLoginTime) values(?,?,?,?)");
				ps1.setString(1, "张煜"+i);
				ps1.setObject(2, 123456);
				java.sql.Date date = new java.sql.Date(System.currentTimeMillis()-200000000);
				int rand = 100000000 + new Random().nextInt(100000000);
				java.sql.Timestamp stamp = new java.sql.Timestamp(System.currentTimeMillis()-rand);
				ps1.setDate(3, date);
				ps1.setTimestamp(4, stamp);
				ps1.execute();
			}
			
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
