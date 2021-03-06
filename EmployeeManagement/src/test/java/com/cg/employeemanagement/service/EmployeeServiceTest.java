package com.cg.employeemanagement.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;

class EmployeeServiceTest {

	EmployeeService emp;
	
	Long deptId=420L;
	String deptName="TheOnlyDepartmentHere";
	Department dep=new Department(deptId, deptName);
	
	Long empId=12312L;
	String empName="BestEmployeeEver";
	Float empSal=200.20f;
	Department empDep=dep;
	Employee empl=new Employee(empId, empName, empSal, empDep);
	
	@BeforeEach
	public void init() {
		emp=new EmployeeServiceImpl();
	}
	
	@Test
	public void runAddTest() {
		assertEquals(empl, emp.addEmployee(empl), "The same object must return.");
	}
	
	@Test
	public void runShowTest() {
		for(int i=0; i<5; i++)
			emp.addEmployee(empl);
		Employee[] empArray=emp.showEmployee();
		
		for(int i=0; i<5; i++)
			assertEquals(empl, empArray[i],"All Employee Objects must be same.");
	}
	
	@AfterEach
	public void close() {
		emp=null;
	}
	

}
