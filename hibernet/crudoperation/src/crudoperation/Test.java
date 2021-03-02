package crudoperation;

import org.hibernate.Session;
import java.util.*;
public class Test 
{

	 static Scanner sc=new Scanner(System.in);
	 Session session=HibernateUtility.getsessionfactory().openSession();
	 
	public static void main(String[] args) 
	{
		
		
		
		
		while(true)
		{
		      System.out.println("Enyter 1 for insert record");
		      System.out.println("Enter 2 for display record");
		      System.out.println("Enter 3 for update record");
		      System.out.println("Enter 4 for delete record");
		      System.out.println("Enter your choice");
		      int no=sc.nextInt();
		      
		      switch(no)
		      {
		      case 1:
		    	  addrecord();
		    	  break;
		      case 2:
		    	  display();
		    	  break;
		      case 3:
		    	  updaterecord();
		    	  break;
		      case 4:
		    	  deleteRecord();
		    	  break;
		    	  
		      }
		      
		      
		      
		      
		      
		           
		      
		}
		
	}
	
      
	public static  void addrecord()
	{
		
		Session session=HibernateUtility.getsessionfactory().openSession();
		
		System.out.println("Enter rollno");
		int rollno=sc.nextInt();
		System.out.println("Entr name");
		String name=sc.next();
		System.out.println("Enter lats name");
		String lastname=sc.next();
		System.out.println("Enter mobileno");
		long mobileno=sc.nextLong();
		
		Student stu=new Student();
		stu.setRollno(rollno);
		stu.setName(name);
		stu.setLastname(lastname);
		stu.setMobileno(mobileno);
		
		session.save(stu);
		session.beginTransaction().commit();
		
	}

	
	public static void display()
	{
		
		System.out.println("Enter roll no");
		int rollno=sc.nextInt();
		
		Session session=HibernateUtility.getsessionfactory().openSession();
		Student stu=session.get(Student.class,rollno);
		if(stu!=null)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getLastname());
			System.out.println(stu.getMobileno());
					
		}
		else
		{
			System.out.println("wrong roll no");
		}
		
		
	}
	
	public static void updaterecord()
	{
		System.out.println("Enter rollno");
		int rollno=sc.nextInt();
		
		Session session=HibernateUtility.getsessionfactory().openSession();
	   Student stu=new Student();
		System.out.println("Enetr 1 for update name");
		System.out.println("Enter 2 for update lastname");
		System.out.println("Enter 3 for update mobile no");
		System.out.println("Enter ypur choice");
		int no=sc.nextInt();
		
		switch(no)
		{
		case 1:
			System.out.println("Entr name");
			String name=sc.next();
			stu.setName(name);
			session.save(stu);
			session.beginTransaction().commit();
			break;
		case 2:
			System.out.println("Enter lastname");
			String lastname=sc.next();
			stu.setLastname(lastname);
			session.save(stu);
			session.beginTransaction().commit();
			break;
		case 3:
			System.out.println("Enter mobile no");
			long mobileno=sc.nextLong();
			stu.setMobileno(mobileno);
			session.save(stu);
			session.beginTransaction().commit();
			
		}
		
			
			//Student stu=session.get(Student.class, rollno);
			/*if(stu!=null)
			{
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter last name");
				String lastname=sc.next();
				System.out.println("Enter mobile no");
				long mobileno=sc.nextLong();
				
				stu.setName(name);
				stu.setLastname(lastname);
				stu.setMobileno(mobileno);
				
				session.update(stu);
					
				session.beginTransaction().commit();
			}
			else
			{
				System.out.println("wrong rollno");
			}*/
			
		
	}
	
	public static void deleteRecord()
	{
		System.out.println("Enter rollno");
		int rollno=sc.nextInt();
		
		Session session=HibernateUtility.getsessionfactory().openSession();
		while(true)
		{
			Student stu=session.get(Student.class, rollno);
			
			if(stu!=null)
			{
				session.delete(stu);
				session.beginTransaction().commit();
				break;
			}
			else
			{
				System.out.println("plzz enter correct rollno for delete record");
			}
		
		}
	}
	
	
	
	
}
