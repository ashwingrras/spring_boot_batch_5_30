package com.example.spring_boot_batch_5_30.controller;

import com.example.spring_boot_batch_5_30.dto.UserDTO;
import com.example.spring_boot_batch_5_30.dto.UserRegisterDTO;
import com.example.spring_boot_batch_5_30.model.Employee;
import com.example.spring_boot_batch_5_30.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@Valid @RequestBody UserDTO userDTO, BindingResult result) {
        //return new ResponseEntity<>(userService.createUser(userDTO), HttpStatus.CREATED);
        // Check if there are validation errors
        if (result.hasErrors()) {
            System.out.println("inside hasErrors "+result.getAllErrors());
            // Return validation errors as a bad request response
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }

        // Proceed to create user if validation passes
        return new ResponseEntity<>(userService.createUser(userDTO), HttpStatus.CREATED);
    }

    @PostMapping("/create")
    //@Cacheable(value = "employees", key = "#employee.id")
    //@Cacheable(value = "employees")
    public UserDTO createUser(@Valid @RequestBody UserDTO userDTO)
    {
        System.out.println(" at createUser controller");
        return userService.createUser(userDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.updateUser(id, userDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserRegisterDTO userRegisterDTO) {

        return new ResponseEntity<>(userService.userRegister(userRegisterDTO), HttpStatus.CREATED);
    }

}

