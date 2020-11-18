package com.example.restapiclient.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    private ApiService apiService;

    @Test
    public void getCategories() {
//        List<Category> list = apiService.getCategories();
//        assertEquals(5, list.size());
    }

    @Test
    public void getOrders(){
//        List<Order> orders = apiService.getOrders();
//        assertNotNull(orders);
    }

}
