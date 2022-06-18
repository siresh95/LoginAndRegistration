package com.example.springbootloginandregistration.service;

import com.example.springbootloginandregistration.model.User;
import com.example.springbootloginandregistration.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;




public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}