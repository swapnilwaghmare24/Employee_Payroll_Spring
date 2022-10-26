package com.bridgelabz.emppayroll.dto;

import java.time.LocalDate;

public class EmpData {
	
	private String name;
	private String profile;
	private String gender;
	private LocalDate date;
	private String department;
	private long salary;
	private String note;
	public EmpData() {
		super();
	}
	public EmpData(String name, String profile, String gender, LocalDate date, String department, long salary,
			String note) {
		super();
		this.name = name;
		this.profile = profile;
		this.gender = gender;
		this.date = date;
		this.department = department;
		this.salary = salary;
		this.note = note;
	}
	
	public EmpData(EmpData empData) {
		this.name=empData.name;
		this.profile=empData.profile;
		this.gender=empData.gender;
		this.department=empData.department;
		this.salary=empData.salary;
		this.note=empData.note;
		this.date=empData.date;
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
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
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
	@Override
	public String toString() {
		return "EmpData [name=" + name + ", profile=" + profile + ", gender=" + gender + ", date=" + date
				+ ", department=" + department + ", salary=" + salary + ", note=" + note + "]";
	}
	
	

}
