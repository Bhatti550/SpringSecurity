package com.project.springsecurity.controller;

import com.project.springsecurity.model.UserModel;
import com.project.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create-user")
    public UserModel save(@RequestBody UserModel userModel) {
        return userService.createUser(userModel);
    }
    @GetMapping("/get-all-users")
    public List<UserModel> getUser(){
        return userService.getUsers();
    }
}
