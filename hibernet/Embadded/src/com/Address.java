package com;

import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	private String cityname;
	private String areaname;
	
	
	

}
