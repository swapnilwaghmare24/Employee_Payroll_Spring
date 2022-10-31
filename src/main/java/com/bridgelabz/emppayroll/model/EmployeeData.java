package com.bridgelabz.emppayroll.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

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
	private long salary;
	private String note;
	
	
	@ElementCollection
    @CollectionTable(name="employee_department",
                    joinColumns =@JoinColumn(name="emp_id"))
    @Column(name = "department")
    public List<String> departments;
	
	
	
	
	
	public EmployeeData(EmpData data) {
        this.updateEmployeePayrollData(data);
    }

    public void updateEmployeePayrollData(EmpData data) {
        this.name = data.getName();
        this.salary = data.getSalary();
        this.gender = data.getGender();
        this.note = data.getNote();
        this.date= data.getDate();
        this.profile = data.getProfile();
        this.departments = data.getDepartments();
    }
	

	
	
	
	
}
