package com.bridgelabz.emppayroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.emppayroll.model.EmployeeData;
@Repository
public interface EmployeePayrollRepo extends JpaRepository<EmployeeData, Integer> {

}
