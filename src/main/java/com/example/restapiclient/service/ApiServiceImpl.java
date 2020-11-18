package com.example.restapiclient.service;

import com.example.restapiclient.model.AJAXrequest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    final String API_ROOT = "http://localhost:9091";
    RestTemplate restTemplate = new RestTemplate();
    @Override
    public List<String> getProducts() {
        String path = API_ROOT + "api/search";
        AJAXrequest req = new AJAXrequest();
        JsonNode jsonNode = restTemplate.postForObject(path, req, JsonNode.class);
        System.out.println("received answer " + jsonNode.toString());
        JsonNode list_ = jsonNode.get("products");
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> result = new ArrayList<>();
        try {
            String[] l = objectMapper.readValue(list_.toString(), String[].class);
            result.addAll(Arrays.asList(l));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
