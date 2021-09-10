package com.example.assignment.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.interfaces.EmployeeServiceInterface;
import com.example.assignment.models.EmployeesDto;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceInterface serviceInterface;
	
	@PostMapping("api/posts/create")
	public ResponseEntity<?> insertEmployee(@Valid @RequestBody EmployeesDto dto){
		EmployeesDto employeeDto= serviceInterface.createEmployee(dto);
		return new ResponseEntity<>(employeeDto,HttpStatus.CREATED);
	}
	
	@GetMapping("api/get-all")
	public ResponseEntity<?> getEmployees(){
		List<EmployeesDto> employeesDtos= serviceInterface.getEmployees();
		return new ResponseEntity<>(employeesDtos,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> hello() {
	
		return new ResponseEntity<>(new String("App Running..."),HttpStatus.OK);
	}
	@GetMapping("api/get-all-pages")
	public ResponseEntity<?> getEmployeesPage(@RequestParam Optional<Integer> page){
		Page<EmployeesDto> pagee=serviceInterface.getEmployeesByPaging(page);
		return new ResponseEntity<>(pagee,HttpStatus.OK);
	}
}
