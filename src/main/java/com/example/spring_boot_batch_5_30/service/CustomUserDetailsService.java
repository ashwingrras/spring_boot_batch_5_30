package com.example.spring_boot_batch_5_30.service;

import com.example.spring_boot_batch_5_30.model.UserSecure;
import com.example.spring_boot_batch_5_30.repository.UserSecureRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserSecureRepository userRepository;

    public CustomUserDetailsService(UserSecureRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("inside loadUserByUsername "+username);
        UserSecure user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
        return user;
    }
}
