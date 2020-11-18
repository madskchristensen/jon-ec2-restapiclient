package com.example.restapiclient;

import com.example.restapiclient.service.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    List<String> products = new ArrayList<>();
    private ApiService apiService;

    public HomeController(ApiService apiService){
        this.apiService = apiService;
    }
    @GetMapping("/")
    public String home(Model model){
        products.clear();
        apiService.getProducts().forEach(s -> {
            products.add(s);
        });
        model.addAttribute("products", products);
        return "index";
    }
}
