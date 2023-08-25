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

@WebServlet("/scinfo")
public class ServletContextServletInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		ServletContext sc = this.getServletContext();
		
		out.print("서블릿 버젼: " + sc.getMajorVersion() + "." + sc.getMinorVersion() + "<br>");
		out.print("서버정보: " + sc.getServerInfo() + "<br>");
		out.print("어플리케이션 경로: " + sc.getContextPath() + "<br>");
		out.print("어플리케이션 이름: " + sc.getServletContextName() + "<br>");
		out.print("파일실제경로: " + sc.getRealPath("/") + "<br>");
	}

}
