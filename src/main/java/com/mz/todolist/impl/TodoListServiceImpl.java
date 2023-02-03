package com.mz.todolist.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mz.todolist.entity.TodoListEntity;
import com.mz.todolist.mapper.TodoListMapper;
import com.mz.todolist.service.TodoListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TodoListServiceImpl implements TodoListService {


    @Resource
    private TodoListMapper mapper;

    @Override
    public List<TodoListEntity> findAllTodoListByUserId() {
        QueryWrapper<TodoListEntity> objectQueryWrapper = new QueryWrapper<>();
        /*模拟数据*/
        objectQueryWrapper.eq("create_id", 1);
        return mapper.selectList(objectQueryWrapper);
    }

}
