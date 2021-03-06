package com.cg.demomap.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cg.demomap.dao.ProjectDao;
import com.cg.demomap.dao.ProjectDaoImpl;
import com.cg.demomap.dto.Project;
import com.cg.demomap.exception.EmployeeException;

public class ProjectServiceImpl implements ProjectService{
	
	ProjectDao dao=new ProjectDaoImpl();

	public Project<Integer, Double> addProject(Project<Integer, Double> proj) {
		return dao.addProject(proj);
	}

	public List<Project<Integer, Double>> showProjects() {
		Map<Integer, Project<Integer, Double>> myMap=dao.showProjects();
		List<Project<Integer, Double>> myList=new ArrayList<Project<Integer, Double>>();
		Set<Map.Entry<Integer, Project<Integer, Double>>> mySet=myMap.entrySet();
		for(Map.Entry<Integer, Project<Integer, Double>> e: mySet) {
			myList.add(e.getValue());
		}
		return myList;
	}

	public Project<Integer, Double> removeProject(Integer projId) {
		return dao.removeProject(projId);
	}

	public Project<Integer, Double> searchProject(Integer projId) {
		return dao.showProjects().get(projId);
	}

	public static void validateProjectId(Integer projId) throws EmployeeException {
		if(!(projId==111 || projId==222 || projId==333))
			throw new EmployeeException("Invalid Project Id.");
	}
}
