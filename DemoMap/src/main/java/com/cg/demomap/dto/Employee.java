package com.cg.demomap.dto;

public class Employee<T, K, D> {
	T empId;
	String empName;
	K empSalary;
	D empDept;
	T projId;
	
	public Employee() {}

	public Employee(T empId, String empName, K empSalary, D empDept, T projId) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
		this.projId=projId;
	}

	public T getProjId() {
		return projId;
	}

	public void setProjId(T projId) {
		this.projId = projId;
	}

	public D getEmpDept() {
		return empDept;
	}

	public void setEmpDept(D empDept) {
		this.empDept = empDept;
	}

	public T getEmpId() {
		return empId;
	}

	public void setEmpId(T empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public K getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(K empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept=" + empDept.toString()
				+ ", projId=" + projId + "]";
	}

}
