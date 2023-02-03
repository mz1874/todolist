package com.mz.todolist.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mz.todolist.entity.Item;
import com.mz.todolist.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping(value = "item")
@RestController
public class ItemController {

    @Resource
    private ItemService service;

    /*用于在单击分类后展示*/

    /**
     * @param userId     当前登录的用户id
     * @param todoListId 分类的id
     * @param page       第几页
     * @return
     */
    @GetMapping(value = "findItemByUserIdAndTodolistId")
    public Page<Item> findItemByUserIdAndTodolistId(int userId, int todoListId, int page) {
        return service.findAllItemsByUserIdAndTodoListId(userId, todoListId, page);
    }
}
