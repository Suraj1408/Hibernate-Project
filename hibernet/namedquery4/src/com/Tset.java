package com;

import org.hibernate.Session;

import java.io.InputStream;
import java.util.*;
public class Tset 
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		
			
			
		System.out.println("Enter emp name");
		String name=sc.next();
		System.out.println("Enter emp designation ");
		String desi=sc.next();
		System.out.println("Enter emp salary");
		float salary=sc.nextFloat();
		
		Employee emp=new Employee();
		
		emp.setName(name);
		emp.setDesi(desi);
		emp.setSalary(salary);
		
		
		session.save(emp);
		
		session.beginTransaction().commit();
		System.out.println("record save sucessfully");
		
		
		
		List<Employee> list=session.createNamedQuery("all_employee",Employee.class).getResultList();
		
		for(Employee emp1:list)
		{
			
			System.out.println(emp1.getEmpid());
			System.out.println(emp1.getName());
			System.out.println(emp1.getDesi());
			System.out.println(emp1.getSalary());
			
			
			
		}
		System.out.println("record display sucessfully");

	}

}
