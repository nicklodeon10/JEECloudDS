package com.cg.demomap.dao;

import java.util.Map;

import com.cg.demomap.dto.Project;

public interface ProjectDao {

	public Project<Integer, Double> addProject(Project<Integer, Double> proj);
	
	public Map<Integer, Project<Integer, Double>> showProjects();
	
	public Project<Integer, Double> removeProject(Integer projId);
	
}
