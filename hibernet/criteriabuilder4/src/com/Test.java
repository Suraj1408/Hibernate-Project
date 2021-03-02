package com;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		
		Session session=Hibernateutil.getSessionFactory().openSession();
		
		Employyee1 e1=new Employyee1();
		e1.setEmpname("suraj");
		e1.setDesi("TL");
		e1.setSalary(500000.00f);
		e1.setAddr("pune");
	
		Employyee1 e2=new Employyee1();
		e2.setEmpname("surya");
		e2.setDesi("hr");
		e2.setSalary(600000.00f);
		e2.setAddr("mumbai");
		
		session.save(e1);
		session.save(e2);
		
		session.beginTransaction().commit();
		
	CriteriaBuilder builder=session.getCriteriaBuilder();
		
		CriteriaQuery<Object[]> cquery=builder.createQuery(Object[].class);
		
		Root<Employyee1> root=cquery.from(Employyee1.class);
		
		cquery.multiselect(root.get("empid"),root.get("empname"),root.get("salary"));
		
		List<Object[]> list=session.createQuery(cquery).getResultList();
		
		for(Object[] obj:list)
		{
			
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println(obj[2]);
		//	System.out.println(obj[0]);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
