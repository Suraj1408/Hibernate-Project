package com;

import java.nio.channels.SeekableByteChannel;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.*;
import org.hibernate.Session;


public class Test 
{
	
	public static void main(String[] args) 
	{
		
		Session session=Hibernateutil.getSessionFactory().openSession();
		
		
		Employee emp1=new Employee();
		emp1.setEmpname("raja");
		emp1.setAddr("pune");
		emp1.setDesi("hr");
		
		Employee emp2=new Employee();
		emp2.setEmpname("suraj");
		emp2.setAddr("mumbai");
		emp2.setDesi("manager");
		
		Employee emp3=new Employee();
		emp3.setEmpname("bala");
		emp3.setAddr("latur");
		emp3.setDesi("employee");
		
		Employee emp4=new Employee();
		emp4.setEmpname("rani");
		emp4.setAddr("obad");
		emp4.setDesi("teamlead");
		
		Employee emp5=new Employee();
		emp5.setEmpname("sita");
		emp5.setAddr("murud");
		emp5.setDesi("pro.leader");
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		
		session.beginTransaction().commit();
		
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		
		CriteriaQuery< Employee> cquery=builder.createQuery(Employee.class);
		
		
		Root<Employee> root=cquery.from(Employee.class);
		
		cquery.select(root);
		
		
		List<Employee> list=session.createQuery(cquery).getResultList();
		
		for(Employee emp:list)
		{
			System.out.println(emp.getEmpid());
			System.out.println(emp.getEmpname());
			System.out.println(emp.getAddr());
			System.out.println(emp.getDesi());
		}
		
		
	}
	
	

}
