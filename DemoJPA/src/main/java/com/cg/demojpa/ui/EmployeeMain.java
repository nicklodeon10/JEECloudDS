package com.cg.demojpa.ui;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import com.cg.demojpa.dto.Address;
import com.cg.demojpa.dto.Department;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;
import com.cg.demojpa.service.EmployeeService;
import com.cg.demojpa.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) throws ParseException {

		EmployeeService service = new EmployeeServiceImpl();
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * int choice = 0; do { System.out.
		 * println("Enter\n1 to Add.\n2 to Remove\n3 to Find.\n4 to Update.\n5 to Search b/w range.\n0 to Exit."
		 * ); choice = scanner.nextInt(); switch (choice) { case 0:{ System.exit(0);
		 * break; } case 1: { System.out.println("Enter Employee Id: "); int
		 * id=scanner.nextInt(); scanner.nextLine();
		 * System.out.println("Enter Employee Name: "); String name=scanner.nextLine();
		 * System.out.println("Enter Employee Salary: "); Double
		 * salary=scanner.nextDouble();
		 * System.out.println("Enter the Date of Joining: "); String
		 * date=scanner.next(); SimpleDateFormat st=new SimpleDateFormat("yyyy/MM/dd");
		 * Date joiningDate=st.parse(date); System.out.println("Enter City: "); String
		 * city=scanner.next(); System.out.println("Enter State: "); String
		 * state=scanner.next(); System.out.println("Enter Pincode: "); Integer
		 * pincode=scanner.nextInt(); System.out.println("Enter Project Id: "); Integer
		 * projId=scanner.nextInt(); System.out.println("Enter Project Name: "); String
		 * projName=scanner.next(); System.out.println("Enter Project Cost: "); Double
		 * projCost=scanner.nextDouble(); System.out.println("Enter Department Id: ");
		 * Integer depId=scanner.nextInt();
		 * System.out.println("Enter Department Name: "); String depName=scanner.next();
		 * 
		 * Project project=new Project(); Address address=new Address(); Employee
		 * emp=new Employee(); Department department=new Department();
		 * 
		 * department.setDepId(depId); department.setDepName(depName);
		 * 
		 * project.setProjId(projId); project.setProjName(projName);
		 * project.setProjCost(projCost);
		 * 
		 * address.setCity(city); address.setState(state); address.setPincode(pincode);
		 * 
		 * emp.setEmpId(id); emp.setEmpName(name); emp.setEmpSalary(salary);
		 * emp.setDateOfJoining(joiningDate);
		 * 
		 * emp.setAddress(address); emp.setDepartment(department);
		 * emp.setProject(project);
		 * 
		 * service.addEmployee(emp); break; }case 2:{ try {
		 * System.out.println("Enter Employee Id: "); int id=scanner.nextInt();
		 * service.removeEmployee(id); break; }catch(Exception exception) {
		 * System.err.println("Employee ID not found."); continue; } }case 3:{
		 * List<Employee> empList=service.showAll(); for(Employee emp: empList) {
		 * System.out.println(emp); } break; }case 4:{
		 * System.out.println("Enter Employee Id: "); int id=scanner.nextInt();
		 * scanner.nextLine(); System.out.println("Enter Employee Name: "); String
		 * name=scanner.nextLine(); System.out.println("Enter Employee Salary: ");
		 * Double salary=scanner.nextDouble();
		 * System.out.println("Enter the Date of Joining: "); String
		 * date=scanner.next(); SimpleDateFormat st=new SimpleDateFormat("yyyy/MM/dd");
		 * Date joiningDate=st.parse(date); System.out.println("Enter City: "); String
		 * city=scanner.next(); System.out.println("Enter State: "); String
		 * state=scanner.next(); System.out.println("Enter Pincode: "); Integer
		 * pincode=scanner.nextInt(); System.out.println("Enter Project Id: "); Integer
		 * projId=scanner.nextInt(); System.out.println("Enter Project Name: "); String
		 * projName=scanner.next(); System.out.println("Enter Project Cost: "); Double
		 * projCost=scanner.nextDouble(); Project project=new Project();
		 * project.setProjId(projId); project.setProjName(projName);
		 * project.setProjCost(projCost); Address address=new Address();
		 * address.setCity(city); address.setState(state); address.setPincode(pincode);
		 * Employee emp=new Employee(); emp.setEmpId(id); emp.setEmpName(name);
		 * emp.setEmpSalary(salary); emp.setDateOfJoining(joiningDate);
		 * emp.setAddress(address); emp.setProject(project);
		 * service.updateEmployee(emp); break; }case 5:{
		 * System.out.println("Enter Min Value: "); Double min=scanner.nextDouble();
		 * System.out.println("Enter Max Value: "); Double max=scanner.nextDouble();
		 * List<Employee> empList=service.findBetweenSalary(min, max); for(Employee emp:
		 * empList) { System.out.println(emp); } } } } while (choice != 0);
		 * scanner.close();
		 */
		Address address=new Address("Mumbai","MH",221212);
		Project project1=new Project(121,"JavaProject",43243.234);
		Project project2=new Project(122,"JavaProject",43243.234);
		Project project3=new Project(123,"JavaProject",43243.234);
		Department department=new Department();
		department.setDepId(123);
		department.setDepName("JavaCloud");
		ZoneId defaultZoneId = ZoneId.systemDefault();
		LocalDate localDate = LocalDate.of(2016, 8, 19);
		Employee e1=new Employee(111, "Employee1", 111.111, Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()), address, project1, department);
		Employee e2=new Employee(222, "Employee2", 222.222, Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()), address, project2, department);
		Employee e3=new Employee(333, "Employee3", 333.333, Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()), address, project3, department);
		service.addEmployee(e1);
		service.addEmployee(e2);
		service.addEmployee(e3);
	}

}
