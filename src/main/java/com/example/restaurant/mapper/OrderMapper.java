package com.example.restaurant.mapper;

import com.example.restaurant.entity.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {

    // 根據帳單ID查詢所有訂單
    @Select("SELECT * FROM orders WHERE bill_id = #{billId}")
    List<Order> getOrdersByBillId(@Param("billId") Long billId);
}
