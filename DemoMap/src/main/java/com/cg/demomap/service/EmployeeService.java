package com.cg.demomap.service;

import java.util.List;

import com.cg.demomap.dto.Department;
import com.cg.demomap.dto.Employee;
import com.cg.demomap.exception.EmployeeException;

public interface EmployeeService {
	
	public Employee<Integer, Double, Department<Integer>> addEmployee(Employee<Integer, Double, Department<Integer>> emp);
	
	public List<Employee<Integer, Double, Department<Integer>>> showEmployee();
	
	public List<Employee<Integer, Double, Department<Integer>>> sortEmployee(int sortType) throws EmployeeException;
	
	public Employee<Integer, Double, Department<Integer>> searchEmployee(Integer empId);
	
	public void removeEmployee(Integer empId);
	
}
