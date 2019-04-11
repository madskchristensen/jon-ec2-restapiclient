package com.example.restapiclient.service;

import com.example.restapiclient.model.Category;
import com.example.restapiclient.model.Order;
import com.example.restapiclient.model.Orders;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    final String API_ROOT = "https://api.predic8.de:443/shop/";
    RestTemplate restTemplate = new RestTemplate();
    @Override
    public List<Category> getCategories() {
        String path = API_ROOT + "categories/";

        JsonNode jsonNode = restTemplate.getForObject(path, JsonNode.class);
        JsonNode categories = jsonNode.get("categories");
        List<Category> list = new ArrayList<>();
        categories.iterator().forEachRemaining(cat -> {
            if (cat.get("name") != null){
                list.add(new Category(cat.get("name").asText(),cat.get("category_url").asText()));
            }
        });
        return list;
    }

    public List<Order> getOrders(){
        val path = API_ROOT + "orders/";
        Orders orders = restTemplate.getForObject(path, Orders.class);
        System.out.println(orders.getOrders());
        for (Order order:orders.getOrders()) {
            System.out.println("Order:" + order.getCreatedAt());
        }
        return null;
    }
}
