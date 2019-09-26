package com.cg.springmvcpractice.dao;

import java.util.List;

import com.cg.springmvcpractice.dto.Employee;

public interface EmployeeDao {

	public Employee addEmployee(Employee employee);
	
	public List<Employee> showEmployee();
	
	public Employee findEmployee(Integer empId);
	
}
