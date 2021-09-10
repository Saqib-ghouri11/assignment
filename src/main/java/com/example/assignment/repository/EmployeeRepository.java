package com.example.assignment.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment.models.EmployeesDto;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeesDto, Integer	>{

	
}
