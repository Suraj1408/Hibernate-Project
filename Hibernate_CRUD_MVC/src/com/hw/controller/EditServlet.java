package com.hw.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.hw.model.Student;
import com.hw.servicrImpli.serviceimplementation;
import com.hw.utility.HibernateUtil;

@WebServlet(urlPatterns="/editdata")
public class EditServlet extends HttpServlet
{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String s= request.getParameter("rd");
		
		com.hw.service.service ser= new serviceimplementation();

		Student stu=ser.edit(s);
		
		
		request.setAttribute("Sdata", stu);
		
		RequestDispatcher rd= request.getRequestDispatcher("editpage.jsp");
		rd.forward(request, response);
		
	}

}
