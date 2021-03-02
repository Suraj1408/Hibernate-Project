package one_to_mant_stu;

import org.hibernate.Session;

public class Test 
{
	
	public static void main(String[] args)
	{
		
		Department dept=new Department();
		dept.setDname("IT");
		
		Employee e1=new Employee();
		e1.setEname("Manoj");
		e1.setEdesi("Tester");
		e1.setSalary(55555f);
		
		
		Employee e2=new Employee();
		e2.setEname("Balaji");
		e2.setEdesi("Develpoer");
		e2.setSalary(10055f);
		
		dept.getDept().add(e1);
		dept.getDept().add(e2);
		e1.setDepartment(dept);
		e2.setDepartment(dept);
		Session session=Util.getSessionFactory().openSession();
		
		session.save(e2);
		session.save(e1);
	
		
		
		session.beginTransaction().commit();
	}
	
	

}
