package com.mx.Employee.model.jpa;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.Employee.model.EmployeeService;
import com.mx.Employee.model.jpa.entities.EmployeeEntity;
import com.mx.Employee.model.jpa.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
	
	private final EmployeeRepository employeeRepository;
	
	@Override
	public void save(EmployeeEntity employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void edit(EmployeeEntity employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void delete(Long idEmployee) {
		employeeRepository.deleteById(idEmployee);
	}

	@Override
	public EmployeeEntity search(Long idEmployee) {
		return employeeRepository.findById(idEmployee).orElse(null);
	}

	@Override
	public List<EmployeeEntity> list() {
		return employeeRepository.findAll();
	}

	@Override
	public List<EmployeeEntity> listFilterName(String name, String lastName) {
		return employeeRepository.findByNameAndLastName(name, lastName);
	}
}
