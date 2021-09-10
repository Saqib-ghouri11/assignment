package com.example.assignment.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.assignment.models.EmployeesDto;

public interface EmployeeServiceInterface {

	public List<EmployeesDto> getEmployees();
	public EmployeesDto createEmployee(EmployeesDto dto);
	public Page<EmployeesDto> getEmployeesByPaging(Optional<Integer> page);
}
