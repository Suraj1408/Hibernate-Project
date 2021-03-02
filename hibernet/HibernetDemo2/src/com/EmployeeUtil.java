package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class EmployeeUtil 
{
	
	public static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionFactory()
	{
		try{
		if(sessionfactory==null)
		{
			StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
			
			MetadataSources mds=new MetadataSources(registry);
			
			Metadata md=mds.getMetadataBuilder().build();
			
			sessionfactory=md.getSessionFactoryBuilder().build();
			
			//Session session=sf.openSession();
		}
	}
		catch(Exception e)
		{
				System.out.println(e.getMessage());
		}
			
			
			
		return sessionfactory;
		
	}
	
	
	

}
