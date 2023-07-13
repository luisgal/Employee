package com.mx.Employee.core.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class EmployeeWorkedHoursDom {
    private Long id;
    private Long employee;
    private Integer workedHours;
    private Date workedDate;
}

