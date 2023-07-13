package com.mx.Employee.model.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Employee.model.jpa.entities.EmployeeWorkedHoursEntity;
import java.util.List;
import com.mx.Employee.model.jpa.entities.EmployeeEntity;


public interface EmployeeWorkedHoursRepository extends JpaRepository<EmployeeWorkedHoursEntity, Long> {
	List<EmployeeWorkedHoursEntity> findByEmployee(EmployeeEntity employee);
}
