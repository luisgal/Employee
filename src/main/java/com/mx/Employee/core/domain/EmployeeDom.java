package com.mx.Employee.core.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class EmployeeDom {
    private Long id;
    private String name;
    private String lastName;
    private Date birthdate;
    private GenderDom gender;
    private JobDom job;
}
