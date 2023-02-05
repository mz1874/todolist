package com.mz.todolist.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Override
    public Page<TodoListEntity> page(int userId, int page, int pageSize) {
        QueryWrapper<TodoListEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("create_id",userId);
        Page<TodoListEntity> pages = new Page<>(page, pageSize);
        Page<TodoListEntity> todoListEntityPage = mapper.selectPage(pages, queryWrapper);
        return  todoListEntityPage;
    }

}
