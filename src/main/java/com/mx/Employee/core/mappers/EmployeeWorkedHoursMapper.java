package com.mx.Employee.core.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mx.Employee.core.domain.EmployeeWorkedHoursDom;
import com.mx.Employee.model.jpa.entities.EmployeeWorkedHoursEntity;

@Mapper
public interface EmployeeWorkedHoursMapper {
	@Mapping(target = "employee", source = "employee.id")
	EmployeeWorkedHoursDom entityToDom(EmployeeWorkedHoursEntity employeeWorkedHoursEntity);
	@InheritInverseConfiguration
	EmployeeWorkedHoursEntity domToEntity(EmployeeWorkedHoursDom employeeWorkedHoursDom);
}
