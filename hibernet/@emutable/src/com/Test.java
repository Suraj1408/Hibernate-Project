package com;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) 
	{
		
		
		Session session=HibernetUtility.getsessionfactory().openSession();
		
		
		StudentTable stu=new StudentTable();
		stu.setRollno(1);
		stu.setName("surya");
		stu.setAdd("obad");

		StudentTable stu1=new StudentTable();
		stu1.setRollno(2);
		stu1.setName("surya");
		stu1.setAdd("obad");

		session.save(stu);
		session.save(stu1);
		
		/*session.get(StudentTable.class,1);
		stu.setName("surya");
		session.update(stu);*/
		
		session.beginTransaction().commit();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
