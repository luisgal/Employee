package com.mx.Employee.model;

import java.util.List;

import com.mx.Employee.model.jpa.entities.JobEntity;

public interface JobService {
	void save(JobEntity job);
	
	void edit(JobEntity job);
	
	void delete(Long idJob);
	
	JobEntity search(Long idJob);
	
	List<JobEntity> list();
}
