package com.example.restaurant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Detail {
    @TableId(value = "DETAIL_ID", type = IdType.AUTO)
    private Long detailId;
    private String title;
}
