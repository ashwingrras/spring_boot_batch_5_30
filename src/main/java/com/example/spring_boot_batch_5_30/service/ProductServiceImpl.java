package com.example.spring_boot_batch_5_30.service;

import com.example.spring_boot_batch_5_30.model.Employee;
import com.example.spring_boot_batch_5_30.model.Product;
import com.example.spring_boot_batch_5_30.repository.EmployeeRepository;
import com.example.spring_boot_batch_5_30.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService
{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<?> createProduct(Product product) {
        Product createdProduct = null;
        try {
            System.out.println(" inside createProduct, name "+product.getName());
            createdProduct = productRepository.save(product);
            //System.out.println("  createProduct, name "+product.getName()+", id: "+product.getId());
        } catch (Exception e) {
            System.out.println(" Exception is " + e);
            Map<String, String> errors = new HashMap<>();
            errors.put("name", "invalid name");
            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createdProduct, HttpStatus.BAD_REQUEST);
        //return createdProduct;
    }
}
