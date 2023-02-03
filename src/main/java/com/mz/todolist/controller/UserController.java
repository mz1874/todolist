package com.mz.todolist.controller;

import com.mz.todolist.entity.User;
import com.mz.todolist.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "findAll")
    public List<User> find(){
        return userService.selectAllByPlus();
    }

    @GetMapping(value = "findUserById")
    public User findUserById(int id){
        return userService.findUserById(id);
    }

    @PostMapping(value = "updateUserDetails")
    public int updateUserDetails(@RequestBody User user){
        return userService.updateUserDetails(user);
    }



}
