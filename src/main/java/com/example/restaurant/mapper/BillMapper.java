package com.example.restaurant.mapper;

import com.example.restaurant.entity.Bill;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BillMapper {

    // 查詢所有帳單
    @Select("SELECT * FROM bills")
    List<Bill> getBills();

    // 根據帳單ID查詢帳單資料
    @Select("SELECT * FROM bills WHERE bill_id = #{billId}")
    Bill getBillById(@Param("billId") Long billId);
    
    // 新增帳單
    @Insert("INSERT INTO bills (bill_id) VALUES (#{billId})")
    void insertBill(Bill bill);

    // 更新帳單
    @Update("UPDATE bills SET bill_id = #{billId} WHERE bill_id = #{billId}")
    int updateBill(Bill bill);

    // 刪除帳單
    @Delete("DELETE FROM bills WHERE bill_id = #{billId}")
    int deleteBill(Long billId);
}
