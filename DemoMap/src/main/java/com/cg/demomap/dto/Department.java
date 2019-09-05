package com.cg.demomap.dto;

public class Department<T> {

	T deptId;
	String deptName;
	
	public Department() {
	}
	
	public Department(T deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public T getDeptId() {
		return deptId;
	}
	
	public void setDeptId(T deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
}
