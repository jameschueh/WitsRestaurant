package com.example.restaurant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class Bill {
    @TableId(value = "BILL_ID", type = IdType.AUTO)
    private Long billId;

    private List<Order> orders;  // 儲存訂單列表
}
