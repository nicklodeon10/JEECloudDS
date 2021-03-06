package com.cg.demomap.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.demomap.dto.Department;
import com.cg.demomap.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	Map<Integer, Employee<Integer, Double, Department<Integer>>> myMap=new HashMap<Integer, Employee<Integer, Double, Department<Integer>>>();
	
	public Employee<Integer, Double, Department<Integer>> addEmployee(Employee<Integer, Double, Department<Integer>> emp) {
		return myMap.put(emp.getEmpId(), emp);
	}

	public Map<Integer, Employee<Integer, Double, Department<Integer>>> showEmployee() {
		return myMap;
	}

	public void removeEmployee(Integer empId) {
		myMap.remove(empId);
	}

}
