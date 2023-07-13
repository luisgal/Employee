package com.mx.Employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Employee.model.JobService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("job")
@RequiredArgsConstructor
@CrossOrigin
public class JobController {

	private final JobService jobService;
	
	@GetMapping("names")
	public List<String> listJobs(){
		return jobService.list().stream().map(j -> j.getName()).toList();
	}
}
