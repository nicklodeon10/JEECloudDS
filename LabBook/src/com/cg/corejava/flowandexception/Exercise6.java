package com.cg.corejava.flowandexception;

import java.util.Scanner;

import com.cg.corejava.flowandexception.exception.EmployeeException;

public class Exercise6 {

	public void verifySalary(Integer salary) throws EmployeeException {
		if(salary<3000) {
			throw new EmployeeException("Salary is less than 3000");
		}
	}
	
}
