package com.cg.democollection.service;

import java.util.Comparator;

import com.cg.democollection.dto.Employee;

public class NameCompare implements Comparator<Employee<Integer, Double>> {

	public int compare(Employee<Integer, Double> o1, Employee<Integer, Double> o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
	
}
