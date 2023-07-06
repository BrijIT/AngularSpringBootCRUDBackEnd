package com.springboot.employeecrud.employeecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employeecrud.employeecrud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
