import org.hibernate.Session;


public class Test
{
	
	public static void main(String[] args) 
	{
		
		Session session=Util.getSessionfactory().openSession();
		
		
		CjcAmbegaon ca=new CjcAmbegaon();
		ca.setId(101);
		ca.setName("kavya");
		ca.setCname("corejava");
		ca.setRegularbatch("B10");
		
		CjcNarhe cn=new CjcNarhe();
		cn.setId(102);
		cn.setName("Suraj");
		cn.setCname("Adv.jva");
		cn.setWeekendbatch("B12");
		
		session.save(ca);
		session.save(cn);
		
		session.beginTransaction().commit();
		
		Cjc cjc=session.get(CjcAmbegaon.class, 101);
		System.out.println(cjc.getId());
		System.out.println(cjc.getName());
		System.out.println(cjc.getCname());


		
		
		
		
		
		
		
	}
	
	

}
