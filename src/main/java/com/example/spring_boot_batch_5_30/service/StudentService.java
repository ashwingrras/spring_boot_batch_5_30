package com.example.spring_boot_batch_5_30.service;

import com.example.spring_boot_batch_5_30.model.Employee;
import com.example.spring_boot_batch_5_30.model.Student;

import java.util.List;

public interface StudentService
{
    List<Student> fetchStudentList();

    Student getStudentById(Long id);


    public String deleteStudentById(Long id);

    public Student createStudent(Student student);

    public Student updateStudent(Student employee, Long id);
}
