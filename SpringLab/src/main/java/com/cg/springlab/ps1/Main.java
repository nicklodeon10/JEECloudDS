package com.cg.springlab.ps1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = applicationContext.getBean("emp", Employee.class);
		System.out.println(employee);
		
	}

}
