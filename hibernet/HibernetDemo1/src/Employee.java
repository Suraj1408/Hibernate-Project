import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Employee 
{
	@Id
	private int id;
	private String emp_name;
	private String emp_lastname;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_lastname() {
		return emp_lastname;
	}
	public void setEmp_lastname(String emp_lastname) {
		this.emp_lastname = emp_lastname;
	}
	
	
	
	

}
