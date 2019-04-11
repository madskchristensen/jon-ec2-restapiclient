package com.example.restapiclient.model;

import lombok.Data;

@Data
public class Orders {
    private Meta meta;
    private Order[] orders;
}
