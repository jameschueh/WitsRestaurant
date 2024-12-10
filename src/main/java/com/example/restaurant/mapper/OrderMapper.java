package com.example.restaurant.mapper;

import com.example.restaurant.entity.Order;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    List<Order> getOrdersByBillId(Long billId);

    void insertOrder(Order order);

    @Delete("DELETE FROM orders WHERE order_id = #{orderId}")
    void deleteOrder(Long orderId);
}

