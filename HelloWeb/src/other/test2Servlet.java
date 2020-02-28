package other;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test2Servlet
 */
public class test2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy=mm=d");
		String todayForm = dataFormat.format(today.getTime());
		String todayForm2 = String.format("%TF",today);
		
		request.setAttribute("today", todayForm);
		
		response.sendRedirect("t2.jsp?today2="+todayForm2);	
	}

}
