package com.cg.corejava.layeredarch.service;

import com.cg.corejava.layeredarch.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee e);

	public String findScheme(String Desg, double sal);

	public Employee getEmployee(int empId);
}
