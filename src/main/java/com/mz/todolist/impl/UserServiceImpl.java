package com.mz.todolist.impl;

import com.mz.todolist.entity.User;
import com.mz.todolist.mapper.UserMapper;
import com.mz.todolist.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {

        User user = userMapper.selectById(1);
        return Arrays.asList(user);
    }
}
