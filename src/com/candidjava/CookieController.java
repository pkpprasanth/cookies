package com.candidjava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;  



@WebServlet("/Controller")
public class CookieController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String un=request.getParameter("uname");
		String pw=request.getParameter("pass");	
		
		  Cookie ck=new Cookie("Username", un);
		  response.addCookie(ck); 
		
		 HttpSession session=request.getSession();  
	     session.setAttribute("Password",pw);
	     
		response.sendRedirect("home.jsp");
		
		
	}

}
