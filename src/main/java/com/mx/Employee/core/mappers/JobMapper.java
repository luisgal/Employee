package com.mx.Employee.core.mappers;

import org.mapstruct.Mapper;

import com.mx.Employee.core.domain.JobDom;
import com.mx.Employee.model.jpa.entities.JobEntity;

@Mapper
public interface JobMapper {

	JobEntity domToEntity(JobDom jobDom);
	JobDom entityToDom(JobEntity jobEntity);
}
