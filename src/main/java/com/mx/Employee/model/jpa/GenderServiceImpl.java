package com.mx.Employee.model.jpa;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.Employee.model.GenderService;
import com.mx.Employee.model.jpa.entities.GenderEntity;
import com.mx.Employee.model.jpa.repository.GenderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GenderServiceImpl implements GenderService{

	private final GenderRepository genderRepository;
	
	@Override
	public void save(GenderEntity gender) {
		genderRepository.save(gender);
	}

	@Override
	public void edit(GenderEntity gender) {
		genderRepository.save(gender);
	}

	@Override
	public void delete(Long idGender) {
		genderRepository.deleteById(idGender);
	}

	@Override
	public GenderEntity search(Long idGender) {
		return genderRepository.findById(idGender).orElse(null);
	}

	@Override
	public List<GenderEntity> list() {
		return genderRepository.findAll();
	}
}
