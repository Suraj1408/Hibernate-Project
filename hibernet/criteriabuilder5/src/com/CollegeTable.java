package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CollegeTable 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int code;
	private String clgname;
	private String clgaddress;
	
	
	
	
	
	
	
	
	
	
	

}
