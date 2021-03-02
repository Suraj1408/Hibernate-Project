package com;

import org.hibernate.Session;

public class Test 
{

	public static void main(String[] args) 
	{
		
		Session session=UnivercityUtil.getsessionfactory().openSession();
		
		College clg=new College();
		clg.setCode(201);
		clg.setName("modern");
        clg.setAdd("pune");
        
        
        session.save(clg);
        
        session.beginTransaction().commit();
      
        College clg1=session.get(College.class,201);
        
        System.out.println(clg1.getCode());
        System.out.println(clg1.getName());
        System.out.println(clg1.getAdd());
        
        
		
		
		
		
		
		
	}
	
	
	
	
}
