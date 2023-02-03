package com.mz.todolist.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mz.todolist.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
