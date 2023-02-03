package com.mz.todolist.service;

import com.mz.todolist.entity.TodoListEntity;

import java.util.List;

public interface TodoListService {


    /**
     * 查找所有的Todo List 生成词云
     * @param id user ID
     * @return
     */
    List<TodoListEntity> findAllTodoListByUserId();
}
