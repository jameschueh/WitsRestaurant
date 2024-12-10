package com.example.restaurant.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.restaurant.entity.Item;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemMapper extends BaseMapper<Item> {

    @Select("SELECT * FROM items")
    List<Item> selectAllItems();

    @Select("SELECT * FROM items WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Item> searchItemsByName(@Param("name") String name);
}
