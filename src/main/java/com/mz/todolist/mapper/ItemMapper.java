package com.mz.todolist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mz.todolist.entity.Item;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper extends BaseMapper<Item> {
}
