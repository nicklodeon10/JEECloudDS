package com.cg.demojpa.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="jpa_department")
public class Department {
	
	@Id
	@Column(name="dep_id")
	private Integer depId;
	@Column(name="dep_name")
	private String depName;
	@OneToMany(mappedBy = "department")
	private List<Employee> empList;
	
	public Department() {	}

	public Department(Integer depId, String depName, List<Employee> empList) {
		this.depId = depId;
		this.depName = depName;
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", empList=" + empList + "]";
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
}
