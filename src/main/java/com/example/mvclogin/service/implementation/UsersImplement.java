package com.example.mvclogin.service.implementation;

import com.example.mvclogin.dto.LoginDto;
import com.example.mvclogin.entity.Users;
import com.example.mvclogin.repository.UserRepo;
import com.example.mvclogin.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UsersImplement implements UserService {

    private final UserRepo userRepo;

    public UsersImplement(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Users loginAccount(Users users) {
      return userRepo.save(loginAccount(users));
    }

    @Override
    public Users add(LoginDto loginDto) {
      return userRepo.save(add(loginDto));
    }

    @Override
    public Users findByEmail(String email) {
       return userRepo.findByEmail(email);
    }
}
