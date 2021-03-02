package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
 
	@Id
	private int rollno;
	private String name;
	private String mobileno;
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@ElementCollection
	private Set<Address> addr=new HashSet<>();
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public Set<Address> getAddr() 
	{
		return addr;
	}
	public void setAddr(Set<Address> addr) 
	{
		this.addr = addr;
	}
	
	
	
	
}
