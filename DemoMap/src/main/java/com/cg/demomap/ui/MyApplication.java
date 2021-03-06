package com.cg.demomap.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.demomap.dto.Department;
import com.cg.demomap.dto.Employee;
import com.cg.demomap.dto.Project;
import com.cg.demomap.exception.EmployeeException;
import com.cg.demomap.service.EmployeeService;
import com.cg.demomap.service.EmployeeServiceImpl;
import com.cg.demomap.service.ProjectService;
import com.cg.demomap.service.ProjectServiceImpl;

public class MyApplication {

	public static void main(String[] args) throws EmployeeException {

		Scanner scn=new Scanner(System.in);
		EmployeeService empService=new EmployeeServiceImpl();
		ProjectService projService=new ProjectServiceImpl();
		int choice=0;
		Map<Integer, Employee<Integer, Double, Department<Integer>>> projJavaMap=new HashMap<Integer, Employee<Integer, Double, Department<Integer>>>();
		Map<Integer, Employee<Integer, Double, Department<Integer>>> projDotNetMap=new HashMap<Integer, Employee<Integer, Double, Department<Integer>>>();
		Map<Integer, Employee<Integer, Double, Department<Integer>>> projBigDataMap=new HashMap<Integer, Employee<Integer, Double, Department<Integer>>>();
		do {
			System.out.println("Enter your choice:\n1 to Add Employee.\n2 to Show Employees.\n3 to Remove.");
			System.out.println("4 to Search.\n5. to Sort.\n6 to Add a Project.");
			System.out.println("7 to Show Projects.\n8 to Remove Project.\n9 to Search Project.\n0 to Exit.");
			choice=scn.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter Employee ID: ");
					Integer id=scn.nextInt();
					System.out.println("Enter Employee Name: ");
					String name=scn.next();
					System.out.println("Enter Employee Salary: ");
					Double sal=scn.nextDouble();
					System.out.println("Enter Department Id: ");
					Integer depId=scn.nextInt();
					System.out.println("Enter Department Name: ");
					String depName=scn.next();
					System.out.println("Enter Project Id: (111-Java, 222-DotNet, 333-BigData)");
					Integer empProjId=scn.nextInt();
					try {
						EmployeeServiceImpl.validateSalary(sal);
						EmployeeServiceImpl.validateEmpId(id);
						ProjectServiceImpl.validateProjectId(empProjId);
					}
					catch(EmployeeException e) {
						System.out.println(e.getMessage());
					}
					Department<Integer> dept=new Department<Integer>(depId, depName);
					Employee<Integer, Double, Department<Integer>> e=new Employee<Integer, Double, Department<Integer>>(id, name, sal, dept, empProjId);
					empService.addEmployee(e);
					switch(empProjId) {
					case 111:
						projJavaMap.put(id, e);
						break;
					case 222:
						projDotNetMap.put(id, e);
						break;
					case 333:
						projBigDataMap.put(id, e);
						break;
					}
					break;
				case 2:
					List<Employee<Integer, Double, Department<Integer>>> myList=empService.showEmployee();
					for(Employee<Integer, Double, Department<Integer>> li: myList) {
						System.out.println(li);
					}
					break;
				case 3:
					System.out.println("Enter Employee Id:");
					Integer remId=scn.nextInt();
					empService.removeEmployee(remId);
					break;
				case 4:
					System.out.println("Enter Employee Id:");
					Integer searchId=scn.nextInt();
					System.out.println(empService.searchEmployee(searchId));
					break;
				case 5:
					System.out.println("Enter your choice:\n1. Sort by EmpId.");
					System.out.println("2. Sort by Name.\n3. Sort by Salary.");
					int sortChoice=scn.nextInt();
					List<Employee<Integer, Double, Department<Integer>>> sortedList=empService.sortEmployee(sortChoice);
					for(Employee<Integer, Double, Department<Integer>> li: sortedList) {
						System.out.println(li);
					}
					break;
				case 6:
					System.out.println("Enter Project Id: ");
					Integer projId=scn.nextInt();
					System.out.println("Enter Project Name: ");
					String projName=scn.next();
					System.out.println("Enter Project Cost: ");
					Double projCost=scn.nextDouble();
					Project<Integer, Double> proj=null;
					try {
						ProjectServiceImpl.validateProjectId(projId);
					}catch(EmployeeException ee) {
						System.out.println(ee.getMessage());
					}
					switch(projId) {
						case 111:
							proj=new Project<Integer, Double>(projId, projName, projJavaMap, projCost);
							break;
						case 222:
							proj=new Project<Integer, Double>(projId, projName, projDotNetMap, projCost);
							break;
						case 333:
							proj=new Project<Integer, Double>(projId, projName, projBigDataMap, projCost);
							break;
						default:			
					}
					projService.addProject(proj);
					break;
				case 7:
					List<Project<Integer, Double>> projList=projService.showProjects();
					for(Project<Integer, Double> p: projList) {
						System.out.println(p);
					}
					break;
				case 8:
					System.out.println("Enter Project Id: ");
					Integer remProjId=scn.nextInt();
					projService.removeProject(remProjId);
					break;
				case 9:
					System.out.println("Enter Project Id: ");
					Integer searchProjId=scn.nextInt();
					System.out.println(projService.searchProject(searchProjId));
					System.out.println(projService.searchProject(searchProjId).getEmpMap());
			}
		}while(choice!=0);
		scn.close();
	}
}
