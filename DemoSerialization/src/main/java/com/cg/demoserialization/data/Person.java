package com.cg.demoserialization.data;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1532241635512815527L;
	private String fname;
	private String lname;
	private String pan;
	private String aadhaar;
	
	public String getFname() {
		return fname;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String fname, String lname, String pan, String aadhaar) {
		this.fname = fname;
		this.lname = lname;
		this.pan = pan;
		this.aadhaar = aadhaar;
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
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", pan=" + pan + ", aadhaar=" + aadhaar + "]";
	}

}
