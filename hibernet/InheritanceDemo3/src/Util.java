import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;


public class Util
{
	public static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionfactory()
	{
		try
		{
			Map<String ,Object> settings=new HashMap<String, Object>();
			settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			settings.put(Environment.URL,"jdbc:mysql://localhost:3306/test1");
			settings.put(Environment.USER,"root");
			settings.put(Environment.PASS,"root");
			
			settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
			settings.put(Environment.HBM2DDL_AUTO,"create-drop");
			settings.put(Environment.SHOW_SQL, "true");
			
			
			StandardServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(settings).build();
			MetadataSources mds=new MetadataSources(registry).addAnnotatedClass(CjcAmbegaon.class).addAnnotatedClass(CjcNarhe.class);
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
