
package com.example.restapiclient.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createdAt",
    "state",
    "order_url"
})
public class Order {

    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("state")
    private String state;
    @JsonProperty("order_url")
    private String orderUrl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Order() {
    }

    /**
     * 
     * @param orderUrl
     * @param createdAt
     * @param state
     */
    public Order(String createdAt, String state, String orderUrl) {
        super();
        this.createdAt = createdAt;
        this.state = state;
        this.orderUrl = orderUrl;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("order_url")
    public String getOrderUrl() {
        return orderUrl;
    }

    @JsonProperty("order_url")
    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

}
