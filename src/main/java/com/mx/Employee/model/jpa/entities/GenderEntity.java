package com.mx.Employee.model.jpa.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "GENDERS")
@Getter
@Setter
@NoArgsConstructor
public class GenderEntity {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;
    
    @OneToMany(mappedBy = "gender")
    private List<EmployeeEntity> employees;
    
    public GenderEntity(Long id) {
		super();
		this.id = id;
	}
}