package com.alienator.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alienator.services.FedEx;

public class LaunchApp {
    public static void main(String[] args){

        ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");

        Amazon amz=container.getBean(Amazon.class);

        Boolean status=amz.deliverTheProduct(444.45);

        if (status) 
            System.out.println("Delivered!");
        else
            System.out.println("Failed to deliver!");
        // System.out.println("Launch App launched!!!");
        // System.out.println("LaunchApp1 started");
        // System.out.println("Welcome to loosely coupled Application");
        // Amazon amz=new Amazon();
        // amz.setService(new FedEx());
        // Boolean status=amz.deliverTheProduct(4554.4);
        // if (status) {
        //   System.out.println("Product delivered Successfully");
        // } else {
        //   System.out.println("Failed to deliver product");
        // }    
    }
}
