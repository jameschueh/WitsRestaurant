package com.example.restaurant.entity;

import lombok.Data;

@Data
public class Order {
    private Long orderId;
    private Long itemId; // 這個是 `Item` 的外鍵
    private Integer quantity;
    private String orderTime;  // 訂單時間
}
