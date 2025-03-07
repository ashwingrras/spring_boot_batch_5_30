package com.example.spring_boot_batch_5_30.service;



import com.example.spring_boot_batch_5_30.model.Employee;

import java.util.List;

//@CacheConfig(cacheNames={"employees"})
public interface EmployeeService {

    List<Employee> fetchEmployeeList();

    Employee getEmployeeById(Long id);


    public String deleteEmpById(Long id);

    public Employee createEmployee(Employee employee);

    public Employee updateEmployee(Employee employee, Long id);
}
