package com.mz.todolist.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mz.todolist.entity.UserEntity;
import com.mz.todolist.mapper.UserMapper;
import com.mz.todolist.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserEntity> selectAllByPlus() {
        log.info("查询");
        return userMapper.selectList(null);
    }

    @Override
    public UserEntity findUserById(int id) throws Exception {
        UserEntity userEntity = userMapper.selectById(id);
        log.info("查询的id是" + id);
        if (BeanUtil.isEmpty(userEntity)) {
            throw new Exception("未查询到当前用户");
        }
        return userEntity;
    }

    @Override
    public int updateUserDetails(UserEntity userEntity) {
        return userMapper.updateById(userEntity);
    }


    @Override
    public UserEntity findUserByUserName(String userName) {
        log.info("login userName is %s", userName);
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", userName);
        UserEntity userEntity = userMapper.selectOne(queryWrapper);
        return userEntity;
    }
}
