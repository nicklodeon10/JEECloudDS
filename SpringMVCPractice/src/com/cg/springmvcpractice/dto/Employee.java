package com.cg.springmvcpractice.dto;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	private Integer empId;
	private String empName;
	private String empDept;

	public Employee() {
	}

	public Employee(Integer empId, String empName, String empDept) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + "]";
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

}
