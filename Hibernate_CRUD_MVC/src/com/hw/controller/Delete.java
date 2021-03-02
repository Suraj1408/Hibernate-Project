package com.hw.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.hw.model.Student;
import com.hw.servicrImpli.serviceimplementation;
import com.hw.utility.HibernateUtil;
@WebServlet(urlPatterns="/delete")
public class Delete extends HttpServlet
{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

	String uname=request.getParameter("rd");
	
	com.hw.service.service s=new serviceimplementation();
		s.del(uname);
	
		response.sendRedirect("index.jsp");
	
}
}
