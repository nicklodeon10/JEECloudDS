package com.cg.demomap.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cg.demomap.dto.Employee;

public class MyApplication {

	public static void main(String[] args) {
		Map<Integer, Employee<Integer, Double>> myMap=new HashMap<Integer, Employee<Integer, Double>>();
		myMap.put(111, new Employee<Integer, Double>(111,"Devang",234.234));
		myMap.put(333, new Employee<Integer, Double>(333,"Aditya",232.234));
		myMap.put(444, new Employee<Integer, Double>(444,"Mayank",231.234));
		myMap.put(444, new Employee<Integer, Double>(444,"Mayank",231.234));
		myMap.put(222, new Employee<Integer, Double>(222,"Gautam",233.234));
		
		Set<Map.Entry<Integer, Employee<Integer, Double>>> mySet=myMap.entrySet();
		for(Map.Entry<Integer, Employee<Integer, Double>> entry: mySet) {
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue());
		}
	}

}
