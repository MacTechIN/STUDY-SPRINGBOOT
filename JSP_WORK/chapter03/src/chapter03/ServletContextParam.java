package chapter03;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse.ResponseInfo;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/param")
public class ServletContextParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ServletContext context = this.getServletContext();
		
		Enumeration<String> paramNames= context.getInitParameterNames();
		//맨 마지막 데이터만 표시 
		while(paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			String value = context.getInitParameter(name);
			out.print("<h1>" + name + " : " + value +"</h1>" + "" );
		}
	}
}
