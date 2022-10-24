package com.bridgelabz.emppayroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.emppayroll.model.EmployeeData;
import com.bridgelabz.emppayroll.repository.EmployeePayrollRepo;
@Service
public class EmployeePayrollService {
	@Autowired
	EmployeePayrollRepo repo;

	public EmployeeData addEmp(EmployeeData data) {
		return repo.save(data);
	}

	public List<EmployeeData> getAllEmp() {
		return repo.findAll();
	}

	public EmployeeData getEmpById(int id) {
		return repo.findById(id).get();
	}

	public String deleteById(int id) {
		repo.deleteById(id);
		return "Employee record deleted successfully";
	}

	public EmployeeData updateById(int id, EmployeeData eData) {
		EmployeeData data=repo.findById(id).get();
		data.setName(eData.getName());
		data.setProfile(eData.getProfile());
		data.setDepartment(eData.getDepartment());
		data.setGender(eData.getGender());
		data.setSalary(eData.getSalary());
		data.setNote(eData.getNote());
		return repo.save(data);
	}

}
