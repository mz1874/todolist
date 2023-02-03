package com.mz.todolist.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mz.todolist.entity.Item;
import com.mz.todolist.mapper.ItemMapper;
import com.mz.todolist.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper mapper;

    @Override
    public Page<Item> findAllItemsByUserIdAndTodoListId(int userId, int todoListId, int number) {
        QueryWrapper<Item> queryWrapper = new QueryWrapper();
        queryWrapper.eq("create_id", userId).eq("todolist_id", todoListId).orderByDesc("create_time");
        Page<Item> page = new Page<>(number, 20);
        Page<Item> result = mapper.selectPage(page, queryWrapper);
        return  result;
    }
}
