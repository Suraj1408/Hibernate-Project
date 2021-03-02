package com;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import java.util.*;

public class Test 
{
	
	public static void main(String[] args) 
	{
		
		Session session=Hibernateutil.getSessionFactory().openSession();
		
		Batch b1=new Batch();
		b1.setBname("B101");
		b1.setFname("vishal sir");
		b1.setAddr("karvenagar");
		
		Batch b2=new Batch();
		b2.setBname("B102");
		b2.setFname("nandu sir");
		b2.setAddr("akurdi");
		
		session.save(b1);
		session.save(b2);
		
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		
		CriteriaQuery<String> cquery=builder.createQuery(String.class);
		
		Root<Batch> root=cquery.from(Batch.class);
		
		cquery.select(root.get("bname"));
		
		List<String> list=session.createQuery(cquery).getResultList();
		
		for(String nm:list)
		{
			
			System.out.println(nm);
			
		}
				
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
