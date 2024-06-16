package com.alienator.services;

public class DHL implements DeliveryService {
    static {
        System.out.println("DHL class loaded");
    }
    public DHL() {
        System.out.println("DHL bean is created");
    }
    public Boolean deliverProduct(Double amount) {
        System.out.println("Product delivered by DHL: "+amount);
        return true;
    }
}
