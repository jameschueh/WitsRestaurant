package com.example.restaurant.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.restaurant.entity.BillOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Delete;

@Mapper
public interface BillOrderMapper extends BaseMapper<BillOrder> {

    @Insert("INSERT INTO bill_order (bill_id, order_id) VALUES (#{billId}, #{orderId})")
    void insertBillOrder(@Param("billId") Long billId, @Param("orderId") Long orderId);

    @Delete("DELETE FROM bill_order WHERE bill_id = #{billId} AND order_id = #{orderId}")
    void deleteBillOrder(@Param("billId") Long billId, @Param("orderId") Long orderId);
}
