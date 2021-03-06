package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public class ProjectDAOImpl implements ProjectDAO {
	
	final public static int ARRAY_LIMIT=5;
	
	Project projList[]=new Project[ARRAY_LIMIT];
	public static int top=0;

	public Project addProject(Project proj) {
		if(top<ARRAY_LIMIT) {
			projList[top]=proj;
			top++;
		}else {
			System.err.println("Memory Full.");
		}
		return proj;
	}

	public Project[] showProjects() {
		return projList;
	}

	public Project searchProject(Long projId) {
		Project tempProj=null;
		for(int i=0; i<top; i++) {
			tempProj=projList[i];
			if(tempProj.getProjId()==projId)
				break;
		}
		return tempProj;
	}

	public Project updateProject(Long projId, String projName, Float projCost) {
		Project tempProj=null;
		for(int i=0; i<top; i++) {
			tempProj=projList[i];
			if(tempProj.getProjId()==projId) {
				projList[i].setProjName(projName);
				projList[i].setProjCost(projCost);
				break;
			}
		}
		return tempProj;
	}

	public Project removeProject(Long projId) {
		Project tempProj=null;
		for(int i=0; i<top; i++) {
			tempProj=projList[i];
			if(tempProj.getProjId()==projId) {
				projList[i]=null;
				break;
			}
		}
		return tempProj;
	}

	public Project[] addEmployeeToProject(Long projId, Employee emp) {
		Project tempProj=null;
		for(int i=0; i<top; i++) {
			tempProj=projList[i];
			if(tempProj.getProjId()==projId) {
				for(int j=0; j<projList[i].getEmplList().length; j++) {
					if((projList[i].getEmplList())[j]==null) {
						(projList[i].getEmplList())[j]=emp;
						break;
					}
				}
			}
		}
		return projList;
	}

	public Project[] removeEmployeeFromProject(Long projId, Employee emp) {
		Project tempProj=null;
		for(int i=0; i<top; i++) {
			tempProj=projList[i];
			if(tempProj.getProjId()==projId) {
				for(int j=0; j<projList[i].getEmplList().length; j++) {
					if((projList[i].getEmplList())[j]==emp) {
						(projList[i].getEmplList())[j]=null;
						break;
					}
				}
			}
		}
		return projList;
	}

}
