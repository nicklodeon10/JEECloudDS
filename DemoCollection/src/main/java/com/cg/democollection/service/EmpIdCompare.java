package com.cg.democollection.service;

import java.util.Comparator;

import com.cg.democollection.dto.Employee;

public class EmpIdCompare implements Comparator<Employee<Integer, Double>>{

	public int compare(Employee<Integer, Double> o1, Employee<Integer, Double> o2) {
		if(o1.getEmpId()>o2.getEmpId()) {
			return 1;
		}else if(o1.getEmpId()<o2.getEmpId()){
			return -1;
		}else {
			return 0;
		}
	}



}
