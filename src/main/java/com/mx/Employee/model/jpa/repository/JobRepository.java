package com.mx.Employee.model.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Employee.model.jpa.entities.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, Long> {

}
