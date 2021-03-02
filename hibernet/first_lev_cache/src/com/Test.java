package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) 
	{
		
		/*Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student stu=new Student();
		stu.setName("sayaji");
		stu.setLast_name("shaikh");
		stu.setAddr("latur");
		
		Student stu1=new Student();
		stu1.setName("shruti");
		stu1.setLast_name("husen");
		stu1.setAddr("dubai");
		
		session.save(stu);
		session.save(stu1);
		
		session.beginTransaction().commit();*/
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		
		Student s1= s.get(Student.class,1);
		 
				
		//Session sess=sf.openSession();
		
		Student s2=s.get(Student.class,1);
		
		Student s3=s.get(Student.class,1);
		
		
	Session ss=sf.openSession();
	
	Student stu1=ss.get(Student.class,1);
	
	Student stu2=ss.get(Student.class,1);
		

	}

}
