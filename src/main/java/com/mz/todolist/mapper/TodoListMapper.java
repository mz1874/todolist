package com.mz.todolist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mz.todolist.entity.TodoListEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoListMapper extends BaseMapper<TodoListEntity> {

}
