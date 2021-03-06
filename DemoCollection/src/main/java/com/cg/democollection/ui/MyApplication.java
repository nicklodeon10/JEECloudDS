package com.cg.democollection.ui;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.cg.democollection.dto.Employee;
import com.cg.democollection.service.EmpIdCompare;
import com.cg.democollection.service.EmployeeService;
import com.cg.democollection.service.EmployeeServiceImpl;
import com.cg.democollection.service.NameCompare;
import com.cg.democollection.service.SalaryCompare;

public class MyApplication {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		EmployeeService service=new EmployeeServiceImpl();
		int choice;
		do {
			System.out.println("Enter your choice:\n1 for Add\n2 for Show\n3 to Exit.");
			choice=scn.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Employee Id: ");
				Integer id=scn.nextInt();
				System.out.println("Enter Employee Name:");
				String name=scn.next();
				System.out.println("Enter Employee Salary: ");
				Double sal=scn.nextDouble();
				Employee<Integer, Double> emp=new Employee<Integer, Double>(id, name, sal);
				service.addEmployee(emp);
				break;
			case 2:
				List<Employee<Integer, Double>> myList=service.showEmployee();
				Collections.sort(myList);
				System.out.println("Sorted using Comparable.");
				for (Employee<Integer, Double> employee : myList) {
					System.out.print(employee.getEmpId()+" ");
					System.out.print(employee.getEmpName()+" ");
					System.out.print(employee.getEmpSalary()+" ");
				}
				NameCompare nc=new NameCompare();
				System.out.println("Sorted using Comparator.\n1.By Name:");
				Collections.sort(myList, nc);
				for (Employee<Integer, Double> employee : myList) {
					System.out.print(employee.getEmpId()+" ");
					System.out.print(employee.getEmpName()+" ");
					System.out.print(employee.getEmpSalary()+" ");
				}
				EmpIdCompare empc=new EmpIdCompare();
				System.out.println("\n2. By EmpId:");
				Collections.sort(myList,empc);
				for (Employee<Integer, Double> employee : myList) {
					System.out.print(employee.getEmpId()+" ");
					System.out.print(employee.getEmpName()+" ");
					System.out.print(employee.getEmpSalary()+" ");
				}
				SalaryCompare sc=new SalaryCompare();
				System.out.println("\n3. By EmpSalary:");
				Collections.sort(myList,sc);
				for (Employee<Integer, Double> employee : myList) {
					System.out.print(employee.getEmpId()+" ");
					System.out.print(employee.getEmpName()+" ");
					System.out.print(employee.getEmpSalary()+" ");
				}
				break;
			case 3:
				break;
			}
		}while(choice!=3);
		scn.close();
	}

}
 