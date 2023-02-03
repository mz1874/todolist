package com.mz.todolist.controller;

import com.mz.todolist.entity.TodoListEntity;
import com.mz.todolist.service.TodoListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping(value = "todoList")
@RestController
public class TodoListController {

    @Resource
    private TodoListService service;


    @GetMapping(value = "selectAll")
    public List<TodoListEntity> selectAllTodoList() {
        /*不应该让用户进行传递，直接根据当前登录用户进行查询*/
        return service.findAllTodoListByUserId();
    }
}
