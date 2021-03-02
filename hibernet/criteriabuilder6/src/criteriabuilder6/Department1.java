package criteriabuilder6;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Department1 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int did;
	private String addr;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="dept1")
	private Set<Employee1> employee1;

	public int getDid() {
		return did;
	}

	public void setEmployee1(Set<Employee1> employee1) {
		this.employee1 = employee1;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Employee1 getEmployee1() {
		return (Employee1) employee1;
	}

	public void setEmployee1(Employee1 employee1) {
		this.employee1 = (Set<Employee1>) employee1;
	}
	
	
	
	
	

}
