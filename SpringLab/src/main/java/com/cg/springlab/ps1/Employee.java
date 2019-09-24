package com.cg.springlab.ps1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	@Value("12345")
	private Integer employeeId;
	@Value("Harriet")
	private String employeeName;
	@Value("40000.0")
	private Double salary;
	@Autowired
	SBU businessUnit;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public SBU getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", \nsbu details= " + businessUnit.toString() + "]";
	}

}
