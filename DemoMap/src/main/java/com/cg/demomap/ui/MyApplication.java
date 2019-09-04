package com.cg.demomap.ui;

import java.util.List;
import java.util.Scanner;

import com.cg.demomap.dto.Employee;
import com.cg.demomap.exception.EmployeeException;
import com.cg.demomap.service.EmployeeService;
import com.cg.demomap.service.EmployeeServiceImpl;

public class MyApplication {

	public static void main(String[] args) throws EmployeeException {

		Scanner scn=new Scanner(System.in);
		EmployeeService service=new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("Enter your choice:\n1 to Add.\n2 to Show.\n3 to Remove.");
			System.out.println("4 to Search.\n5. to Sort.\n6 to Exit.");
			choice=scn.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter Employee ID: ");
					Integer id=scn.nextInt();
					System.out.println("Enter Employee Name: ");
					String name=scn.next();
					System.out.println("Enter Employee Salary: ");
					Double sal=scn.nextDouble();
					Employee<Integer, Double> e=new Employee<Integer, Double>(id, name, sal);
					service.addEmployee(e);
					break;
				case 2:
					List<Employee<Integer, Double>> myList=service.showEmployee();
					for(Employee<Integer, Double> li: myList) {
						System.out.println(li);
					}
					break;
				case 3:
					System.out.println("Enter Employee Id:");
					Integer remId=scn.nextInt();
					service.removeEmployee(remId);
					break;
				case 4:
					System.out.println("Enter Employee Id:");
					Integer searchId=scn.nextInt();
					System.out.println(service.searchEmployee(searchId));
					break;
				case 5:
					System.out.println("Enter your choice:\n1. Sort by EmpId.");
					System.out.println("2. Sort by Name.\n3. Sort by Salary.");
					int sortChoice=scn.nextInt();
					List<Employee<Integer, Double>> sortedList=service.sortEmployee(sortChoice);
					for(Employee<Integer, Double> li: sortedList) {
						System.out.println(li);
					}
					break;
				case 6:
					break;
				default: throw new EmployeeException("Choice must between 1-6.");
			}
		}while(choice!=6);
		scn.close();
	}
}
