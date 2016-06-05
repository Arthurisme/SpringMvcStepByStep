package com.in28minutes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PRIVATE_MEMBER;


@WebServlet(urlPatterns= "/login.do")
public class LoginServlet extends HttpServlet {
	
	private UserValidationService theUserValidationService = new UserValidationService();
	
	 @Override
	  protected void doGet(HttpServletRequest request, 
			  HttpServletResponse response) throws ServletException, IOException {

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
		 
		 
		 //11,get params:
//		 String name = request.getParameter("name");
//		 String password = request.getParameter("password");
//		 System.out.println(name);
//		 request.setAttribute("name", request.getParameter("name"));
//		 request.setAttribute("password", request.getParameter("password"));
		 //2,jsp:
	}
	 
	 @Override
	  protected void doPost(HttpServletRequest request, 
			  HttpServletResponse response) throws ServletException, IOException {
		 
		 String name = request.getParameter("name");
		 String password = request.getParameter("password");
		 boolean isUserValid= theUserValidationService.isValidateUser(name, password);
		 
		 if(isUserValid)
		 {
		 request.setAttribute("name", request.getParameter("name"));
		 request.setAttribute("password", request.getParameter("password"));
		 request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		 } else {
			 
			 request.setAttribute("ErrorMessage", "Wrong type of either name or password.");

			 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

		}
		 


	}
	 
	 	


}
