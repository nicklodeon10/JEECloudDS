package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public interface ProjectDAO {

	public Project addProject(Project proj);
	
	public Project[] showProjects();
	
	public Project searchProject(Long projId);
	
	public Project updateProject(Long projId, String projName, Float projCost);
	
	public Project removeProject(Long projId);
	
	public Project[] addEmployeeToProject(Long projId, Employee emp);
	
	public Project[] removeEmployeeFromProject(Long projId, Employee emp);
	
}
