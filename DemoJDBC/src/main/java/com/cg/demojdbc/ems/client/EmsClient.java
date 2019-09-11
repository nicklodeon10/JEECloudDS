package com.cg.demojdbc.ems.client;

import java.math.BigDecimal;
import java.util.List;

import com.cg.demojdbc.ems.dao.EmployeeDao;
import com.cg.demojdbc.ems.dao.IEmployeeDao;
import com.cg.demojdbc.ems.exception.EmployeeException;
import com.cg.demojdbc.ems.model.Employee;

public class EmsClient {
	
	private static IEmployeeDao employeeDao;
	static {
		employeeDao=new EmployeeDao();
	}

	public static void main(String[] args) throws EmployeeException {
		Employee employee=new Employee();
		employee.setEmpName("Jayesh");
		employee.setEmpSal(BigDecimal.valueOf(14000));
		employee=employeeDao.addEmployee(employee);
		if(employee!=null) System.out.println("Employee Added.\n"+employee);
		else System.out.println("Employee not Added."+employee);
		List<Employee> empList=employeeDao.listAllEmployee();
		if(empList!=null) {
			empList.forEach(System.out::println);
		}else {
			System.out.println("No Record Found.");
		}
	}

}
