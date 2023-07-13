package com.mx.Employee.controller.http.response;

import java.sql.Date;

import lombok.Data;

@Data
public class EmployeeResponseList {
	private Long id;
    private String name;
    private String lastName;
    private Date birthdate;
    private String gender;
    private String job;
    private Double salary;
}
