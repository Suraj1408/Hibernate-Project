package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empid;
	private String empname;
	private String desi;
	private String addr;
	
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
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
	
	

}
