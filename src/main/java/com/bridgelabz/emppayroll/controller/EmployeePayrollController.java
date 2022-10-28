package com.bridgelabz.emppayroll.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.emppayroll.dto.EmpData;
import com.bridgelabz.emppayroll.dto.ResponseDto;
import com.bridgelabz.emppayroll.model.EmployeeData;
import com.bridgelabz.emppayroll.service.EmployeePayrollService;

@RestController
public class EmployeePayrollController {
	@Autowired
	EmployeePayrollService service;
	
	@PostMapping("/addemp")
	public ResponseEntity<ResponseDto> addEmp(@RequestBody @Valid EmpData data)
	{
		EmployeeData employeeData= service.addEmp(data);
        ResponseDto resp = new ResponseDto("Data Added ",employeeData);
        return new ResponseEntity<ResponseDto>(resp, HttpStatus.OK);
		
	}
	@GetMapping("/getallemp")
	public ResponseEntity<ResponseDto> getAllEmp()
	{
		List<EmployeeData> empDataList= service.getAllEmp();
        ResponseDto resp = new ResponseDto("Data fetched ",empDataList);
        return new ResponseEntity<ResponseDto>(resp, HttpStatus.OK);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<ResponseDto> getEmpById(@PathVariable int id)
	{
		EmployeeData employeeData= service.getEmpById(id);
        ResponseDto resp = new ResponseDto("Data fetched by id",employeeData);
        return new ResponseEntity<ResponseDto>(resp, HttpStatus.OK);
	}
	
	@DeleteMapping("/id/{id}")
	public ResponseEntity<ResponseDto> deleteById(@PathVariable int id)
	{

		service.deleteById(id);
        ResponseDto resp =new ResponseDto("Data Deleted Successfully of ID",id);
        return new ResponseEntity<ResponseDto>(resp,HttpStatus.OK);
	}
	
	@PutMapping("/id/{id}")
	public ResponseEntity<ResponseDto> updateEmpById(@PathVariable int id, @RequestBody EmpData data)
	{
		EmployeeData employeeData= service.updateById(id,data);
        ResponseDto resp = new ResponseDto("Data updated ",employeeData);
        return new ResponseEntity<ResponseDto>(resp, HttpStatus.OK);
	}
	

}
