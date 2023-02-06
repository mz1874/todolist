package com.mz.todolist.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mz.todolist.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@TableName(value = "user")
@Data
public class UserEntity extends BaseEntity {

    @TableField("username")
    private String userName;

    @TableField("password")
    private String passWord;

    @TableField("birthday")
    private Date brithDay;

    @TableField("address")
    private String address;

    @TableField("sex")
    private Boolean sex;


}
