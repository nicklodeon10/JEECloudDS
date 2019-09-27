package com.cg.springmvcjpalab.service;

import java.util.List;

import com.cg.springmvcjpalab.dto.Trainee;

public interface TraineeService {

	public Trainee add(Trainee trainee);
	
	public boolean remove(Integer traineeId);
	
	public boolean update(Trainee trainee);
	
	public Trainee view(Integer traineeId);
	
	public List<Trainee> viewAll();
	
}
