package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.dao.MemberDAO;
import model.dto.MemberBean;

/**
 * Servlet implementation class MemberUpdateServlet
 */
public class MemberUpdateServlet extends HttpServlet {
	MemberDAO dao = MemberDAO.getInstance();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *      
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset-utf8");
		req.setCharacterEncoding("utf8");
		
		MemberBean bean = new MemberBean();
		bean.setId(req.getParameter("id"));
		bean.setNickName(req.getParameter("nickName"));
		bean.setAddr(req.getParameter("addr"));
		bean.setCartCount( Integer.parseInt(req.getParameter("cartCount").trim()) );
		int update = dao.memberUpdate(bean);
		System.out.println(bean + "\n" + update);
		
		String nextPage = "/";
		
		if(update!=1) {
			req.setAttribute("errorMsg", "업데이트 실패 다시시도 해보세요");
			nextPage="/memberUpdate.do?id="+req.getParameter("id");
		}
//		req.getRequestDispatcher(nextPage).forward(req, resp);	
		resp.sendRedirect(nextPage);
				
		}
		
		
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(request.getParameter("id"));
		//id를 받아서 다시 아이디를 검색한 후 jsp에 고객의 정보를 넘겨쥰다
		//실시간 데이터를 확인할 수 있다

		MemberDAO dao = MemberDAO.getInstance(); //멤버dao를 쓰기위한 인스턴스 
		System.out.println("servlet id : "+request.getParameter("id"));
		MemberBean bean = dao.memberSearch(request.getParameter("id"));
		System.out.println(bean);
		request.setAttribute("member", bean);
		request.getRequestDispatcher("/memberUpdate.jsp").forward(request, response);
	}

}
