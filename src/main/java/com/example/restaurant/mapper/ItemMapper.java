package com.example.restaurant.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.restaurant.entity.Item;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemMapper extends BaseMapper<Item> {

    // 查詢所有菜單項目
    @Select("SELECT * FROM items")
    List<Item> selectAllItems();

    // 依名稱查詢菜單項目
    @Select("SELECT * FROM items WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Item> searchItemsByName(@Param("name") String name);
}
