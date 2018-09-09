package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdBrother
 */
public class ThirdBrother extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdBrother() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter w = response.getWriter();
		
		String nt = request.getParameter("tn");
		String dt = request.getParameter("td");
		String st = request.getParameter("ts");
		
		//printing all details. 6 from Cookie object, 3 from request object
		//all the cookies are with current servlet request object so lets use request.getCookies()
	 	Cookie [] co = request.getCookies();
		
	 	w.println("First Brother Name is "+co[0].getValue());
	 	w.println("<br>");
	 	w.println("First Brother DOB is "+co[1].getValue());
	 	w.println("<br>");
	 	w.println("First Brother Serial Number is "+co[2].getValue());
	 	w.println("<br>");
	 	w.println("Second Brother Name is "+co[3].getValue());
	 	w.println("<br>");
	 	w.println("Second Brother DOB is "+co[4].getValue());
	 	w.println("<br>");
	 	w.println("Second Brother Serial number is "+co[5].getValue());
	 	w.print("<br>");
	 	w.println("Third Brother Name is "+nt);
	 	w.println("<br>");
	 	w.println("Third Brother DOB is "+dt);
	 	w.println("<br>");
	 	w.println("Third Brother Serial Number is "+st);
	 	w.println("<br>");
		w.println("==========Thank you so much=======");
	}

}
