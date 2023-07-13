package com.mx.Employee.model.jpa;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.Employee.model.EmployeeWorkedHoursService;
import com.mx.Employee.model.jpa.entities.EmployeeEntity;
import com.mx.Employee.model.jpa.entities.EmployeeWorkedHoursEntity;
import com.mx.Employee.model.jpa.repository.EmployeeWorkedHoursRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeWorkedHoursServiceImpl implements EmployeeWorkedHoursService {

	private final EmployeeWorkedHoursRepository employeeWorkedHoursRepository;
	
	@Override
	public void save(EmployeeWorkedHoursEntity employeeWorkedHours) {
		employeeWorkedHoursRepository.save(employeeWorkedHours);
	}

	@Override
	public void edit(EmployeeWorkedHoursEntity employeeWorkedHours) {
		employeeWorkedHoursRepository.save(employeeWorkedHours);
	}

	@Override
	public void delete(Long idEmployeeWorkedHours) {
		employeeWorkedHoursRepository.deleteById(idEmployeeWorkedHours);
	}

	@Override
	public EmployeeWorkedHoursEntity search(Long idEmployeeWorkedHours) {
		return employeeWorkedHoursRepository.findById(idEmployeeWorkedHours).orElse(null);
	}

	@Override
	public List<EmployeeWorkedHoursEntity> list() {
		return employeeWorkedHoursRepository.findAll();
	}

	@Override
	public List<EmployeeWorkedHoursEntity> listByEmployee(EmployeeEntity employeeEntity) {
		return employeeWorkedHoursRepository.findByEmployee(employeeEntity);
	}

}
