package com.mz.todolist.vo;

import com.mz.todolist.entity.Item;

import java.util.List;

/*to do list vo 对象*/
public class TodoListVo {
    /*id*/
    private int id;

    /*name*/
    private String name;

    /*已经被完成了多少次*/
    private List<Item> items;

    /*记录当前记录被当前用户完成了多少次*/
    private int count;
}
