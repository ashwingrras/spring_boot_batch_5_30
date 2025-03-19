package com.example.spring_boot_batch_5_30.model;

import com.example.spring_boot_batch_5_30.validator.ValidEmail;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import static com.example.spring_boot_batch_5_30.constant.Constants.emailFailedMsg;

@Entity
@Table(name = "student")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull(message = "Name cannot be null")
    @NotEmpty(message = "Name is required")
    String name;
    String course;
    @NotNull(message = "Email is required")
    @Email(message = emailFailedMsg)
    String email;

    public Student(Long id, String name, String course, String email)
    {
        this.id = id;
        this.name= name;
        this.course = course;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
