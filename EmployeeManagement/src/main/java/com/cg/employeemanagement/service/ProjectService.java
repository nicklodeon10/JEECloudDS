package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public interface ProjectService {
	
	public Project addProject(Project proj);
	
	public Project[] showProject();
	
	public Project searchProject(Long projId);
	
	public Project updateProject(Long projId, String projName, Float projCost);
	
	public Project removeProject(Long projId);
	
	public Project[] addEmployeeToProject(Long projId, Employee emp);
	
	public Project[] removeEmployeeFromProject(Long projId, Employee emp);
	
}
