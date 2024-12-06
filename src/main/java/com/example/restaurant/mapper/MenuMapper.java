package com.example.restaurant.mapper;

import com.example.restaurant.entity.Item;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MenuMapper {

    @Select("SELECT * FROM items")
    List<Item> getItems();

    @Select("SELECT * FROM items WHERE name LIKE CONCAT('%', #{keyword}, '%') " +
            "OR description LIKE CONCAT('%', #{keyword}, '%')")
    List<Item> searchItems(@Param("keyword") String keyword);

    @Insert("INSERT INTO items (name, description, image, price) VALUES (#{name}, #{description}, #{image}, #{price})")
    @Options(useGeneratedKeys = true, keyProperty = "itemId")
    void insertItem(Item item);

    @Select("SELECT * FROM items WHERE item_id = #{itemId}")
    Item getItemById(@Param("itemId") Long itemId);

    @Update("UPDATE items SET name = #{name}, description = #{description}, image = #{image}, price = #{price} WHERE item_id = #{itemId}")
    int updateItem(Item item);

    @Delete("DELETE FROM items WHERE item_id = #{itemId}")
    int deleteItem(@Param("itemId") Long itemId);
}
