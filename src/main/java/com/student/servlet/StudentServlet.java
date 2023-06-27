package com.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

	// Set response content type
	response.setContentType("text/html");

	// Actual logic goes here.
	PrintWriter out = response.getWriter();
	out.println("<h1>Hello World</h1>");
	}
}
