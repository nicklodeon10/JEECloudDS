package com.cg.demojpa.service;

import java.util.List;

import com.cg.demojpa.dao.EmployeeDao;
import com.cg.demojpa.dao.EmployeeDaoImpl;
import com.cg.demojpa.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao=new EmployeeDaoImpl();
	
	public Employee addEmployee(Employee emp) {
		return dao.save(emp);
	}

	public List<Employee> showAll() {
		return dao.findAll();
	}

	public void removeEmployee(Integer empId) {
		dao.remove(empId);
	}

	public Employee updateEmployee(Employee emp) {
		dao.remove(emp.getEmpId());
		return dao.save(emp);
	}

	public List<Employee> findBetweenSalary(Double min, Double max) {
		return dao.findBetweenSalary(min, max);
	}

}
