package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class order {
    
    private int orderid;
    private String customername;
    private int quantity;
    @Autowired
    private Product product;
    
   
    public order(Product product) {
        this.orderid = 2004;
        this.customername = "prasanth";
        this.quantity = 4;
        this.product = product;
    }
    
    public void display() {
        System.out.println("The following are the order details of the customer:");
        System.out.println("Order ID: " + orderid);
        System.out.println("Customer Name: " + customername);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product Details:");
        System.out.println("Product ID: " + product.getProduct_id());
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Category: " + product.getCategory());
    }
}