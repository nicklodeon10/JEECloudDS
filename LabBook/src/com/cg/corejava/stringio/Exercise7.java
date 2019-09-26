package com.cg.corejava.stringio;

public class Exercise7 {
	
	public boolean validateUsername(String s) {
		String pattern = "^[A-Za-z0-9]{8,}_job$";
		if(s.matches(pattern))
			return true;
		return false;
	}
	
}
