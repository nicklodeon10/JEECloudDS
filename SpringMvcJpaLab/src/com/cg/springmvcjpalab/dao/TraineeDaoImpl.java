package com.cg.springmvcjpalab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.springmvcjpalab.dto.Trainee;

@Repository("traineeDao")
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public Trainee add(Trainee trainee) {
		entityManager.persist(trainee);
		return trainee;
	}

	@Override
	public boolean remove(Integer traineeId) {
		entityManager.remove(entityManager.find(Trainee.class, traineeId));
		return true;
	}

	@Override
	public boolean update(Trainee trainee) {
		Trainee persistedTrainee=entityManager.find(Trainee.class, trainee.getTraineeId());
		persistedTrainee.setTraineeName(trainee.getTraineeName());
		persistedTrainee.setTraineeDomain(trainee.getTraineeDomain());
		persistedTrainee.setTraineeLocation(trainee.getTraineeLocation());
		return true;
	}

	@Override
	public Trainee view(Integer traineeId) {
		return entityManager.find(Trainee.class, traineeId);
	}

	@Override
	public List<Trainee> viewAll() {
		TypedQuery<Trainee> typedQuery=entityManager.createQuery("FROM Trainee", Trainee.class);
		return typedQuery.getResultList();
	}

}
