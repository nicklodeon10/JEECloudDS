package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	final public static int ARRAY_LIMIT=5;
	
	Employee[] emp=new Employee[ARRAY_LIMIT];
	public static int top=0;
	
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if(top<=(ARRAY_LIMIT-1)) {
			this.emp[top]=emp;
			top++;
		}else {
			System.err.println("MemoryFull.");
		}
		return emp;
	}

	public Employee[] showEmployee() {
		return this.emp;
	}

	public Employee searchEmployee(Long empId) {
		Employee currEmp=null;
		for(int i=0; i<top; i++) {
			currEmp=emp[i];
			if(currEmp.getEmpId()==empId)
				break;
		}
		return currEmp;
	}

	public Employee updateEmployee(Long empId, String name, Float salary, Department dept) {
		Employee currEmp=null;
		for(int i=0; i<top; i++) {
			currEmp=emp[i];
			if(currEmp.getEmpId()==empId) {
				emp[i].setEmpName(name);
				emp[i].setEmpSalary(salary);
				emp[i].setEmpDept(dept);
			}
		}
		return currEmp;
	}

	public void removeEmployee(Long empId) {
		Employee currEmp=null;
		for(int i=0; i<top; i++) {
			currEmp=emp[i];
			if(currEmp.getEmpId()==empId)
				emp[i]=null;
		} 
	}
	
	
}
