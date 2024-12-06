package com.example.restaurant.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
@TableName("bill_order")  // 對應資料表名稱
public class BillOrder {

    @TableId(value = "BILL_ID")  // 主鍵欄位，標註 billId
    private Long billId;

    @TableField(value = "ORDER_ID")  // 這裡不再標註 @TableId，使用 @TableField
    private Long orderId;

    // 非主鍵欄位，關聯的實體
    private Bill bill;
    private Order order;
}
