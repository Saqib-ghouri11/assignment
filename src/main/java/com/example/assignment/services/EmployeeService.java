package com.example.assignment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.assignment.interfaces.EmployeeServiceInterface;
import com.example.assignment.models.EmployeesDto;
import com.example.assignment.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface	 {

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public List<EmployeesDto> getEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public EmployeesDto createEmployee(EmployeesDto dto) {
		// TODO Auto-generated method stub
		return repository.save(dto);
	}

	@Override
	public Page<EmployeesDto> getEmployeesByPaging(Optional<Integer> page) {
		// TODO Auto-generated method stub
		return repository.findAll(PageRequest.of(page.orElse(0), 2));
	}

}
