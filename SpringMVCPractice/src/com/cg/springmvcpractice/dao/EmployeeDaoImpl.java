package com.cg.springmvcpractice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springmvcpractice.dto.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	private List<Employee> empList = new ArrayList<>();

	@Override
	public Employee addEmployee(Employee employee) {
		empList.add(employee);
		return employee;
	}

	@Override
	public List<Employee> showEmployee() {
		return empList;
	}

	@Override
	public Employee findEmployee(Integer empId) {
		for(Employee employee: empList) {
			if(employee.getEmpId()==empId) {
				return employee;
			}
		}
		return null;
	}

}
