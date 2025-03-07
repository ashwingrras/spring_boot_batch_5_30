package com.example.spring_boot_batch_5_30.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class EmployeeServiceAspect
{
    @After(value = "execution(* com.example.spring_boot_batch_5_30.service.EmployeeService.*(..)) and args(id, name, occupation, age)")
    public void afterAdvice(JoinPoint joinPoint, Long id, String name, String occupation, int age) {
        //System.out.println("After method:" + joinPoint.getSignature());
        //System.out.println("Creating Employee with name - " + name + ", occupation - " + occupation + " and age - " + age);
    }
}