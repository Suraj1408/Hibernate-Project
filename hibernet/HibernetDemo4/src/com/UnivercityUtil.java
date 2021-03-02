package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;

public class UnivercityUtil 
{
	public static SessionFactory sessionfactory;
	
	public static SessionFactory getsessionfactory()
	{
	  if(sessionfactory==null)
	  {
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		sessionfactory=md.getSessionFactoryBuilder().build();
		
	  }
		
		
		
		
		return sessionfactory;
	}
	
	
	
	
	

}
