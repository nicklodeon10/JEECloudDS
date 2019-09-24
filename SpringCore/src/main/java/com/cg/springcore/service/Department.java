package com.cg.springcore.service;

public class Department {

	private Integer deptId;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + "]";
	}
	
}
