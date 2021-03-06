package com.cg.democollection.service;

import java.util.List;

import com.cg.democollection.dao.EmployeeDAO;
import com.cg.democollection.dao.EmployeeDAOImpl;
import com.cg.democollection.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDAO dao=new EmployeeDAOImpl();
	
	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp) {
		return dao.addEmployee(emp);
	}

	public List<Employee<Integer, Double>> showEmployee() {
		return dao.showEmployee();
	}

}
