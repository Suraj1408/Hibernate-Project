import org.hibernate.Session;


public class Test 
{
	public static void main(String[] args)
	{
	
		
		
		Session session=Cjcutil.getSessionFactory().openSession();
		
		CjcKarvenagar k=new CjcKarvenagar();
		k.setId(101);
		k.setLname("Siuraj");
		k.setLname("gaikwad");
	k.setRegularbatch("B10");
	
	CjcAkurdi a=new CjcAkurdi();
	a.setId(102);
	a.setLname("Kamble");
	a.setName("Kavya");
	a.setWeekendbatch("B12");		
		
	session.save(k);
	session.save(a);
	
	session.beginTransaction().commit();
	
	CjcAkurdi ca=session.get(CjcAkurdi.class, 102);
	System.out.println(ca.getId());
	System.out.println(ca.getName());
	System.out.println(ca.getLname());
	System.out.println(ca.getWeekendbatch());
	
	
		
	}
	
	
	

}
