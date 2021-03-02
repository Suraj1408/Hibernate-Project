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

@WebServlet(urlPatterns="/update")
public class UpdateServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String s1= request.getParameter("t1");
		String s2= request.getParameter("t2");
		String s3= request.getParameter("t3");
		String s5=request.getParameter("t4");
		String s4= request.getParameter("rd");
		String s6=request.getParameter("t5");
		String s7=request.getParameter("Gender");
		
		Student stu=new Student();
		
		stu.setRollno(Integer.parseInt(s1));
		stu.setName(s2);
		stu.setAddress(s3);
		stu.setUsername(s4);
		stu.setPassword(s5);
		stu.setGender(s7);
		stu.setCity(s6);
		
		com.hw.service.service ser= new serviceimplementation();
		Student stud=ser.update(stu);
		
		List<Student> list = new ArrayList<>();
		list.add(stud);
		request.setAttribute("admin", list);
		RequestDispatcher rd= request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	}

	
}
