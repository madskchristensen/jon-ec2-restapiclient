package com.example.restapiclient.model;

public class Category {

    private String name;
    private String category_url;

    public Category(String name, String category_url) {
        this.name = name;
        this.category_url = category_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory_url() {
        return category_url;
    }

    public void setCategory_url(String category_url) {
        this.category_url = category_url;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", category_url='" + category_url + '\'' +
                '}';
    }
}
