package com.example.spring_boot_batch_5_30.validator;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, String> {

    // This method will contain the logic to validate the phone number
    @Override
    public void initialize(ValidPhoneNumber constraintAnnotation) {
        // Initialization logic if needed (not required in this case)
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // If value is null or empty, return true (or handle as needed)
        if (value == null || value.isEmpty()) {
            return false; // Optional: return false if empty strings should be invalid
        }

        // Custom validation logic for phone number (e.g., checking a regex)
        // In this case, we are allowing a phone number format like "+1234567890"
        String regex = "^\\+?\\d{10,15}$";  // Valid phone numbers should be between 10 and 15 digits and optionally start with a '+'
        return value.matches(regex);
    }
}

