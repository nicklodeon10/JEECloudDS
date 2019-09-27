package com.cg.mvcjpalab.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lab_trainee")
public class Trainee {

	@Id
	@Column(name="trainee_id")
	private Integer traineeId;
	@Column(name="trainee_name")
	private String traineeName;
	@Column(name="trainee_domain")
	private String traineeDomain;
	@Column(name="trainee_location")
	private String traineeLocation;

	public Trainee() {
		super();
	}

	public Trainee(Integer traineeId, String traineeName, String traineeDomain, String traineeLocation) {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeDomain=" + traineeDomain
				+ ", traineeLocation=" + traineeLocation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((traineeDomain == null) ? 0 : traineeDomain.hashCode());
		result = prime * result + ((traineeId == null) ? 0 : traineeId.hashCode());
		result = prime * result + ((traineeLocation == null) ? 0 : traineeLocation.hashCode());
		result = prime * result + ((traineeName == null) ? 0 : traineeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (traineeDomain == null) {
			if (other.traineeDomain != null)
				return false;
		} else if (!traineeDomain.equals(other.traineeDomain))
			return false;
		if (traineeId == null) {
			if (other.traineeId != null)
				return false;
		} else if (!traineeId.equals(other.traineeId))
			return false;
		if (traineeLocation == null) {
			if (other.traineeLocation != null)
				return false;
		} else if (!traineeLocation.equals(other.traineeLocation))
			return false;
		if (traineeName == null) {
			if (other.traineeName != null)
				return false;
		} else if (!traineeName.equals(other.traineeName))
			return false;
		return true;
	}

	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

}
