package com.bridgelabz.emppayroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.emppayroll.dto.EmpData;
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
		return repo.findById(id).get();
	}

	public void deleteById(int id) {
		repo.deleteById(id);
	}

	public EmployeeData updateById(int id, EmpData eData) {
		EmployeeData data=repo.findById(id).get();
		data.setName(eData.getName());
		data.setProfile(eData.getProfile());
		data.setDepartment(eData.getDepartment());
		data.setGender(eData.getGender());
		data.setDate(eData.getDate());
		data.setSalary(eData.getSalary());
		data.setNote(eData.getNote());
		return repo.save(data);
	    
	    }

}
