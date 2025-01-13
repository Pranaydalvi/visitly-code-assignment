package com.pranay.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pranay.backend.model.User;
import com.pranay.backend.servise.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/allusers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping(value = "/adduser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}