package com.example.assignment.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DEPARTMENTS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "DEPARTMENT_ID")
	 private Integer	department_id ;
	 
	 @Column(name = "DEPARTMENT_NAME")
	 private String department_name ;
	 
	 @Column(name = "MANAGER_ID")
	 private Integer manager_id ;
}
