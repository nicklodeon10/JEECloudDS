package com.cg.demojpa.ui;

import java.util.List;
import java.util.Scanner;

import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.service.EmployeeService;
import com.cg.demojpa.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("Enter\n1 to Add.\n2 to Remove\n3 to Find.\n4 to Update.\n5 to Search b/w range.\n0 to Exit.");
			choice = scanner.nextInt();
			switch (choice) {
			case 0:{
				System.exit(0);
				break;
			}
			case 1: {
				System.out.println("Enter Employee Id: "); 
				int id=scanner.nextInt();
				scanner.nextLine(); 
				System.out.println("Enter Employee Name: ");
				String name=scanner.nextLine(); 
				System.out.println("Enter Employee Salary: ");
				Double salary=scanner.nextDouble();
				Employee emp=new Employee(); 
				emp.setEmpId(id); 
				emp.setEmpName(name);
				emp.setEmplSalary(salary);
				service.addEmployee(emp);
				break;
			}case 2:{
				try {
					System.out.println("Enter Employee Id: "); 
					int id=scanner.nextInt();
					service.removeEmployee(id);
					break;
				}catch(Exception exception) {
					System.err.println("Employee ID not found.");
					continue;
				}
			}case 3:{
				List<Employee> empList=service.showAll();
				for(Employee emp: empList) {
					System.out.println(emp);
				}
				break;
			}case 4:{
				System.out.println("Enter Employee Id: "); 
				int id=scanner.nextInt();
				scanner.nextLine(); 
				System.out.println("Enter Employee Name: ");
				String name=scanner.nextLine(); 
				System.out.println("Enter Employee Salary: ");
				Double salary=scanner.nextDouble();
				Employee emp=new Employee(); 
				emp.setEmpId(id); 
				emp.setEmpName(name);
				emp.setEmplSalary(salary);
				service.updateEmployee(emp);
				break;
			}case 5:{
				System.out.println("Enter Min Value: ");
				Double min=scanner.nextDouble();
				System.out.println("Enter Max Value: ");
				Double max=scanner.nextDouble();
				List<Employee> empList=service.findBetweenSalary(min, max);
				for(Employee emp: empList) {
					System.out.println(emp);
				}
			}
			}
		} while (choice != 0);
		scanner.close();
	}

}
