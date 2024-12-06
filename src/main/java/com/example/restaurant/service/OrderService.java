package com.example.restaurant.service;

import com.example.restaurant.entity.Bill;
import com.example.restaurant.entity.Order;
import com.example.restaurant.mapper.BillMapper;
import com.example.restaurant.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private BillMapper billMapper;

    @Autowired
    private OrderMapper orderMapper;

    // 獲取所有帳單
    public List<Bill> getBills() {
        List<Bill> bills = billMapper.getBills();
        // 這裡可以根據需要查詢每個帳單下的訂單
        for (Bill bill : bills) {
            List<Order> orders = orderMapper.getOrdersByBillId(bill.getBillId());
            bill.setOrders(orders);
        }
        return bills;
    }

    // 根據帳單ID查詢帳單詳情
    public Bill getBillById(Long billId) {
        Bill bill = billMapper.getBillById(billId);
        if (bill == null) {
            // 適當處理，如果找不到該帳單
            throw new RuntimeException("Bill not found for id: " + billId); // 或者返回 null，根據需求
        }
        List<Order> orders = orderMapper.getOrdersByBillId(billId);
        bill.setOrders(orders); // 設置訂單資料
        return bill;
    }
    

    // 新增帳單
    public Bill addBill(Bill bill) {
        billMapper.insertBill(bill);
        return bill;
    }

    // 更新帳單
    public int updateBill(Bill bill) {
        return billMapper.updateBill(bill);
    }

    // 刪除帳單
    public int deleteBill(Long billId) {
        return billMapper.deleteBill(billId);
    }
}
