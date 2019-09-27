package com.cg.springmvcjpalab.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcjpalab.dao.TraineeDao;
import com.cg.springmvcjpalab.dto.Trainee;

@Service("traineeService")
@Transactional
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeDao traineeDao;
	
	@Override
	public Trainee add(Trainee trainee) {
		return traineeDao.add(trainee);
	}

	@Override
	public boolean remove(Integer traineeId) {
		return traineeDao.remove(traineeId);
	}

	@Override
	public boolean update(Trainee trainee) {
		return traineeDao.update(trainee);
	}

	@Override
	public Trainee view(Integer traineeId) {
		return traineeDao.view(traineeId);
	}

	@Override
	public List<Trainee> viewAll() {
		return traineeDao.viewAll();
	}

}
