/*
package com.example.spring_boot_batch_5_30.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect {
    @After(value = "execution(* com.example.spring_boot_batch_5_30.service.UserService.*(..)) and args(id, name, email, password)")
    public void afterAdvice(JoinPoint joinPoint, Long id, String name, String email, String password) {
        System.out.println("afterAdvice UserServiceAspect");
    }
}
*/
