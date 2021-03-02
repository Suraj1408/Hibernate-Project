package com;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentTable 
{
	
	@Id
	private int rollno;
	private String name;
	private String add;
	
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	

}
