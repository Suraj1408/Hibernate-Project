package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args)
	{
		
	    Session session=HibernateUtil.getSessionFactory().openSession();
	    
		Employee e1=new Employee();
		e1.setE_name("ram");
		e1.setE_desi("hr");
		e1.setE_salary(500000.00f);
		
		Employee e2=new Employee();
		e2.setE_name("nayan");
		e2.setE_desi("manager");
		e2.setE_salary(400000.00f);
		
		session.save(e1);
		session.save(e2);
		session.beginTransaction().commit();

	}

}
