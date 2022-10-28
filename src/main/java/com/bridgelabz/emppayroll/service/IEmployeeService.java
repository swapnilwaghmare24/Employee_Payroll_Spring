package com.bridgelabz.emppayroll.service;

import java.util.List;

import com.bridgelabz.emppayroll.dto.EmpData;
import com.bridgelabz.emppayroll.model.EmployeeData;

public interface IEmployeeService {
	
	public EmployeeData addEmp(EmpData data);
	public List<EmployeeData> getAllEmp();
	public EmployeeData getEmpById(int id);
	public void deleteById(int id);
	public EmployeeData updateById(int id, EmpData eData);

}
