package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	
	@Id
	private int emp_id;
	private String emp_name;
	private long mobile_no;
	private String mail;
	
	public int getEmp_id() 
	{
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
	
	
	

}
