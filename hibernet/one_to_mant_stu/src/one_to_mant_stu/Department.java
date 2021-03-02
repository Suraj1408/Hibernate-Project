package one_to_mant_stu;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;



@Entity
public class Department
{
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int did;
	private String dname;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="dd",joinColumns={@JoinColumn(name="empid")})
	private Set<Employee> dept=new HashSet();
	
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set<Employee> getDept() {
		return dept;
	}

	public void setDept(Set<Employee> dept) {
		this.dept = dept;
	}

	

}
