package com.mx.Employee.controller.http.resquest;

import java.sql.Date;

import lombok.Data;

@Data
public class EmployeeRequestSave {
	private Long id;
    private String name;
    private String lastName;
    private Date birthdate;
    private Long gender;
    private Long job;
}
