package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test
{
	
	public static void main(String[] args) 
	{
		Session session=EmployeeUtil.getSessionFactory().openSession();
		
		Employee emp=new Employee();
		emp.setEmp_id(102);
		emp.setEmp_name("Raj");
		emp.setMail("raj@gmail.com");
        emp.setMobile_no(99999999999l);
        
        session.save(emp);
        
        session.beginTransaction().commit();
        
        Employee emp2=session.get(Employee.class,101);
        
        System.out.println(emp2.getEmp_id());
        System.out.println(emp2.getEmp_name());
        System.out.println(emp2.getMail());
        System.out.println(emp2.getMobile_no());
		
		
		
		
		
		
		
	}
	
	
	

}
