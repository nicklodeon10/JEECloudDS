package com.cg.springmvcjpalab.dao;

import java.util.List;

import com.cg.springmvcjpalab.dto.Trainee;

public interface TraineeDao {
	
	public Trainee add(Trainee trainee);
	
	public boolean remove(Integer traineeId);
	
	public boolean update(Trainee trainee);
	
	public Trainee view(Integer traineeId);
	
	public List<Trainee> viewAll();
	
}
