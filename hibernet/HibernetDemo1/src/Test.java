import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;


public class Test 
{
	public static void main(String[] args)
	{
		
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		
		Employee emp=new Employee();
		
		emp.setId(101);
		emp.setEmp_name("Suraj");
        emp.setEmp_lastname("gaikwad");
        
        session.save(emp);
        
        session.beginTransaction().commit();
        
        Employee emp1=session.get(Employee.class,101);
        
        System.out.println(emp1.getId());
        System.out.println(emp1.getEmp_name());
        System.out.println(emp1.getEmp_lastname());
        
        
		
		
	}
	
	
	

}
