package com.cg.springcore.service;

public class Project {

	private int projId;

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	@Override
	public String toString() {
		return "Project [projId=" + projId + "]";
	}
	
}
