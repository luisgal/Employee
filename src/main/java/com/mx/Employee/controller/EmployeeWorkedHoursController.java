package com.mx.Employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Employee.core.domain.EmployeeDom;
import com.mx.Employee.core.domain.EmployeeWorkedHoursDom;
import com.mx.Employee.core.mappers.EmployeeMapper;
import com.mx.Employee.core.mappers.EmployeeWorkedHoursMapper;
import com.mx.Employee.model.EmployeeWorkedHoursService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("workedHours")
@CrossOrigin
@RequiredArgsConstructor
public class EmployeeWorkedHoursController {

	private final EmployeeWorkedHoursService employeeWorkedHoursService;
	private final EmployeeWorkedHoursMapper employeeWorkedHoursMapper;
	private final EmployeeMapper employeeMapper;
	
	@GetMapping("{id}")
	public List<EmployeeWorkedHoursDom> listByEmployee(@PathVariable(name = "id") Long id){
		EmployeeDom employee = new EmployeeDom();
		employee.setId(id);
		return employeeWorkedHoursService
			.listByEmployee(employeeMapper.domToEntity(employee))
			.stream()
			.map(employeeWorkedHoursMapper::entityToDom)
			.toList();
	}
	
	@PostMapping()
	public void insertWorkedHours(@RequestBody EmployeeWorkedHoursDom employeeWorkedHoursDom) {
		employeeWorkedHoursService.save(employeeWorkedHoursMapper.domToEntity(employeeWorkedHoursDom));
	}
}
