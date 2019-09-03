package com.cg.democollection.dao;

import java.util.List;

import com.cg.democollection.dto.Employee;

public interface EmployeeDAO {
	
	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp);
	
	public List<Employee<Integer, Double>> showEmployee();
	
}
