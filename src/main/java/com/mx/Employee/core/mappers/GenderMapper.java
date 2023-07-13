package com.mx.Employee.core.mappers;

import org.mapstruct.Mapper;

import com.mx.Employee.core.domain.GenderDom;
import com.mx.Employee.model.jpa.entities.GenderEntity;

@Mapper
public interface GenderMapper {

	GenderEntity domToEntity(GenderDom genderDom);
	GenderDom entityToDom(GenderEntity genderEntity);
}
