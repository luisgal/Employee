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
@Table(name = "JOBS")
@Getter
@Setter
@NoArgsConstructor
public class JobEntity {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SALARY")
    private Double salary;
    
    @OneToMany(mappedBy = "job")
    private List<EmployeeEntity> employees;

	public JobEntity(Long id) {
		super();
		this.id = id;
	}
	
}

