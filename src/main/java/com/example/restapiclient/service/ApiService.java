package com.example.restapiclient.service;

import com.example.restapiclient.model.Category;
import com.example.restapiclient.model.Order;

import java.util.List;

public interface ApiService {

    List<Category> getCategories();
    List<Order> getOrders();
}
