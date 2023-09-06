package com.example.mvclogin.repository;

import com.example.mvclogin.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<Users,Long> {
//    @Override
//    Optional<Users> findById(Long id);
}
