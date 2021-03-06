package com.cg.democollection.service;

import java.util.Comparator;

import com.cg.democollection.dto.Employee;

public class SalaryCompare implements Comparator<Employee<Integer, Double>>{

	public int compare(Employee<Integer, Double> o1, Employee<Integer, Double> o2) {
		if(o1.getEmpSalary()>o2.getEmpSalary()) {
			return 1;
		}else if(o1.getEmpSalary()<o2.getEmpSalary()){
			return -1;
		}else {
			return 0;
		}
	}

}
