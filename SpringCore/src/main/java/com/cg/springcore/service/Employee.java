package com.cg.springcore.service;

import java.util.List;
import java.util.Set;

public class Employee {

	private String empName;
	private List<Project> projc;
	private	Set<Department> depts;
	Address address;
	private Integer empId;

	public void getData() {
		System.out.println("Hi. Welcome to Spring Core. "+empName +" "+empId);
		for(Project project: projc) {
			System.out.println(project);
		}
		for(Department department: depts) {
			System.out.println(department);
		}
		System.out.println(address);
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setProjc(List<Project> projc) {
		this.projc = projc;
	}

	public void setDepts(Set<Department> depts) {
		this.depts = depts;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Employee(String empName, Integer empId) {
		this.empName = empName;
		this.empId=empId;
	}
	
	public void callFirst() {
		System.out.println("Call First.");
	}
	
	public void callLast() {
		System.out.println("Call Last.");
	}
}
