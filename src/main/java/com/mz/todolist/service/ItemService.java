package com.mz.todolist.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mz.todolist.entity.Item;

import java.util.List;

public interface ItemService {

    Page<Item> findAllItemsByUserIdAndTodoListId(int userId, int todoListId, int page, int pageSize);
}
