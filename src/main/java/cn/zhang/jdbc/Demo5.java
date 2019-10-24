package cn.zhang.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试批处理的基本用法
 * @author tako_
 *
 */
public class Demo5 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","111111");
			conn.setAutoCommit(false);//事务设置关闭自动提交
			stmt = conn.createStatement();
			long start = System.currentTimeMillis();
			for(int i=0;i<20000;i++) {
				stmt.addBatch("insert into t_user(username,pwd,regTime) values('zhang"+i+"',666666,now())");
			}
			stmt.executeBatch();
			conn.commit();//提交事务
			long end = System.currentTimeMillis();
			System.out.println("插入20000条数据耗时：" + (end-start) + "ms");
		} catch (ClassNotFoundException e) {
			System.err.println("数据库加载失败");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭顺序遵循：resultSet-->statement-->connection，三个块一定要分开写
			try {
				if(rs!=null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(stmt!=null) stmt.close();
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
