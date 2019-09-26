package com.cg.springmvcpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcpractice.dao.EmployeeDao;
import com.cg.springmvcpractice.dto.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public List<Employee> showEmployee() {
		return employeeDao.showEmployee();
	}

	@Override
	public Employee findEmployee(Integer empId) {
		return employeeDao.findEmployee(empId);
	}

}
