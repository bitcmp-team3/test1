package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dto.MemberBean;

public class MemberDAO {
	private Connection conn;
	private static MemberDAO instance;
	private String sqlSelect = "select id, pw, nickName, cartCount, addr from member ";
	private PreparedStatement stmt;
	//현재 클래스에서 한번만 실행
	private MemberDAO() { 
//		1. DB 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
						, "root", "1234");
			
			
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
		
	}//생성자 끝
	
	public static MemberDAO getInstance() {
//		if(instance==null) instance=new MemberDAO();
//		return instance;
		return (instance==null)?instance=new MemberDAO():instance;
	}
	
//		   현재 어플리케이션에서 한번만 해주면 됨
//		2. 커넥션 (db사용권한 획득)
//		   현재 어플리케이션에서 한번만 해주면 됨

	
//	3. sql문을 처리할 메소드를 가지고 있는다.
	//메소드들
	public List<MemberBean> memberList(){
		List<MemberBean> list=null;
		ResultSet rest = null;
		try {
			stmt = conn.prepareStatement(sqlSelect);
			rest = stmt.executeQuery();
			list = new ArrayList<MemberBean>();
			while(rest.next()) {
				//select id, pw, nickName, cartCount, addr
				MemberBean bean = new MemberBean();
				bean.setId(rest.getString(1));
				bean.setPw(rest.getString(2));
				bean.setNickName(rest.getString(3));
				bean.setCartCount(rest.getInt(4));
				bean.setAddr(rest.getString(5));
				list.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
				try {
					if(rest!=null) rest.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return list;
		

	}
	//id만 가지고 검색할 수 있도록
	public MemberBean memberSearch(String ...args) {
		String sql=sqlSelect+ " where  ";
		
		if(args.length==2)sql+="id=? and pw=?";
		else if(args.length==1)sql+="id=?";
		else return null;
		MemberBean bean = null;
		ResultSet rest = null;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, args[0]);
			if(args.length==2) {
				stmt.setString(2, args[1]);
			}
			
			rest = stmt.executeQuery();
			
			bean = new MemberBean();
			if(rest.next()) {
				//select id, pw, nickName, cartCount, addr
				
				bean.setId(rest.getString(1));
				bean.setPw(rest.getString(2));
				bean.setNickName(rest.getString(3));
				bean.setCartCount(rest.getInt(4));
				bean.setAddr(rest.getString(5));
				System.out.println(rest.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
				try {
					if(rest!=null) rest.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return bean;
		
	}

	public int memberUpdate(MemberBean bean) {
		int returnValue = 0;
		String sql="update member set nickName = ?, cartCount=?, addr=? where id=?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(4, bean.getId());
			stmt.setString(1, bean.getNickName());
			stmt.setInt(2, bean.getCartCount());
			stmt.setString(3, bean.getAddr());
			returnValue = stmt.executeUpdate(); //값이 있을때 1로 없을때 0

		} catch(SQLException e){
			e.printStackTrace();
		}
		return returnValue;
	}
	
//	4. 사용을 다했으면 종료
	public void close() {
		try {
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		close();
		super.finalize();
	}
}