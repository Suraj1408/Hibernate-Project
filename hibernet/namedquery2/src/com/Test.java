package com;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.*;


public class Test {

	public static void main(String[] args) 
	{
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		/*Student s=new Student();
		s.setName("suraj");
		s.setLastname("gaikwad");
		
		
		Student s1=new Student();
		s1.setName("surya");
		s1.setLastname("mane");
		
		Student s2=new Student();
		s2.setName("manya");
		s2.setLastname("surve");
		
		
		session.save(s);
		session.save(s1);
		session.save(s2);
		
		session.beginTransaction().commit();*/
		
		
		
		
		List<Student> list=session.createQuery("from Student where rollno=:Id").setParameter("Id",2).getResultList();
	   
	   for(Student stu:list)
	   {
		   System.out.println(stu.getRollno());
		   System.out.println(stu.getName());
		   System.out.println(stu.getLastname());
	   }
		
		
		
		
		// TODO Auto-generated method stub

	}

}
