package other;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test3Servlet
 */
public class Test3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Calendar today = Calendar.getInstance();
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy=mm=d");
		String todayForm = dataFormat.format(today.getTime());
		String todayForm2 = String.format("%TF",today);
	//	response.getWriter().append(todayForm+"<br>");
	//	response.getWriter().append(todayForm2+"<br>");
		request.setAttribute("today1", todayForm);
		request.setAttribute("today2", todayForm2);
		
		request.getRequestDispatcher("t3.jsp").forward(request, response);
		//		response.get
	}

}
