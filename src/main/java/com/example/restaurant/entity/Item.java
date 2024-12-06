package com.example.restaurant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Item {
    @TableId(value = "ITEM_ID", type = IdType.AUTO)
    private Long itemId;
    private String name;
    private String description;
    private String image;
    private Integer price;
}
