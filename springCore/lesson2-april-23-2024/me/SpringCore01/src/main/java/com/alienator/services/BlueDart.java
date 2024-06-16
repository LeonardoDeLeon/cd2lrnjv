package com.alienator.services;

public class BlueDart implements DeliveryService {
    static {
        System.out.println("BlueDart class loaded");
    }
    public BlueDart() {
        System.out.println("BlueDart bean is created");
    }
    public Boolean deliverProduct(Double amount) {
        System.out.println("Product delivered by BlueDart: "+amount);
        return true;
    }
}
