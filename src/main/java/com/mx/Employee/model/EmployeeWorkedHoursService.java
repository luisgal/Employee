package com.mx.Employee.model;

import java.util.List;

import com.mx.Employee.model.jpa.entities.EmployeeEntity;
import com.mx.Employee.model.jpa.entities.EmployeeWorkedHoursEntity;

public interface EmployeeWorkedHoursService {
	void save(EmployeeWorkedHoursEntity employeeWorkedHours);
	
	void edit(EmployeeWorkedHoursEntity employeeWorkedHours);
	
	void delete(Long idEmployeeWorkedHours);
	
	EmployeeWorkedHoursEntity search(Long idEmployeeWorkedHours);
	
	List<EmployeeWorkedHoursEntity> list();
	
	List<EmployeeWorkedHoursEntity> listByEmployee(EmployeeEntity employeeEntity);
}
