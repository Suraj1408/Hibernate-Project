package com;

import org.hibernate.Session;

public class Test 
{
	
	public static void main(String[] args) 
	{

		
		
		Student stu=new Student();
		stu.setName("manya");
		stu.setLastname("surve");
	
		StudentPlus stupls=new StudentPlus();
		stupls.setStudetails("dagalichal");
		
		
		stu.setStuplus(stupls);
		stupls.setStudent(stu);
		
		Session session=StudentUtil.getSessionFactory().openSession();
		session.save(stupls);
		session.save(stu);
		
		
		
		
		
	}
	
	

}
