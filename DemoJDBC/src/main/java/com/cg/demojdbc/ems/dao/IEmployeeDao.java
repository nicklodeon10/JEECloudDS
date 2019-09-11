package com.cg.demojdbc.ems.dao;

import java.util.List;

import com.cg.demojdbc.ems.exception.EmployeeException;
import com.cg.demojdbc.ems.model.Employee;

public interface IEmployeeDao {

	public Employee addEmployee(Employee employee) throws EmployeeException;
	
	public List<Employee> listAllEmployee() throws EmployeeException;
	
}
