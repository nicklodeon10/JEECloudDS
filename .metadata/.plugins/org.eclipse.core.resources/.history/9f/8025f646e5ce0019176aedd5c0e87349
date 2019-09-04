package com.cg.demomap.service;

import java.util.List;

import com.cg.demomap.dto.Employee;
import com.cg.demomap.exception.EmployeeException;

public interface EmployeeService {
	
	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp);
	
	public List<Employee<Integer, Double>> showEmployee();
	
	public List<Employee<Integer, Double>> sortEmployee(int sortType) throws EmployeeException;
	
	public Employee<Integer, Double> searchEmployee(Integer empId);
	
	public void removeEmployee(Integer empId);
	
}
