package com.example.restaurant.controller;

import com.example.restaurant.entity.Bill;
import com.example.restaurant.service.OrderService;
import com.example.restaurant.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // 獲取所有帳單
    @GetMapping("/bills")
    public ApiResponse getBills() {
        return ApiResponse.success(orderService.getBills());
    }

    // 根據帳單ID獲取帳單詳情
    @GetMapping("/bill/{billId}")
    public ApiResponse getBillById(@PathVariable Long billId) {
        Bill bill = orderService.getBillById(billId);
        if (bill == null) {
            return ApiResponse.error("Bill not found");
        }
        return ApiResponse.success(bill);
    }

    // 新增帳單
    @PostMapping("/bill")
    public ApiResponse addBill(@RequestBody Bill bill) {
        return ApiResponse.success(orderService.addBill(bill));
    }

    // 更新帳單
    @PutMapping("/bill")
    public ApiResponse updateBill(@RequestBody Bill bill) {
        return ApiResponse.success(orderService.updateBill(bill));
    }

    // 刪除帳單
    @DeleteMapping("/bill/{billId}")
    public ApiResponse deleteBill(@PathVariable Long billId) {
        return ApiResponse.success(orderService.deleteBill(billId));
    }
}
