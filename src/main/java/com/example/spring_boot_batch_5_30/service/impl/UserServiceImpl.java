package com.example.spring_boot_batch_5_30.service.impl;

import com.example.spring_boot_batch_5_30.dto.UserDTO;
import com.example.spring_boot_batch_5_30.dto.UserListDTO;
import com.example.spring_boot_batch_5_30.dto.UserRegisterDTO;
import com.example.spring_boot_batch_5_30.exception.ResourceNotFoundException;
import com.example.spring_boot_batch_5_30.model.User;
import com.example.spring_boot_batch_5_30.repository.UserRepository;
import com.example.spring_boot_batch_5_30.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user = userRepository.save(user);
        return new UserDTO(user);
    }

    @Override
    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
        return new UserDTO(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO updateUser(Long id, UserDTO userDTO) {
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword()); // Normally you would hash passwords
        user = userRepository.save(user);
        return new UserDTO(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
        userRepository.delete(user);
    }

    @Override
    public UserListDTO userRegister(UserRegisterDTO userRegisterDTO) {

        User user = new User();
        user.setName(userRegisterDTO.getName());
        user.setEmail(userRegisterDTO.getEmail());
        user.setPassword(userRegisterDTO.getPassword());
        user = userRepository.save(user);
        return new UserListDTO(user);
    }

    @Override
    public List<UserListDTO> getAllUsersList() {
        return null;
    }


}

