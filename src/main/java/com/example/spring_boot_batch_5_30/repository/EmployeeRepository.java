package com.example.spring_boot_batch_5_30.repository;

import com.example.spring_boot_batch_5_30.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
