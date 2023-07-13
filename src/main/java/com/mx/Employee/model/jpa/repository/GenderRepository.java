package com.mx.Employee.model.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Employee.model.jpa.entities.GenderEntity;

public interface GenderRepository extends JpaRepository<GenderEntity, Long> {

}
