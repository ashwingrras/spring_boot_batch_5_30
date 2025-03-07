package com.example.spring_boot_batch_5_30.controller;


import com.example.spring_boot_batch_5_30.model.Employee;
import com.example.spring_boot_batch_5_30.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/employee")
//@Cacheable
@Validated
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    //@Cacheable(value = "employees")
    public List<Employee> fetchEmployeeList()
    {
        System.out.println(" at fetchEmployeeList controller");
        return employeeService.fetchEmployeeList();
    }

    @PostMapping("/create")
    //@Cacheable(value = "employees", key = "#employee.id")
    //@Cacheable(value = "employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee)
    {
        System.out.println(" at createEmployee controller");
        return employeeService.createEmployee(employee);

    }

    @GetMapping("fetch/{id}")
    //@Cacheable(value = "employees", key= "#id")
    //@Cacheable(value = "employee", key = "#id" , unless = "#employee.age > 30")
    public Employee getEmployeeById(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);

    }

    @PutMapping("update/{id}")
    //@CachePut(cacheNames = "employees", key = "#employee.id")
    //@CachePut(cacheNames = "employees")
    /*
        @Caching(
             evict = {@CacheEvict(value = "employeeList", allEntries = true)},
             put = {@CachePut(value = "employee", key = "#id")}
        )
     */
    //@Caching( value = "employee", condition = "#employee.name == "ashwin""))
    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(employee, id);

    }

    @DeleteMapping("delete/{id}")
    //@CacheEvict(cacheNames = "employee", key = "#id", beforeInvocation = true)
    //@CacheEvict(value = "employees", allEntries = true)
    //@CacheEvict(value = "employees", key= "#id" )
    public String deleteEmployee(@PathVariable("id") Long id)
    {
        return employeeService.deleteEmpById(id);
    }
}

// http://localhost:8080/api/employee/employees

// http://localhost:8080/api/employee/create

//http://localhost:8080/api/employee/fetch/1

// http://localhost:8080/api/employee/update/1

// http://localhost:8080/api/employee/delete/1

