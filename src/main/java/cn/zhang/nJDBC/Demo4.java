package cn.zhang.nJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 测试ResultSet结果集的基本用法
 * @author tako_
 *
 */
public class Demo4 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			conn = DriverManager.getConnection("nJDBC:mysql://localhost:3306/testjdbc","root","111111");
			
			String sql = "select * from t_user where id>?";//?占位符
			ps = conn.prepareStatement(sql);
			ps.setObject(1, 2);
			rs = ps.executeQuery();
			while(rs.next()) System.out.println(rs.getObject(1)+"."+rs.getObject(2)+""+rs.getObject(3));

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
				if(ps!=null) ps.close();
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
