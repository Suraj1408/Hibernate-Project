package one_to_mant_stu;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Employee 
{
	@Id
	@Column(name="empid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int eid;
	@JoinColumn(name="Name")
	private String ename;
	private String edesi;
	private float salary;
	
	@ManyToOne(cascade=CascadeType.ALL)
	
	private Department department;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdesi() {
		return edesi;
	}

	public void setEdesi(String edesi) {
		this.edesi = edesi;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	
	
	

}
