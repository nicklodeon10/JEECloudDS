/**
 * 
 */
package com.cg.demojpa.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Devang
 *
 */

@Entity
@Table(name = "jpa_employee")
public class Employee {

	@Id
	@Column(name = "emp_id")
	private Integer empId;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "emp_salary")
	private Double empSalary;
	@Column(name = "joining_date")
	@Temporal(TemporalType.DATE)
	private Date dateOfJoining;
	@Embedded
	private Address address;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Project project;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="dep_id")
	private Department department;

	public Employee() {
	}

	public Employee(Integer empId, String empName, Double empSalary, Date dateOfJoining, Address address,
			Project project, Department department) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.dateOfJoining = dateOfJoining;
		this.address = address;
		this.project = project;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", dateOfJoining="
				+ dateOfJoining + ", address=" + address + ", project=" + project + ", department=" + department + "]";
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
