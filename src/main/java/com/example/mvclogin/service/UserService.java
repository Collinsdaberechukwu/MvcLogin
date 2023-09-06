package com.example.mvclogin.service;

import com.example.mvclogin.dto.LoginDto;
import com.example.mvclogin.entity.Users;

public interface UserService {
    Users  loginAccount(Users users);
    Users add(LoginDto loginDto);

    Users findByEmail(String email);
}
