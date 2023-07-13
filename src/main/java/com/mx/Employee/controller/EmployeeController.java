package com.mx.Employee.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Employee.controller.http.response.EmployeeResponseList;
import com.mx.Employee.controller.http.response.EmployeeResponseSearch;
import com.mx.Employee.controller.http.resquest.EmployeeRequestSave;
import com.mx.Employee.core.mappers.EmployeeMapper;
import com.mx.Employee.model.EmployeeService;
import com.mx.Employee.model.GenderService;
import com.mx.Employee.model.JobService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("employee")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {

	private final EmployeeService employeeService;
	private final EmployeeMapper employeeMapper;
	private final GenderService genderService;
	private final JobService jobService;

	@GetMapping("list")
	public List<EmployeeResponseList> list() {
		return employeeService.list().stream().map(employeeMapper::entityToDom).map(employeeMapper::domToResponse).toList();
	}

	@GetMapping("{id}")
	public EmployeeResponseSearch search(@PathVariable Long id) {
		return employeeMapper.domToResponseSearch(employeeMapper.entityToDom(employeeService.search(id)));
	}

	@PostMapping("save")
	public ResponseEntity<String> save(@RequestBody EmployeeRequestSave employeeRequestSave) {
		if (this.validation(employeeRequestSave)) {
			employeeService.save(employeeMapper.domToEntity(employeeMapper.requestToDom(employeeRequestSave)));
			return ResponseEntity.status(HttpStatus.OK).body("Se agrego el empleado");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se agrego el empleado");
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		employeeService.delete(id);
	}

	@PutMapping("edit")
	public ResponseEntity<String> edit(@RequestBody EmployeeRequestSave employeeRequestSave) {
		if (this.validation(employeeRequestSave)) {
			employeeService.edit(employeeMapper.domToEntity(employeeMapper.requestToDom(employeeRequestSave)));
			return ResponseEntity.status(HttpStatus.OK).body("Se edito el empleado");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se edito el empleado");
	}

	public boolean validation(EmployeeRequestSave employeeRequestSave) {
		if (employeeService.listFilterName(employeeRequestSave.getName(), employeeRequestSave.getLastName()) .size() == 0) {
			LocalDate requestDate = employeeRequestSave.getBirthdate().toLocalDate();
			Period interval = Period.between(requestDate, LocalDate.now());
			boolean gender = this.validateGender(employeeRequestSave.getGender());
			boolean job = this.validateJob(employeeRequestSave.getJob());
			if (interval.getYears() >= 18 && gender && job) {
				System.out.println("Ingreso");
				return true;
			}
		}
		return false;
	}

	public boolean validateGender(Long id) {
		System.out.println("Validar G");
		return genderService.list().stream().filter(g -> g.getId() == id).toList().size() == 1;
	}

	public boolean validateJob(Long id) {
		System.out.println("Validar J");
		return jobService.list().stream().filter(j -> j.getId() == id).toList().size() == 1;
	}
}
