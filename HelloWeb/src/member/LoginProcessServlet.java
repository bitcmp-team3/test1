package member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginProcessServlet
 */
public class LoginProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("LoginProcessServlet");
		String username = request.getParameter("username");
		String pw = request.getParameter("pw");
		//아이디 kim123 pw 789
		if(username.equals("kim123") && pw.equals("789")){
			request.setAttribute("msg","Welcome");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else {
			response.sendRedirect("loginfail.jsp");
		}
	}

}







