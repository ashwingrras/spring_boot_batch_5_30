package com.example.spring_boot_batch_5_30.controller;

import com.example.spring_boot_batch_5_30.model.Product;
import com.example.spring_boot_batch_5_30.model.Student;
import com.example.spring_boot_batch_5_30.service.ProductService;
import com.example.spring_boot_batch_5_30.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController
{

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@Valid @RequestBody Student student)
    {
        System.out.println(" at createStudent controller");
        return studentService.createStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents()
    {
        System.out.println("inside testStudents");
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(101L,"vikash","java", "vikash@gmail.com");
        studentList.add(student1);
        return studentService.fetchStudentList();
    }
}
