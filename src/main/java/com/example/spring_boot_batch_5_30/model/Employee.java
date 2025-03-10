package com.example.spring_boot_batch_5_30.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/*
Validation Annotations:
@NotBlank: Ensures that the string is not null or empty.
@Size: Enforces minimum and maximum length on a string.
@Email: Ensures the string follows the format of a valid email address.
@Min and @Max: Validates that a number is within a specified range (inclusive).
@Pattern: Ensures the string matches a specific regular expression (e.g., phone number).
@Positive: Ensures the number is strictly positive.
@AssertTrue/@AssertFalse: Ensures a boolean value is true or false, respectively.
@NotNull: Ensures that the field is not null.

+91 9799605400

 */

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private Long id;
    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 30, message = "Name must be between 2 and 30 characters")
    private String name;

    @NotBlank(message = "occupation not allow to be blank")
    private String occupation;
    private int age;

    // Getter && Setter
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}

