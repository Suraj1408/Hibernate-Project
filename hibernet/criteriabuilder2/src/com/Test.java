package com;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) 
	{
		
		Session session=Hibernateutil.getSessionFactory().openSession();
		
		College c1=new College();
		c1.setName("modern");
		c1.setAddr("shivajinager");
		c1.setPincode(101);
		
		College c2=new College();
		c2.setName("jspm");
		c2.setAddr("tatwade");
		c2.setPincode(102);
		
		College c3=new College();
		c3.setName("rp");
		c3.setAddr("latur");
		c3.setPincode(103);
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		session.beginTransaction().commit();
		
		
		
        CriteriaBuilder builder=session.getCriteriaBuilder();
		
		CriteriaQuery<College> cquery=builder.createQuery(College.class);
		
		
		Root<College> root=cquery.from(College.class);
		
		cquery.select(root).where(builder.equal(root.get("code"),3));
		
		
		List<College> list=session.createQuery(cquery).getResultList();
		
		for(College clg:list)
		{
			System.out.println(clg.getCode());
			System.out.println(clg.getName());
			System.out.println(clg.getAddr());
			System.out.println(clg.getPincode());
			
		}
		
		

	}

}
