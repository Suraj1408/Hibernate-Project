package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String e_name;
	private String e_desi;
	private float e_salary;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_desi() {
		return e_desi;
	}
	public void setE_desi(String e_desi) {
		this.e_desi = e_desi;
	}
	public float getE_salary() {
		return e_salary;
	}
	public void setE_salary(float e_salary) {
		this.e_salary = e_salary;
	}
	
	
	
	
	

}
