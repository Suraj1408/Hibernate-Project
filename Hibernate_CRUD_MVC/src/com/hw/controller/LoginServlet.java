package com.hw.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String uname=request.getParameter("t1");
		System.out.println(uname);
		String password= request.getParameter("t2");
		System.out.println(password);
		
	com.hw.service.service s=new serviceimplementation();
		
		if(uname.equals("admin")&& password.equals("admin"))
		{
			
			List<Student> list=s.getAllData();
			request.setAttribute("admin", list);
			
			RequestDispatcher rd= request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			List<Student> list=s.Logincheck(uname, password);
		if(!list.isEmpty())
		{
			RequestDispatcher rd= request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
			
		}
		else {
			response.sendRedirect("index.jsp");
		}
	}
	}
}
