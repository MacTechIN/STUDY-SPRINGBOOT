package chapter03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/scset")
public class ServletContextSetAttr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		ServletContext context = this.getServletContext();
		
		List person = new ArrayList();
		
		person.add("이순신");
		person.add("코리아시스템");
		
		
		context.setAttribute("person", person);
		context.setAttribute("city", "서울");
		
		
	}

}
