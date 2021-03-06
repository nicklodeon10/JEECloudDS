package com.cg.demomap.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.demomap.dto.Project;

public class ProjectDaoImpl implements ProjectDao{
	
	Map<Integer, Project<Integer, Double>> myProj=new HashMap<Integer, Project<Integer, Double>>();

	public Project<Integer, Double> addProject(Project<Integer, Double> proj) {
		return myProj.put(proj.getId(), proj);
	}

	public Map<Integer, Project<Integer, Double>> showProjects() {
		return myProj;
	}

	public Project<Integer, Double> removeProject(Integer projId) {
		return myProj.remove(projId);
	}

}
