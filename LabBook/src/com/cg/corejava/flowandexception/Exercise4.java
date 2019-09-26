package com.cg.corejava.flowandexception;

import com.cg.corejava.flowandexception.exception.WrongNameException;

public class Exercise4 {
	
	public boolean validate(String fname, String lname) throws WrongNameException {
		if(fname=="" || lname=="")
			throw new WrongNameException("Field left blank.");
		return true;
	}
	
}
