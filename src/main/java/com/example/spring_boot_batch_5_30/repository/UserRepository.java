package com.example.spring_boot_batch_5_30.repository;


import com.example.spring_boot_batch_5_30.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


}

