package com.mx.Employee.model.jpa.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EMPLOYEE_WORKED_HOURS")
@Getter
@Setter
@NoArgsConstructor
public class EmployeeWorkedHoursEntity {
    @Id
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private EmployeeEntity employee;

    @Column(name = "WORKED_HOURS")
    private Integer workedHours;

    @Column(name = "WORKED_DATE")
    private Date workedDate;
    
    public EmployeeWorkedHoursEntity(Long id) {
    	this.id = id;
    }
}

