package com.mz.todolist.impl;

import cn.hutool.Hutool;
import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.mz.todolist.entity.User;
import com.mz.todolist.mapper.UserMapper;
import com.mz.todolist.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.module.FindException;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAllByPlus() {
        log.info("查询");
        return userMapper.selectList(null);
    }

    @Override
    public User findUserById(int id) {
        User user = userMapper.selectById(id);
        log.info("查询的id是" + id);
        if (BeanUtil.isEmpty(user)) {
            throw new  FindException("未查询到当前用户");
        }
        return user;
    }

    @Override
    public int updateUserDetails(User user) {
        return userMapper.updateById(user);
    }
}
