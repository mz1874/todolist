package com.mz.todolist.entity.base;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

public class BaseEntity {

    @TableId(value = "id")
    private int id ;

    @TableField("create_time")
    private Date createTime;

    @TableField("create_id")
    private int createId;
}
