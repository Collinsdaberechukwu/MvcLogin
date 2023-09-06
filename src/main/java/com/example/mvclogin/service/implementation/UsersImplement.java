package com.example.mvclogin.service.implementation;

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
}
