package com.example.restaurant.mapper;

import com.example.restaurant.entity.Bill;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BillMapper {

    @Select("SELECT * FROM bills")
    List<Bill> getBills();

    @Select("SELECT * FROM bills WHERE bill_id = #{billId}")
    Bill getBillById(@Param("billId") Long billId);
    
    @Insert("INSERT INTO bills (bill_id) VALUES (#{billId})")
    void insertBill(Bill bill);

    @Update("UPDATE bills SET bill_id = #{billId} WHERE bill_id = #{billId}")
    int updateBill(Bill bill);

    @Delete("DELETE FROM bills WHERE bill_id = #{billId}")
    int deleteBill(Long billId);
}
