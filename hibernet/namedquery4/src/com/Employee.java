package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



@Entity
@NamedQueries({@NamedQuery(name="e_id",query="from Employee where empid=:id")})
@NamedQuery(name="all_employee",query="from Employee")

public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empid;
	private String name;
	private String desi;
	private float salary;
	
	public int getEmpid() 
	{
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	

}
