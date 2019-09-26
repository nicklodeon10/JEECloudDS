package com.cg.corejava.flowandexception;

import com.cg.corejava.flowandexception.exception.WrongAgeException;

public class Exercise5 {

	public boolean checkAge(int age) {
		try {
			if(age<15) {
				throw new WrongAgeException("Enter a valid age.");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return true;
	}
	
}
