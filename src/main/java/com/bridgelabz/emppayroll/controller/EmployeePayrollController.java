package com.bridgelabz.emppayroll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.emppayroll.model.EmployeeData;
import com.bridgelabz.emppayroll.service.EmployeePayrollService;

@RestController
public class EmployeePayrollController {
	@Autowired
	EmployeePayrollService service;
	
	@PostMapping("/addemp")
	public EmployeeData addEmp(@RequestBody EmployeeData data)
	{
		EmployeeData eData=new EmployeeData(data);
		return service.addEmp(eData);
		
	}
	@GetMapping("/getallemp")
	public List<EmployeeData> getAllEmp()
	{
		return service.getAllEmp();
		
	}
	
	@GetMapping("/id/{id}")
	public EmployeeData getEmpById(@PathVariable int id)
	{
		return service.getEmpById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public String deleteById(@PathVariable int id)
	{
		return service.deleteById(id);
	}
	
	@PutMapping("/id/{id}")
	public EmployeeData updateEmpById(@PathVariable int id, @RequestBody EmployeeData data)
	{
		EmployeeData eData=new EmployeeData(data);
		return service.updateById(id,eData);
	}
	

}
