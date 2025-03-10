package com.example.spring_boot_batch_5_30.service;

import com.example.spring_boot_batch_5_30.model.Employee;
import com.example.spring_boot_batch_5_30.model.Product;
import org.springframework.http.ResponseEntity;

public interface ProductService
{
     ResponseEntity<?> createProduct(Product product);
}
