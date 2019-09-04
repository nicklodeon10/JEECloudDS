package com.cg.demomap.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.demomap.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	Map<Integer, Employee<Integer, Double>> myMap=new HashMap<Integer, Employee<Integer, Double>>();
	
	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp) {
		return myMap.put(emp.getEmpId(), emp);
	}

	public Map<Integer, Employee<Integer, Double>> showEmployee() {
		return myMap;
	}

	public void removeEmployee(Integer empId) {
		myMap.remove(empId);
	}

}
