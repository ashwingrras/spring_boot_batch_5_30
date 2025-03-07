package com.example.spring_boot_batch_5_30.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Declare the annotation as a validation constraint
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneNumberValidator.class)  // Specify the validator class
public @interface ValidPhoneNumber {

    // Custom error message
    String message() default "Invalid phone number format";

    // Define groups for validation categorization (optional)
    Class<?>[] groups() default {};

    // Define payload (optional, for carrying metadata)
    Class<? extends Payload>[] payload() default {};
}

