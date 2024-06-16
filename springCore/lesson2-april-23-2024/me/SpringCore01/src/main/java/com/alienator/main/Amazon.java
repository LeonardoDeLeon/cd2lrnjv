package com.alienator.main;

import com.alienator.services.DeliveryService;

public class Amazon {
    private DeliveryService service;
    static {
        System.out.println("Amazon class loaded");
    }
    public Amazon(DeliveryService service) {
        this.service=service;
    }
    public Amazon() {
        System.out.println("Amazon bean is created");
    }
    public void setService(DeliveryService service) {
      this.service=service;
    }
    public Boolean deliverTheProduct(Double amount) {
      return service.deliverProduct(amount);
    }
}
