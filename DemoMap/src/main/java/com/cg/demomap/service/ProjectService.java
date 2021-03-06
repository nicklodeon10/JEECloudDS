package com.cg.demomap.service;

import java.util.List;

import com.cg.demomap.dto.Project;

public interface ProjectService {

	public Project<Integer, Double> addProject(Project<Integer, Double> proj);
	
	public List<Project<Integer, Double>> showProjects();
	
	public Project<Integer, Double> removeProject(Integer projId);
	
	public Project<Integer, Double> searchProject(Integer projId);
	
}
