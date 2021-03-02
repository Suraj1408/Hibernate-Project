import org.hibernate.Session;


public class Test 
{
	
	public static void main(String[] args) 
	{

		
		Session session=CjcUtil.getSessionFactort().openSession();
		
		CjcKarvenagar cjckarvenagar=new CjcKarvenagar();
		cjckarvenagar.setId(101);
		cjckarvenagar.setSname("Suraj");
		cjckarvenagar.setCname("Hibernate");

		cjckarvenagar.setWeekendbatch("B12");

		
		
		CjcAkurdi cjcakurdi=new CjcAkurdi();
		
		cjcakurdi.setId(102);
		cjcakurdi.setSname("Tofik");
		cjcakurdi.setCname("Spring");
		cjcakurdi.setRegulerbatch("B10");
		
		session.save(cjcakurdi);
		session.save(cjckarvenagar);
		
		session.beginTransaction().commit();
		
		
		
		
	}
	
	
	

}
