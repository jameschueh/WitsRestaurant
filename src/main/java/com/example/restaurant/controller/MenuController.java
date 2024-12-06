package com.example.restaurant.controller;

import com.example.restaurant.entity.Item;
import com.example.restaurant.service.MenuService;
import com.example.restaurant.util.ApiResponse;
import com.github.pagehelper.PageInfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/items/{pageNumber}/{pageSize}")
    public ApiResponse<PageInfo<Item>> getItems(@PathVariable int pageNumber, @PathVariable int pageSize) {
        PageInfo<Item> items = menuService.getItems(pageNumber, pageSize);
        return ApiResponse.success(items);
    }

    @GetMapping("/search/{keyword}")
    public ApiResponse<List<Item>> searchItems(@PathVariable String keyword) {
        List<Item> items = menuService.searchItems(keyword);
        return ApiResponse.success(items);
    }

    @PostMapping("/item")
    public ApiResponse addItem(@RequestBody Item item) {
        return ApiResponse.success(menuService.addItem(item));
    }

    @GetMapping("/item/{itemId}")
    public ApiResponse getItemById(@PathVariable Long itemId) {
        return ApiResponse.success(menuService.getItemById(itemId));
    }

    @PutMapping("/item")
    public ApiResponse updateItem(@RequestBody Item item) {
        return ApiResponse.success(menuService.updateItem(item));
    }

    @DeleteMapping("/item/{itemId}")
    public ApiResponse deleteItem(@PathVariable Long itemId) {
        return ApiResponse.success(menuService.deleteItem(itemId));
    }
}
