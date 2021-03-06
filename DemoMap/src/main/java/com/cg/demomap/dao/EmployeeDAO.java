package com.cg.demomap.dao;

import java.util.Map;

import com.cg.demomap.dto.Department;
import com.cg.demomap.dto.Employee;

public interface EmployeeDAO {

	public Employee<Integer, Double, Department<Integer>> addEmployee(Employee<Integer, Double, Department<Integer>> emp);
	
	public Map<Integer, Employee<Integer, Double, Department<Integer>>> showEmployee();
	
	public void removeEmployee(Integer empId);
	
}