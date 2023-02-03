package com.mz.todolist.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mz.todolist.entity.base.BaseEntity;
import lombok.Data;

import java.sql.Date;

@Data
public class Item extends BaseEntity{

    /*start time*/
    @TableField("start_time")
    private Date startTime;

    /*end time*/
    @TableField("end_time")
    private Date endTime;

    /*extra information*/
    @TableField("information")
    private String information;

    /*关联todoList Id*/
    @TableField(value = "todolist_id")
    private int todoListId;



}
