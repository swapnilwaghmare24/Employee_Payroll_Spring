package com.bridgelabz.emppayroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.emppayroll.dto.EmpData;
import com.bridgelabz.emppayroll.exceptions.EmployeePayrollException;
import com.bridgelabz.emppayroll.model.EmployeeData;
import com.bridgelabz.emppayroll.repository.EmployeePayrollRepo;
@Service
public class EmployeePayrollService implements IEmployeeService {
	@Autowired
	EmployeePayrollRepo repo;

	public EmployeeData addEmp(EmpData data) {
		EmployeeData eData = new EmployeeData(data);
		return repo.save(eData);
	}

	public List<EmployeeData> getAllEmp() {
		return repo.findAll();
	}

	public EmployeeData getEmpById(int id) {
		return repo.findById(id).orElseThrow(()-> new EmployeePayrollException("Employee ID is Invalid"));
	}

	public void deleteById(int id) {
		repo.deleteById(id);
	}

	public EmployeeData updateById(int id, EmpData eData) {
		EmployeeData data=repo.findById(id).get();
		data.setName(eData.getName());
		data.setProfile(eData.getProfile());
		data.setGender(eData.getGender());
		data.setDepartments(eData.getDepartments());
		data.setDate(eData.getDate());
		data.setSalary(eData.getSalary());
		data.setNote(eData.getNote());
		return repo.save(data);
	    
	    }

	public List<EmployeeData> getEmployeesByDepartment(String department) {
		return repo.findEmployeesByDepartment((department));
	}

}
