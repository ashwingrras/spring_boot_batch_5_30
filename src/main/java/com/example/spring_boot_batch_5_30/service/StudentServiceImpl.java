package com.example.spring_boot_batch_5_30.service;

import com.example.spring_boot_batch_5_30.model.Student;
import com.example.spring_boot_batch_5_30.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> fetchStudentList() {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public String deleteStudentById(Long id) {
        return null;
    }

    @Override
    public Student createStudent(Student student) {

        Student student1 = null;
        try {
            System.out.println(" inside createStudent "+student.getName());
            student1 = studentRepository.save(student);
        } catch (Exception e) {
            System.out.println(" Exception is " + e);
        }
        return  student1;
    }

    @Override
    public Student updateStudent(Student employee, Long id) {
        return null;
    }
}
