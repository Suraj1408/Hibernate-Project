import javax.persistence.Entity;



@Entity
public class CjcAmbegaon extends Cjc
{

	private String regularbatch;

	public String getRegularbatch() {
		return regularbatch;
	}

	public void setRegularbatch(String regularbatch) {
		this.regularbatch = regularbatch;
	}
	
	
}
