package com.my.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/IfSample")
public class IfSample extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String firstNumber = request.getParameter("firstNumber");
		String lastNumber = request.getParameter("lastNumber");
		//String output = request.getParameter("output");
		
		if(Integer.parseInt(firstNumber) >= Integer.parseInt(lastNumber)) {
			int output = Integer.parseInt(firstNumber) + Integer.parseInt(lastNumber);
			out.print("The output is matching and added::" +output);
		}
	}

}
