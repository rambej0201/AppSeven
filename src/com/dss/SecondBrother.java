package com.dss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondBrother
 */
public class SecondBrother extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondBrother() {
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
		
		/*
		 * Step1: getting request details through request object
		 * Step2: adding request details to Cookies
		 * Step3: adding Cookies to response object
		 * Step4: forward the request details to other HTML file with forward mechanism
		*/
		
		//getting request details through request object
		String ns = request.getParameter("sn");
		String ds = request.getParameter("sd");
		String ss = request.getParameter("ss");
		
		//adding request details to Cookies
		Cookie c4 = new Cookie("d", ns);
		Cookie c5 = new Cookie("e", ds);
		Cookie c6 = new Cookie("f", ss);
		
		//adding Cookies to response object
		response.addCookie(c4);
		response.addCookie(c5);
		response.addCookie(c6);
		
		//forwarding the response to other HTML file through RequestDispatcher
		RequestDispatcher qu  = request.getRequestDispatcher("formThree.html");
		qu.forward(request, response);
	}

}
