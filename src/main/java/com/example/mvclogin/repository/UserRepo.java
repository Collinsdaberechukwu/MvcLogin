package com.example.mvclogin.repository;

import com.example.mvclogin.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Long> {
    Users findByEmail(String email);

}
