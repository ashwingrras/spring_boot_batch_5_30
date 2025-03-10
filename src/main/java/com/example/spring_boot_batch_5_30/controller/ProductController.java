package com.example.spring_boot_batch_5_30.controller;

import com.example.spring_boot_batch_5_30.model.Employee;
import com.example.spring_boot_batch_5_30.model.Product;
import com.example.spring_boot_batch_5_30.service.EmployeeService;
import com.example.spring_boot_batch_5_30.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")

public class ProductController
{
    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<?> createEmployee(@Valid @RequestBody Product product)
    {
        System.out.println(" at createEmployee controller");
        return productService.createProduct(product);
    }

}
