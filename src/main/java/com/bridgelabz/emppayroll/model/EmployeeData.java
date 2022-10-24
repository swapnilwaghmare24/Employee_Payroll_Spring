package com.bridgelabz.emppayroll.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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
	public EmployeeData() {
		super();
	}
	public EmployeeData(int id, String name, String profile, String gender, String department, long salary,
			String note,LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.note = note;
		this.date=date;
	}
	public EmployeeData(EmployeeData employeeData) {
		this.id=employeeData.id;
		this.profile=employeeData.profile;
		this.gender=employeeData.gender;
		this.department=employeeData.department;
		this.salary=employeeData.salary;
		this.note=employeeData.note;
		this.date=employeeData.date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", profile=" + profile + ", gender=" + gender + ", date="
				+ date + ", department=" + department + ", salary=" + salary + ", note=" + note + "]";
	}
	
	
	
	
	
}
