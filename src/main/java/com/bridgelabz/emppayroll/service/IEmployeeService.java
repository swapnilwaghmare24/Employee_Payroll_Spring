package com.bridgelabz.emppayroll.service;

import java.util.List;

import com.bridgelabz.emppayroll.model.EmployeeData;

public interface IEmployeeService {
	
	public EmployeeData addEmp(EmployeeData data);
	public List<EmployeeData> getAllEmp();
	public EmployeeData getEmpById(int id);
	public String deleteById(int id);
	public EmployeeData updateById(int id, EmployeeData eData);

}
