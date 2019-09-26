package com.cg.springmvcpractice.service;

import java.util.List;

import com.cg.springmvcpractice.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public List<Employee> showEmployee();
	
	public Employee findEmployee(Integer empId);
	
}
