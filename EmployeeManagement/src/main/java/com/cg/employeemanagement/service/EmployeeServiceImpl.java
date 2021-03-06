package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dao.EmployeeDAO;
import com.cg.employeemanagement.dao.EmployeeDAOImpl;
import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDAO dao=new EmployeeDAOImpl();
	
	public Employee addEmployee(Employee emp) {
		return dao.addEmployee(emp);
	}

	public Employee[] showEmployee() {
		return dao.showEmployee();
	}

	public Employee searchEmployee(Long empId) {
		return dao.searchEmployee(empId);
	}

	public Employee updateEmployee(Long empId, String name, Float salary, Department dept) {
		return dao.updateEmployee(empId, name, salary, dept);
	}

	public void removeEmployee(Long empId) {
		dao.removeEmployee(empId);
	}
	
}
