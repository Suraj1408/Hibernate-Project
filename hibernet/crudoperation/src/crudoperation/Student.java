package crudoperation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{

	@Id
	private int rollno;
	private String name;
	private String lastname;
	private long mobileno;
	
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public long getMobileno() 
	{
		return mobileno;
	}
	public void setMobileno(long mobileno)
	{
		this.mobileno = mobileno;
	}
	
	
	
	
	
	
	
	
	
}
