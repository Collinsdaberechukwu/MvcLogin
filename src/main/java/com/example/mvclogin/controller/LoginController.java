package com.example.mvclogin.controller;

import com.example.mvclogin.dto.LoginDto;
import com.example.mvclogin.entity.Users;
import com.example.mvclogin.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/users")
public class LoginController {
    private final UserService userService;

    @GetMapping("/")
    public ModelAndView loginAccount(){
        return new ModelAndView("Index.html").addObject("loginAccount",new LoginDto());
    }
//
    @PostMapping("/login")

    public ModelAndView login(LoginDto loginDTO, HttpSession session) {


        log.info("USER - EMAIL-&#45;&#45;&ndash;&gt; {" + loginDTO.getEmail() + " " + loginDTO.getPassword() + "}");

        Users user = userService.findByEmail(loginDTO.getEmail());


        if (user == null) {

            log.error("User not found for email: " + loginDTO.getEmail());

            return new ModelAndView("index")
                    .addObject("login", loginDTO)
                    .addObject("errorMessage", "Invalid email or password");

        }
//        Post post = new Post();
//        session.setAttribute("users", user);
//        log.info("Creating post for user with email: " + user.getEmail());
//
//
//        return new ModelAndView("Profile")
//                .addObject("dashboard", "Welcome, user with email: " + loginDTO.getEmail())
//                .addObject("post", post);
        return new ModelAndView();

    }
}
