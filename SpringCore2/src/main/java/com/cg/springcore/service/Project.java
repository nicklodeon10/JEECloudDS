package com.cg.springcore.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pro")
public class Project {
	@Value("1001")
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
