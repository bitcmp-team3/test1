package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class NSampleConnDAO {
	private Connection  conn;
	private static NSampleConnDAO  instance;
	
	
	public Connection getConn() {
		return conn;
	}

	private NSampleConnDAO() {
		
		try {
			//1. 디비 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		//   2. 컨넥션 ( 디비 사용권한을 받는다)
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/nsample?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "a123456789"
					);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// 생성자 end
	
	public static  NSampleConnDAO   getInstance() {
		return (instance==null)?instance=new NSampleConnDAO() : instance;
	}
	
	private void close() {
		try {
			if(conn!=null)conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}	
	
	}
	@Override
	protected void finalize() throws Throwable {
		close();
		super.finalize();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
