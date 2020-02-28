package encoding;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EncodingServlet
 */
public class EncodingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("enTest1.jsp").forward(request, response);
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//제대로 수치한다고 전제, 예외사항 처리하지않음
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String userName= request.getParameter("userName");
		int birthYear = Integer.parseInt(request.getParameter("birthYear").trim());
		int age = Calendar.getInstance().get(Calendar.YEAR)-birthYear;
		System.out.println(birthYear+","+age+","+userName);
	//	int currentYear = Calendar.getInstance().get(Calendar, YEAR)-birthYear;
		
		request.setAttribute("userName", userName); // 어트리뷰트 오브젝트 파라메터 스트링
		request.setAttribute("age", age); 
		
		
		request.getRequestDispatcher("enOut.jsp").forward(request, response);
		
		
}

	
}