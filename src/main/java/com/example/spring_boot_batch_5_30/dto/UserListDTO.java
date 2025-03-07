package com.example.spring_boot_batch_5_30.dto;

import com.example.spring_boot_batch_5_30.model.User;

public class UserListDTO
{
    private Long id;
    private String name;
    private String email;

    public UserListDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }

    public UserListDTO(Long id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserListDTO()
    {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
