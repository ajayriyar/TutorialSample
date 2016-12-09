package com.tutorial.sample;

public class Entity {
    private String fname;
    private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String toString(){
		return fname+" "+lname;
	}
    
}
