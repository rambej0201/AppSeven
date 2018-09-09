package com.dss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstBrother
 */
public class FirstBrother extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstBrother() {
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
		 * Step1: get the request details through request object
		 * Step2: adding request data to Cookies
		 * Step3: adding Cookies to response object
		 * Step4: forward the request to other HTML file with RequestDispatcher object 
		 */
		
		
		//get the request details with request object. formOne.html logical names are fn, fd, fs
		String nf = request.getParameter("fn");
		String df = request.getParameter("fd");
		String sf = request.getParameter("fs");
		
		//let add request details to cookie. one data for one cookie
		Cookie c1 = new Cookie("a", nf);
		Cookie c2 = new Cookie("b", df);
		Cookie c3 = new Cookie("c", sf);
		
		//adding Cookies c1, c2, c3 to response
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		
		//forwarding the request to other HTML file
		RequestDispatcher re = request.getRequestDispatcher("formTwo.html");
		re.forward(request, response);
	
	}

}
