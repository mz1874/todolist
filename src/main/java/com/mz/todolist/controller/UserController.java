package com.mz.todolist.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.mz.todolist.entity.UserEntity;
import com.mz.todolist.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.security.auth.login.AccountNotFoundException;
import java.util.List;

@RestController
@RequestMapping
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "findAll")
    public List<UserEntity> find()   {
        String loggedUserName = getLoggedUserName();
        System.out.printf("登录用户名");
        return userService.selectAllByPlus();
    }

    @PreAuthorize("hasPermission()")
    @GetMapping(value = "findUserById")
    public UserEntity findUserById(int id) throws Exception {
        return userService.findUserById(id);
    }

    @PostMapping(value = "updateUserDetails")
    public int updateUserDetails(@RequestBody UserEntity userEntity){
        return userService.updateUserDetails(userEntity);
    }



    private String getLoggedUserName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();

        if (principal instanceof org.springframework.security.core.userdetails.UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            return username;
        }
        return principal.toString();
    }

    @ResponseBody
    @PostMapping(value = "login")
    public String login()  {
        return "success";
    }


}
