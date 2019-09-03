package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;

public interface EmployeeDAO {
	
	public Employee addEmployee(Employee emp);
	
	public Employee[] showEmployee();
	
	public Employee searchEmployee(Long empId); 
	
	public Employee updateEmployee(Long empId, String name, Float salary, Department dept); 
	
	public void removeEmployee(Long empId);
	
}
