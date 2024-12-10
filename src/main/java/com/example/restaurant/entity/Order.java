package com.example.restaurant.entity;

import lombok.Data;

@Data
public class Order {
    private Long orderId;
    private Long itemId;
    private Integer quantity;
    private String orderTime;
}
