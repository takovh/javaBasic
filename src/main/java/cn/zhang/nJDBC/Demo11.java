package cn.zhang.nJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 测试使用JDBCUtil来简化JDBC开发
 * @author tako_
 *
 */
public class Demo11 {
	public static void main(String[] args) throws InterruptedException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getMysqlConn();
			ps = conn.prepareStatement("insert into t_user(username,pwd,regTime) values(?,?,?)");
			ps.setObject(1, "Mike");//参数索引从1开始
			ps.setObject(2, "369");
			ps.setObject(3, new java.sql.Date(System.currentTimeMillis()));
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, ps, conn);
		}
	}
}
