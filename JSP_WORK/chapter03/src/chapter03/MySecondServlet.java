package chapter03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "두번째 서블릿", urlPatterns = { "/Second" })
public class MySecondServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	static int a = 0 ; 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Second Servlet: doGet Method- Called!!");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Second</title>");
		out.println("<body>");
		out.println("<h2>두번째 서블릿 입니다.</h2>" + "<h2>" +a +"</h2>" );
		out.println("</body>");
		out.println("</html>");
		a = a + 1;
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
