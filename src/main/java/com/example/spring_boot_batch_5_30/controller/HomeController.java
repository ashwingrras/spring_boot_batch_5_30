package com.example.spring_boot_batch_5_30.controller;

import com.example.spring_boot_batch_5_30.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController
{
    @GetMapping("/home")
    public String testHome()
    {
        System.out.println("inside testHome");
        return "this is home api";
    }

    @GetMapping("/dashboard")
    public String testDashboard()
    {
        System.out.println("inside testDashboard");
        return "this is dashboard api";
    }
    
    @GetMapping("/students")
    public List<Student> testStudents()
    {
        System.out.println("inside testStudents");
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(101L,"vikash","java", "vikash@gmail.com");
        studentList.add(student1);
        return studentList;
    }

}
