package com.mz.todolist.controller;

import com.mz.todolist.entity.User;
import com.mz.todolist.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "findAll")
    public List<User> findAll(){
        return userService.selectAll();
    }
}
