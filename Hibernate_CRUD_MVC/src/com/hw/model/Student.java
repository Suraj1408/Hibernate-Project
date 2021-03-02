package com.hw.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_data")
public class Student {

	private int rollno;
	private String name;
	private String address;
	@Id
	private String username;
	private String password;
	private String gender;
	private String city;
	private byte[] image;
	 
	public byte[] getImage()
	{
	   return image;
	}
	public void setImage( byte[] image )
	{
	   this.image = image;
	}
	//private String image;
	
	/*public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}*/
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
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
	
	
}
