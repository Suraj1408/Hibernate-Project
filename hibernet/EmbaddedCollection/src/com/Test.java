package com;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		
		
		Session session=HibernateUtility.getSessionFactory().openSession();
		
		Address add=new Address();
		
	    add.setAreaname("ramnagar");
	    add.setCityname("mumbai");
	    
	    Address addr=new Address();
	    addr.setAreaname("shahunagar");
	    addr.setCityname("pune");
	    
	    
	    Student stu=new Student();
	    stu.setRollno(12);
	    stu.setName("suraj");
	    stu.setMobileno("11111111111");
	    stu.getAddr().add(add);
	    stu.getAddr().add(addr);
	    
	    session.save(stu);
	   System.out.println(stu);
	    session.beginTransaction().commit();
	    
	   
	    Student stu1=session.get(Student.class,1);
	    System.out.println(stu1.getRollno());
	    System.out.println(stu1.getName());
	   System.out.println(stu1.getMobileno());
	    Set <Address> s=stu1.getAddr();
	    
	    for(Address a: s)
	    {
	    	System.out.println(a.getAreaname());
	    	System.out.println(a.getCityname());
	    }
	    
			
		
	}
	
	
	
	
	

}
