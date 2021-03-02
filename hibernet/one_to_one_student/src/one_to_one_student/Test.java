package one_to_one_student;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		
		Account ac=new Account();
		ac.setName("Suraj");
		ac.setAddr("Obad");
		
		AccountPlus ap=new AccountPlus();
		ap.setActype("saviing");
		ap.setAmt(500000000);
		
		ac.setAcplus(ap);
		ap.setAccount(ac);
		
		Session session=AccountUtil.getSessionFactory().openSession();
		
		session.save(ap);
		//session.save(ac);
		
		
		
		
		
		
	}
	
	
	

}
