package com.cg.employeemanagement.ui;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;
import com.cg.employeemanagement.service.ProjectServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		
		Long deptId=420L;
		String deptName="TheOnlyDepartmentHere";
		Department dep=new Department(deptId, deptName);
		
		Long empId=12312L;
		String empName="BestEmployeeEver";
		Float empSal=200.20f;
		Department empDep=dep;
		Employee empl=new Employee(empId, empName, empSal, empDep);
		
		Long projId=3213L;
		String projName="BestCloudProject";
		Employee emp[]=new Employee[5];
		Float cost=2132.22f;
		Project proj=new Project(projId, projName, emp, cost);
		
		ProjectServiceImpl service=new ProjectServiceImpl();
		
		service.addProject(proj);
		System.out.println("Added Project.");
		
		System.out.println(service.showProject());
		System.out.println("Show success.");
		
		System.out.println(service.searchProject(projId));
		System.out.println("Search success");
		
		service.updateProject(projId, projName, cost);
		System.out.println("Project Updated.");
		
		service.addEmployeeToProject(projId, empl);
		System.out.println("Added Employee to Project.");
		
		service.removeEmployeeFromProject(projId, empl);
		System.out.println("Removed Employee from Project.");
		
		service.removeProject(projId);
		System.out.println("Project Removed.");

		
		/*
		 * Scanner scn=new Scanner(System.in);
		 * System.out.println("Enter the Employee Id: "); long id=scn.nextLong();
		 * System.out.println("Enter the Employee Name: "); String name=scn.next();
		 * System.out.println("Enter the Employee Salary: "); float sal=scn.nextFloat();
		 * System.out.println("Enter the Department Id: "); long did=scn.nextLong();
		 * System.out.println("Enter the Department Name: "); String dname=scn.next();
		 * 
		 * Department dep=new Department(); dep.setDeptId(did); dep.setDeptName(dname);
		 * 
		 * Employee emp=new Employee(); emp.setEmpName(name); emp.setEmpId(id);
		 * emp.setEmpSalary(sal); emp.setEmpDept(dep);
		 * 
		 * EmployeeService service=new EmployeeServiceImpl(); service.addEmployee(emp);
		 * System.out.println(service.searchEmployee(id));
		 * 
		 * name="Bot"; sal=23232.2321f; System.out.println(service.updateEmployee(id,
		 * dname, sal, dep));
		 * 
		 * Employee empArray[]=service.showEmployee();
		 * 
		 * for(int i=0; i<EmployeeDAOImpl.top; i++) {
		 * System.out.println(empArray[i].getEmpName()); }
		 * 
		 * service.removeEmployee(id);
		 * scn.close();
		 */
	}

}
