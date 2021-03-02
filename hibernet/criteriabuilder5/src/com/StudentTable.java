package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentTable 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	private String firstname;
	private String lastname;
	private String address;
	private int pincode;
	
	
	
	
	
	

}
