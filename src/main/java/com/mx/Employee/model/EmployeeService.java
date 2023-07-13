package com.mx.Employee.model;

import java.util.List;

import com.mx.Employee.model.jpa.entities.EmployeeEntity;

public interface EmployeeService {
	void save(EmployeeEntity employee);
	
	void edit(EmployeeEntity employee);
	
	void delete(Long idEmployee);
	
	EmployeeEntity search(Long idEmployee);
	
	List<EmployeeEntity> list();
	
	List<EmployeeEntity> listFilterName(String name, String lastName);
}
