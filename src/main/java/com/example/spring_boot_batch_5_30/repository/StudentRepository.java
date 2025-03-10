package com.example.spring_boot_batch_5_30.repository;

import com.example.spring_boot_batch_5_30.model.Employee;
import com.example.spring_boot_batch_5_30.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
