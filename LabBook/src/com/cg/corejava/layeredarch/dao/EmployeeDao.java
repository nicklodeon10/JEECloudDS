package com.cg.corejava.layeredarch.dao;

import com.cg.corejava.layeredarch.dto.Employee;

public interface EmployeeDao {
	public Employee addEmployee(Employee e);
	public Employee getEmployee(int id);
}
