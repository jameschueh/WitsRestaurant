package com.example.restaurant.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
@TableName("bill_order")
public class BillOrder {

    @TableId(value = "BILL_ID")  
    private Long billId;

    @TableField(value = "ORDER_ID") 
    private Long orderId;

    private Bill bill;
    private Order order;
}
