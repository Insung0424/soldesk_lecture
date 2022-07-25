package co.jis.a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class joinServlet
 */
@WebServlet("/joinServlet")
public class joinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public joinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int pw = Integer.parseInt(request.getParameter("pw"));
		String email = request.getParameter("email");
		String email2 = request.getParameter("email2");
		String paddr = request.getParameter("paddr");
		String addr = request.getParameter("addr");
		String addr2 = request.getParameter("addr2");
		String job = request.getParameter("job");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("이름은 "+name+"<br>");
		out.println("아이디는 "+id+"<br>");
		out.println("이메일은 "+email+"@"+email2+"<br>");
		out.println("우편번호는 "+paddr+"<br>");
		out.println("주소는 "+addr+" "+addr2+"<br>");
		out.println("직업은 "+job+"<br>");
//		out.println("비밀번호는 "+pw);
		
	
	}

}
