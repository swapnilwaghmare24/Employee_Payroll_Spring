package com.bridgelabz.emppayroll.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bridgelabz.emppayroll.model.EmployeeData;
@Repository
public interface EmployeePayrollRepo extends JpaRepository<EmployeeData, Integer> {
	@Query(value="select * from employee_data,employee_department where id = emp_id and department=:department", nativeQuery=true)
	List<EmployeeData> findEmployeesByDepartment(String department);

}
