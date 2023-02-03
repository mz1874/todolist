package com.mz.todolist.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.mz.todolist.entity.base.BaseEntity;
import lombok.Data;

@TableName(value = "todolist")
@Data
public class TodoListEntity extends BaseEntity {

    private String name;



}
