package com.cg.corejava.flowandexception;

public class Exercise4 {
	
	public boolean validate(String fname, String lname) throws WrongNameException {
		if(fname=="" || lname=="")
			throw new WrongNameException("Field left blank.");
		return true;
	}
	
}
