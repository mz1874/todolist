package com.mz.todolist.service;

import com.mz.todolist.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> selectAllByPlus();

    UserEntity findUserById(int id) throws Exception;

    int updateUserDetails(UserEntity userEntity);

    UserEntity findUserByUserName(String userName);

}
