package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.MypageDAO;

/**
 * Servlet implementation class LoginProcesServlet
 */
public class LoginProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MypageDAO dao = new MypageDAO();
		String custNo = request.getParameter("custNo").trim();
		String pw = request.getParameter("pw").trim();
		
		HttpSession  session = request.getSession(true);
		session.setAttribute("orderList", dao.orderList(custNo, pw));
		
		 request.getRequestDispatcher("/mypage").forward(request, response);
		
	}

}





