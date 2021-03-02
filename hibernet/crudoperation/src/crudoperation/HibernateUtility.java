package crudoperation;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtility 
{
	
	public static SessionFactory sessionfactory;
	
	public static SessionFactory getsessionfactory()
	{
		
		try
		{
			
			StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
			
			MetadataSources mds=new MetadataSources(registry);
			
			Metadata md=mds.getMetadataBuilder().build();
			
			sessionfactory=md.getSessionFactoryBuilder().build();
			
			
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return sessionfactory;
		
		
		
	}
	
	
	

}
