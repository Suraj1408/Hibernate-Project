package com.hw.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Provider.Service;
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

@WebServlet(urlPatterns="/log1")
public class RegisterServ extends HttpServlet
{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	
	
	int s1= Integer.parseInt(request.getParameter("t1"));
	String s2= request.getParameter("t2");
	String s3= request.getParameter("t3");
	String s4= request.getParameter("t4");
	String s5= request.getParameter("t5");
	String s6=request.getParameter("t6");
	String s7=request.getParameter("Gender");
	
	String img=request.getParameter("imge");
	File imagePath = new File(img); //here we given fully specified image path.
	  
	byte[] imageInBytes = new byte[(int)imagePath.length()]; //image convert in byte form
	FileInputStream inputStream = new FileInputStream(imagePath);  //input stream object create to read the file
	inputStream.read(imageInBytes); // here inputstream object read the file
	inputStream.close();
	  
	Student s= new Student();
	s.setRollno(s1);
	s.setName(s2);
	s.setAddress(s3);
	s.setUsername(s4);
	s.setPassword(s5);
	s.setGender(s7);
	s.setCity(s6);
	s.setImage(imageInBytes);
	com.hw.service.service ser=new serviceimplementation();
	ser.add(s);
	
	
	response.sendRedirect("index.jsp");
//	response.sendRedirect("login.jsp");
	/*List<Student> list=session.createQuery("from Student",Student.class).getResultList();
	
	
	request.setAttribute("msg", list);
	
	RequestDispatcher rd= request.getRequestDispatcher("success.jsp");
	rd.forward(request, response);*/
}
	
}
