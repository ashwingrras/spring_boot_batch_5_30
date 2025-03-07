package com.example.spring_boot_batch_5_30.service;


import com.example.spring_boot_batch_5_30.dto.UserDTO;
import com.example.spring_boot_batch_5_30.dto.UserListDTO;
import com.example.spring_boot_batch_5_30.dto.UserRegisterDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);

    UserListDTO userRegister(UserRegisterDTO userRegisterDTO);

    List<UserListDTO> getAllUsersList();

}

