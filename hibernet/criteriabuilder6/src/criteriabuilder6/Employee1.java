package criteriabuilder6;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee1 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
    private String name;
    private String desi;
    private String addr;
    private float salary;
    
    @ManyToOne(cascade=CascadeType.ALL)
   private Department1 dept1;

	public Department1 getDept1() {
		return dept1;
	}

	public void setDept1(Department1 dept1) {
		this.dept1 = dept1;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesi() {
		return desi;
	}

	public void setDesi(String desi) {
		this.desi = desi;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	
	
	

}
