package com.mz.todolist.service;

import com.mz.todolist.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> selectAll();
}
