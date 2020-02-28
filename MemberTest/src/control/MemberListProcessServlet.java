package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDAO;

/**
 * Servlet implementation class MemberListProcessServlet
 */
public class MemberListProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 MemberDAO dao = MemberDAO.getInstance();
	 dao.memberList();
	 
	 request.setAttribute("memberList", MemberDAO.getInstance().memberList()); //memberList란곳에 담아서 
	 
	 request.getRequestDispatcher("/memberList.jsp").forward(request, response); //보낸다
	}

}
