package com;

import org.hibernate.Session;

public class Test 
{
	
	public static void main(String[] args)
	{
		
		Session session=HibernetUtility.getsessionfactory().openSession();
		
		Student stu=new Student();
		stu.setRollno(1);
		stu.setName("suraj");
		stu.setAddr("pune");
		
		session.save(stu);
		
		session.beginTransaction().commit();
		
		Student stu1=session.get(Student.class, 1);
		System.out.println(stu1.getRollno());
		System.out.println(stu1.getName());
		System.out.println(stu1.getAddr());
		
		
		
	}
	
	
	

}
