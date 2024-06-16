package com.alienator.services;

public class FedEx implements DeliveryService {
    static {
        System.out.println("FedEx class loaded");
    }
    public FedEx() {
        System.out.println("FedEx bean is created");
    }
    public Boolean deliverProduct(Double amount) {
        System.out.println("Product delivered by FedEx: "+amount);
        return true;
    }
}
