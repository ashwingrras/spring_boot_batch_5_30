package com.example.spring_boot_batch_5_30.repository;

import com.example.spring_boot_batch_5_30.model.UserSecure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserSecureRepository extends JpaRepository<UserSecure, Long> {
    Optional<UserSecure> findByUsername(String username);
}
