package com.mx.Employee.model.jpa;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.Employee.model.JobService;
import com.mx.Employee.model.jpa.entities.JobEntity;
import com.mx.Employee.model.jpa.repository.JobRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService{

	private final JobRepository jobRepository;
	
	@Override
	public void save(JobEntity job) {
		jobRepository.save(job);
	}

	@Override
	public void edit(JobEntity job) {
		jobRepository.save(job);
	}

	@Override
	public void delete(Long idJob) {
		jobRepository.deleteById(idJob);
	}

	@Override
	public JobEntity search(Long idJob) {
		return jobRepository.findById(idJob).orElse(null);
	}

	@Override
	public List<JobEntity> list() {
		return jobRepository.findAll();
	}
}
