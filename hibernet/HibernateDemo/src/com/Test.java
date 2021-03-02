package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test 
{
	public static void main(String[] args) 
	{
		
		
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure("/com/hibernate.cfg.xml").build();
		MetadataSources mds=new MetadataSources(registry);
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		
		Employee emp=new Employee();
		emp.setRollno(101);
		emp.setName("N.Sir");
		emp.setAddr("pune");

		session.save(emp);
		
		
		session.beginTransaction().commit();
		
		Employee emp1=session.load(Employee.class, 101);
		System.out.println(emp1.getRollno());
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddr());
		
		
		
		
	}
	
	
	
	
	

}
