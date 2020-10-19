package cn.zhang.nJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * 测试时间处理（java.sql.Date,Time,Timestamp），取出指定时间段的数据
 * @author tako_
 *
 */
public class Demo8 {
	public static void main(String[] args) throws InterruptedException, ParseException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			conn = DriverManager.getConnection("nJDBC:mysql://localhost:3306/testjdbc","root","111111");
			ps = conn.prepareStatement("select * from t_user where lastLoginTime>? and lastLoginTime<? order by lastLoginTime");
			
			java.sql.Timestamp start = new java.sql.Timestamp(str2Date("2019-1-8 10:00:00"));
			java.sql.Timestamp end = new java.sql.Timestamp(str2Date("2019-1-8 13:00:00"));
			ps.setObject(1,start);
			ps.setObject(2,end);
			rs = ps.executeQuery();
			while(rs.next()) System.out.println(rs.getInt("id")+"--"+rs.getString("username")+"--"+rs.getTimestamp("lastLoginTime"));;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.err.println("数据库加载失败");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
	/**
	 * 将字符串代表的日期转为long数字（格式：yyyy-MM-dd hh:mm:ss）
	 * @param dateString
	 * @return
	 * @throws ParseException 
	 */
	private static long str2Date(String dateString) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return df.parse(dateString).getTime();
	}
}
