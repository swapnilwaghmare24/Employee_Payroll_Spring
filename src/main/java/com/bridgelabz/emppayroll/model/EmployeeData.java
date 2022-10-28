package com.bridgelabz.emppayroll.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bridgelabz.emppayroll.dto.EmpData;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class EmployeeData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String profile;
	private String gender;
	private LocalDate date;
	private String department;
	private long salary;
	private String note;
	
	public EmployeeData(EmpData empData) {
		this.name=empData.getName();
		this.profile=empData.getProfile();
		this.gender=empData.getGender();
		this.department=empData.getDepartment();
		this.salary=empData.getSalary();
		this.note=empData.getNote();
		this.date=empData.getDate();
	}
	

	
	
	
	
}
