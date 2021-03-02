package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College
{
	@Id
	private int code;
	
	private String name;
	private String add;
	
	public int getCode()
	{
		return code;
	}
	public void setCode(int code) {
		this.code = code;
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
