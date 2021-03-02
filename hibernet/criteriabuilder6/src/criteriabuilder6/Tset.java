package criteriabuilder6;

import org.hibernate.Session;



import java.util.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
public class Tset 
{

	public static void main(String[] args) 
	{
		
		Session session=Hibernateutil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		
		Department1 dept1=new Department1();
		dept1.setAddr("mumbai");
		
		
		Employee1 emp1=new Employee1();
		emp1.setName("Ram");
		emp1.setAddr("pune");
		emp1.setDesi("tester");
		emp1.setSalary(500000.00f);
        emp1.setDept1(dept1);
        
		Employee1 emp2=new Employee1();
		emp2.setName("Ramesh");
		emp2.setAddr("pune");
		emp2.setDesi("Pro,lead");
		emp2.setSalary(500000.00f);
        emp2.setDept1(dept1);
        
		Employee1 emp3=new Employee1();
		emp3.setName("Raja");
		emp3.setAddr("mumbai");
		emp3.setDesi("dev");
		emp3.setSalary(600000.00f);
        emp3.setDept1(dept1);
        
        Set<Employee1> d=new HashSet<Employee1>();
        d.add(emp1);
        d.add(emp2);
        d.add(emp3);
        dept1.setEmployee1(d);
        
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		session.beginTransaction().commit();
		
		
		
		
            CriteriaBuilder builder=session.getCriteriaBuilder();
		
		CriteriaQuery<Object[]> cquery=builder.createQuery(Object[].class);
		
		Root<Employee1> emproot=cquery.from(Employee1.class);
		
		Root< Department1> deptroot=cquery.from(Department1.class);
		
	//	cquery.multiselect(root.get("empid"),root.get("empname"),root.get("salary"));
		
		cquery.multiselect(emproot,deptroot).where(builder.equal(emproot.get("dept1"),deptroot.get("did")));
		
		
		List<Object[]> list=session.createQuery(cquery).getResultList();
		
		for(Object[] obj:list)
		{
			
			Employee1 e1=(Employee1)obj[0];
			
			System.out.println(e1.getEid());
			System.out.println(e1.getName());
			System.out.println(e1.getAddr());
			System.out.println(e1.getDesi());
			System.out.println(e1.getSalary());
			
			
			Department1 d1=(Department1)obj[1];
			System.out.println(d1.getDid());
			System.out.println(d1.getAddr());
			
			
			
		
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
