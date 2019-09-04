package com.cg.demomap.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cg.demomap.dao.EmployeeDAO;
import com.cg.demomap.dao.EmployeeDAOImpl;
import com.cg.demomap.dto.Employee;
import com.cg.demomap.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDAO dao=new EmployeeDAOImpl();
	
	public Employee<Integer, Double> addEmployee(Employee<Integer, Double> emp) {
		return dao.addEmployee(emp);
	}

	public List<Employee<Integer, Double>> showEmployee() {
		Map<Integer, Employee<Integer, Double>> myMap=dao.showEmployee();
		List<Employee<Integer, Double>> myList=new ArrayList<Employee<Integer, Double>>();
		Set<Map.Entry<Integer, Employee<Integer, Double>>> mySet=myMap.entrySet();
		for(Map.Entry<Integer, Employee<Integer,Double>> e: mySet) {
			myList.add(e.getValue());
		}
		return myList;
	}

	public List<Employee<Integer, Double>> sortEmployee(int sortType) throws EmployeeException {
		List<Employee<Integer, Double>> myList=showEmployee();
		if(sortType==1) {
			Collections.sort(myList, new IDCompare());
		}else if(sortType==2) {
			Collections.sort(myList, new NameCompare());
		}else if(sortType==3) {
			Collections.sort(myList, new SalaryCompare());
		}else {
			throw new EmployeeException("Choice must be between 1-3.");
		}
		return myList;
	}

	public Employee<Integer, Double> searchEmployee(Integer empId) {
		List<Employee<Integer, Double>> myList=showEmployee();
		for(Employee<Integer, Double> e: myList) {
			if(e.getEmpId().equals(empId))
				return e;
		}
		return null;
	}

	public void removeEmployee(Integer empId) {
		dao.removeEmployee(empId);
	}

	public static class IDCompare implements Comparator<Employee<Integer, Double>>{
		public int compare(Employee<Integer, Double> o1, Employee<Integer, Double> o2) {
			if(o1.getEmpId()>o2.getEmpId()) return 1;
			else if(o1.getEmpId()<o2.getEmpId()) return -1;
			return 0;
		}
	}
	
	public class NameCompare implements Comparator<Employee<Integer, Double>>{
		public int compare(Employee<Integer, Double> o1, Employee<Integer, Double> o2) {
			return o1.getEmpName().compareTo(o2.getEmpName());
		}
	}

	public class SalaryCompare implements Comparator<Employee<Integer, Double>>{
		public int compare(Employee<Integer, Double> o1, Employee<Integer, Double> o2) {
			if(o1.getEmpSalary()>o2.getEmpSalary()) return 1;
			else if(o1.getEmpSalary()<o2.getEmpSalary()) return -1;
			return 0;
		}
	}

}
