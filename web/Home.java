package com.coding.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Home() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String language = request.getParameter("language");
		String hometown= request.getParameter("hometown");
		if( firstName ==null ) {firstName =  "Unknown";}
		if( lastName ==null ) {lastName =  "Unknown";}
		if( hometown==null) {hometown=  "Unknown";}
		if( language==null) {language=  "Unknown";}
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.write("<h2>Welcome, " + firstName+" "+lastName+"</h2>");
		out.write("<h4> Your favorite language is: "+language+"</h4>");
		out.write("<h4> Your hometown is: "+hometown+"</h4>");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
