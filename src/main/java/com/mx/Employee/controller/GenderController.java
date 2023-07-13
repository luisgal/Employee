package com.mx.Employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Employee.model.GenderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("gender")
@RequiredArgsConstructor
@CrossOrigin
public class GenderController {

	private final GenderService genderService;
	
	@GetMapping("names")
	public List<String> listGenders(){
		return genderService.list().stream().map(g -> g.getName()).toList();
	}
}
