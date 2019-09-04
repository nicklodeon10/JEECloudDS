package com.cg.demomap.dao;

import java.util.Map;

import com.cg.demomap.dto.Employee;

public interface EmployeeDAO {

	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp);
	
	public Map<Integer, Employee<Integer, Double>> showEmployee();
	
	public void removeEmployee(Integer empId);
	
}