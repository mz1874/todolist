package com.mz.todolist.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mz.todolist.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> selectAll();
}
