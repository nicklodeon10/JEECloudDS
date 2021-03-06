package com.cg.demomap.dto;

import java.util.Map;

public class Project<T, K> {
	
	T id;
	String name;
	Map<Integer, Employee<Integer, Double, Department<Integer>>> empMap;
	K cost;
	
	public Project() {
	}

	public Project(T id, String name, Map<Integer, Employee<Integer, Double, Department<Integer>>> empMap, K cost) {
		this.id = id;
		this.name = name;
		this.empMap = empMap;
		this.cost = cost;
	}

	public T getId() {
		return id;
	}
	
	public void setId(T id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<Integer, Employee<Integer, Double, Department<Integer>>> getEmpMap() {
		return empMap;
	}
	
	public void setEmpMap(Map<Integer, Employee<Integer, Double, Department<Integer>>> empMap) {
		this.empMap = empMap;
	}
	
	public K getCost() {
		return cost;
	}

	public void setCost(K cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", empMap=" + empMap + ", cost=" + cost + "]";
	}
	
}
