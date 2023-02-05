package com.mz.todolist.entity.base;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

public class BaseEntity {

    @TableId(value = "id")
    public int id ;

    @TableField("create_time")
    public Date createTime;

    @TableField("create_id")
    public int createId;
}
