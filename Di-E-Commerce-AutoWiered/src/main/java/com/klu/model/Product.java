package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    
    private int product_id;
    private String productName;
    private double price;
    private String category;
    
    public Product() {
        this.product_id = 101;
        this.productName = "laptop";
        this.price = 55000.00;
        this.category = "Electronic";
    }
    
    public int getProduct_id() {
        return product_id;
    }
    
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
}