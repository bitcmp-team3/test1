package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dto.CustomerOder;

/**
 * customer , orderlist  테이블을 조인해서 사용하는 클래스
 * 1. 아이디, 암호를 이용해서 
 * 주문목록은 고객번호, 주문번호, 결제금액이 나오도록 하세요 
 * @author bitcamp
 *
 */
public class MypageDAO {
	 private PreparedStatement  stmt;
	 private Connection  conn = NSampleConnDAO.getInstance().getConn();
	public MypageDAO() { }
	
	public  List<CustomerOder>   orderList(String   custNo    , String  pw ) {
		String sql="  select  c.custNo , o.orderNo , o.amount  " + 
				            "  from customer c , orderlist  o   " + 
				            "  where  ( c.custNo=? and c.pw=? ) and  c.custNo = o.custNo";
		ResultSet  rest=null;
		List<CustomerOder> oders = null;
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, custNo);
			stmt.setString(2, pw);
			rest = stmt.executeQuery();
			oders=new ArrayList<CustomerOder>();
			while(rest.next()) {
				CustomerOder oder = new CustomerOder(
						custNo, 
						rest.getString("orderNo"),
						rest.getInt("amount"));
				oders.add(oder);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rest!=null)rest.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return oders;
	}// orderList() end
	
	@Override
	protected void finalize() throws Throwable {
		try {
			if(stmt!=null)stmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		super.finalize();
	}
}









