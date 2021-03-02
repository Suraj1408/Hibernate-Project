package com;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;


@Entity
public class StudentPlus 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stuplueid;
	private String studetails;
	
	@OneToOne(cascade=CascadeType.ALL)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Student student;

	public int getStuplueid() {
		return stuplueid;
	}

	public void setStuplueid(int stuplueid) {
		this.stuplueid = stuplueid;
	}

	public String getStudetails() {
		return studetails;
	}

	public void setStudetails(String studetails) {
		this.studetails = studetails;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	
	
	

}