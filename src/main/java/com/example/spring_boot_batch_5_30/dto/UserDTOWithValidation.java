package com.example.spring_boot_batch_5_30.dto;


import com.example.spring_boot_batch_5_30.validator.ValidPhoneNumber;
import jakarta.validation.constraints.*;

public class UserDTOWithValidation {

    // NotBlank: Ensures that the name is not empty or null
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name should be between 2 and 50 characters")
    private String name;

    // Email: Ensures that the email is in a valid email format
    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
    private String email;

    // Min/Max: Ensures that the age is between 18 and 100
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 100, message = "Age must be less than or equal to 100")
    private int age;

    // Pattern: Ensures the phone number matches a regex pattern (e.g., phone number format)
    //@Pattern(regexp = "^\\+?\\d{10,15}$", message = "Phone number must be between 10 and 15 digits")
    @ValidPhoneNumber(message = "Invalid phone number format")  // Apply custom validator
    private String phoneNumber;

    // Positive/Negative: Ensures that the balance is positive
    @Positive(message = "Balance must be a positive number")
    private double balance;

    // AssertTrue/AssertFalse: Ensures the account is active
    @AssertTrue(message = "Account must be active")
    private boolean isActive;

    // NotNull: Ensures that a field is not null
    @NotNull(message = "Country cannot be null")
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
