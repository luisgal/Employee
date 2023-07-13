package com.mx.Employee.model;

import java.util.List;

import com.mx.Employee.model.jpa.entities.GenderEntity;

public interface GenderService {
	void save(GenderEntity gender);
	
	void edit(GenderEntity gender);
	
	void delete(Long idGender);
	
	GenderEntity search(Long idGender);
	
	List<GenderEntity> list();
}
