package one_to_one_student;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;


public class AccountUtil 
{
	
	public static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionFactory()
	{
		
		try
		{
			Map<String ,Object> setting=new HashMap<String, Object>();
			setting.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
		    setting.put(Environment.URL,"jdbc:mysql://localhost:3306/test2");
		    setting.put(Environment.PASS,"root");
			setting.put(Environment.USER,"root");
			setting.put(Environment.HBM2DDL_AUTO,"update");
			setting.put(Environment.SHOW_SQL,"true");
					
			StandardServiceRegistry register=new StandardServiceRegistryBuilder().applySettings(setting).build();
			MetadataSources mds=new MetadataSources(register).addAnnotatedClass(Account.class).addAnnotatedClass(AccountPlus.class);
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
