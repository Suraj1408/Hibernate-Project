package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;



@Entity
@NamedQuery(name="all_student",query="from Student")
public class Student 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	private String name;
	private String lastname;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
	
	
	
	

}
