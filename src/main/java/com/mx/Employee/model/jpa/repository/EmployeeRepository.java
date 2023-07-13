package com.mx.Employee.model.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Employee.model.jpa.entities.EmployeeEntity;
import java.util.List;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	List<EmployeeEntity> findByNameAndLastName(String name, String lastName);
}
