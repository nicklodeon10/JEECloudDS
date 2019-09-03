package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dao.ProjectDAOImpl;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public class ProjectServiceImpl implements ProjectService{

	ProjectDAOImpl dao=new ProjectDAOImpl();
	
	public Project addProject(Project proj) {
		return dao.addProject(proj);
	}

	public Project[] showProject() {
		return dao.showProjects();
	}

	public Project searchProject(Long projId) {
		return dao.searchProject(projId);
	}

	public Project updateProject(Long projId, String projName, Float projCost) {
		return dao.updateProject(projId, projName, projCost);
	}

	public Project removeProject(Long projId) {
		return dao.removeProject(projId);
	}

	public Project[] addEmployeeToProject(Long projId, Employee emp) {
		return dao.addEmployeeToProject(projId, emp);
	}

	public Project[] removeEmployeeFromProject(Long projId, Employee emp) {
		return dao.removeEmployeeFromProject(projId, emp);
	}

}
