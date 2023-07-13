package com.mx.Employee.core.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mx.Employee.controller.http.response.EmployeeResponseList;
import com.mx.Employee.controller.http.response.EmployeeResponseSearch;
import com.mx.Employee.controller.http.resquest.EmployeeRequestSave;
import com.mx.Employee.core.domain.EmployeeDom;
import com.mx.Employee.model.jpa.entities.EmployeeEntity;

@Mapper(uses = {GenderMapper.class,JobMapper.class})
public interface EmployeeMapper {
	
	EmployeeEntity domToEntity(EmployeeDom employeeDom);
	
	@InheritInverseConfiguration
	EmployeeDom entityToDom(EmployeeEntity employeeEntity);
	
	@Mapping(target = "gender", source = "gender.name")
	@Mapping(target = "job", source = "job.name")
	@Mapping(target = "salary", source = "job.salary")
	EmployeeResponseList domToResponse(EmployeeDom employeeDom);
	
	@Mapping(target = "gender.id", source = "gender")
	@Mapping(target = "job.id", source = "job")
	EmployeeDom requestToDom(EmployeeRequestSave employeeRequestSave);
	
	@Mapping(target = "gender", source = "gender.id")
	@Mapping(target = "job", source = "job.id")
	EmployeeResponseSearch domToResponseSearch(EmployeeDom employeeDom);
}
