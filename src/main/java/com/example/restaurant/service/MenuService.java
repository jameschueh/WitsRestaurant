package com.example.restaurant.service;

import com.example.restaurant.entity.Item;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Service;
import com.example.restaurant.mapper.MenuMapper;

import java.util.List;
@Service
public class MenuService {
    
    private final MenuMapper menuMapper;

    public MenuService(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    public PageInfo<Item> getItems(int pageNumber, int pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<Item> items = menuMapper.getItems();
        return new PageInfo<>(items);
    }

    public List<Item> searchItems(String keyword) {
        return menuMapper.searchItems(keyword);
    }

    public Item addItem(Item item) {
        menuMapper.insertItem(item);
        return item;
    }

    public Item getItemById(Long itemId) {
        return menuMapper.getItemById(itemId);
    }

    public int updateItem(Item item) {
        return menuMapper.updateItem(item);
    }

    public int deleteItem(Long itemId) {
        return menuMapper.deleteItem(itemId);
    }
}

