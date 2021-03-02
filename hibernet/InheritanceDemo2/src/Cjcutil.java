import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;


public class Cjcutil 
{
	
	public static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionfactory==null)
		{
			try
			{
			Map<String ,Object> strings=new HashMap<String, Object>();
			strings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			strings.put(Environment.URL,"jdbc:mysql://localhost:3306/test1");
			strings.put(Environment.USER,"root");
			strings.put(Environment.PASS,"root");
			
			strings.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
			strings.put(Environment.HBM2DDL_AUTO,"update");
			strings.put(Environment.SHOW_SQL,"true");
			
			
			
			
		
			StandardServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(strings).build();
			
			MetadataSources mds=new MetadataSources(registry).addAnnotatedClass(CjcAkurdi.class).addAnnotatedClass(CjcKarvenagar.class);
			
			Metadata md=mds.getMetadataBuilder().build();
			
			sessionfactory=md.getSessionFactoryBuilder().build();
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		return sessionfactory;
		
		
	}
	
	
}