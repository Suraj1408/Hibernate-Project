import org.hibernate.Session;


public class Test 
{
	public static void main(String[] args) 
	{
		Session session=CjcUtil.getSessionFactory().openSession();
		
		CjcAkurdi ca=new CjcAkurdi();
		ca.setId(101);
		ca.setName("Suraj");
		ca.setLname("Gaikwad");
		ca.setWeekendbatch("B10");
		
		CjcKarvenagr ck=new CjcKarvenagr();
		ck.setId(102);
		ck.setName("sachin");
		ck.setLname("kamble");
		ck.setRegularbatch("Hibernate");
		
		session.save(ck);
		session.save(ca);
		
		session.beginTransaction().commit();
		
		
		
	}
	
	
	
	

}
