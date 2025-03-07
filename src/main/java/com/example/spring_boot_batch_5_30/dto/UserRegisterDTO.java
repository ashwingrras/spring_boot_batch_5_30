package com.example.spring_boot_batch_5_30.dto;

import com.example.spring_boot_batch_5_30.model.User;

public class UserRegisterDTO
{
    private String name;
    private String email;
    private String password;

    public UserRegisterDTO(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

    public UserRegisterDTO(String name, String email, String password)
    {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UserRegisterDTO()
    {

    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
