package com.cg.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	@Value("ABC")
	private String empName;
	@Autowired
	private Project pro;
	
	public void getData() {
		System.out.println("Hi. Welcome to Spring Core. "+this.empName+" "+pro);
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Project getPro() {
		return pro;
	}

	public void setPro(Project pro) {
		this.pro = pro;
	}

	public String getEmpName() {
		return empName;
	}
	
}
