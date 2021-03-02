import javax.persistence.Entity;


@Entity
public class CjcAkurdi extends Cjc 
{
	
	
	private String weekendbatch;

	public String getWeekendbatch()
	{
		return weekendbatch;
	}

	public void setWeekendbatch(String weekendbatch) {
		this.weekendbatch = weekendbatch;
	}
	
	
	
	

}
