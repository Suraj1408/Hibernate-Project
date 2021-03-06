package com;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;


@Entity
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	private String name;
	private String lastname;
	
	@OneToOne(cascade=CascadeType.ALL)
	private StudentPlus stuplus;
	
	public StudentPlus getStuplus() {
		return stuplus;
	}
	public void setStuplus(StudentPlus stuplus) {
		this.stuplus = stuplus;
	}
	
	public int getRollno()
	{
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
