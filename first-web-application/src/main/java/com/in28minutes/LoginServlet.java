package com.in28minutes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= "/login.do")
public class LoginServlet extends HttpServlet {
	
	 @Override
	  protected void doGet(HttpServletRequest request, 
			  HttpServletResponse response) throws ServletException, IOException {
		 
		 //11,get params:
		 String name = request.getParameter("name");
		 System.out.println(name);
		 request.setAttribute("name", name);
		 //2,jsp:
		 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		 
		 
		 //1, non jsp:
//		PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<head>");
//        writer.println("<title>Yahoo!!!!!!!!</title>");
//        writer.println("</head>");
//        writer.println("<body>");
//        writer.println("My First Servlet");
//        writer.println("</body>");
//        writer.println("</html>");
	}


}
