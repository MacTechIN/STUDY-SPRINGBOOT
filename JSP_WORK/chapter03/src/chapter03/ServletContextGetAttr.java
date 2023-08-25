package chapter03;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import java.util.List;

@WebServlet("/scget")
public class ServletContextGetAttr extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ServletContext context = this.getServletContext();
		
		List person = (ArrayList)context.getAttribute("person");
		
		String user_name = (String)person.get(0);
		String user_company = (String)person.get(1);
		
		String user_city = (String)context.getAttribute("city");
		
		out.print(user_name + ":" + user_company + "<br>");
		out.print(user_city);
	}

}
