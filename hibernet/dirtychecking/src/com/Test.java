package com;

import java.sql.Date;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) 
	{
		
		Session session=HibernetUtility.getsessionfactory().openSession();
		
		EmployeeTbl emp=new EmployeeTbl();
		emp.setName("jK");
		emp.setDesi("hrC");
		emp.setSalary(200000);
      
		session.save(emp);
		
		emp.setName("Suraj");
		
		//session.update(emp);
		
		
		session.beginTransaction().commit();
		
		
	/*	
		EmployeeTbl e=session.get(EmployeeTbl.class,0);
		
		e.setName("bhushan");
		
		//session.save(e);
		session.beginTransaction().commit();
		
		*/
		
		// TODO Auto-generated method stub

	}

}
