package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	
	public Employee[] showEmployee();
	
	public Employee searchEmployee(Long empId);
	
	public Employee updateEmployee(Long empId, String name, Float salary, Department dept);
	
	public void removeEmployee(Long empId);	
}
