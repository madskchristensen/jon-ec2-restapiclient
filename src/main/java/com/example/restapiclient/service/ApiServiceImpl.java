package com.example.restapiclient.service;

import com.example.restapiclient.model.Category;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    final String API_ROOT = "https://api.predic8.de:443/shop/";

    @Override
    public List<Category> getCategories() {
        String path = API_ROOT + "categories/";
        RestTemplate restTemplate = new RestTemplate();
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
}
