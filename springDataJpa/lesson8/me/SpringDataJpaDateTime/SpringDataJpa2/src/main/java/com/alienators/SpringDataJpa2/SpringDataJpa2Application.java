package com.alienators.SpringDataJpa2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alienators.SpringDataJpa2.dao.CustomerInfo;
import com.alienators.SpringDataJpa2.service.CustomerServiceImpl;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpa2Application.class, args);

		CustomerServiceImpl customerService=container.getBean(CustomerServiceImpl.class);
		
		// CustomerInfo cx = new CustomerInfo("Rohan","Bengaluru",LocalDateTime.of(1994,03,8,11,44),LocalTime.of(20,44),LocalDate.now());
		// CustomerInfo cx = new CustomerInfo("Mitch","St Paul",LocalDateTime.of(1994,04,9,11,44),LocalTime.of(20,44),LocalDate.now());
		// CustomerInfo cx = new CustomerInfo("Rohit","St Paul",LocalDateTime.of(1996,10,9,9,25),LocalTime.now(),LocalDate.of(2016, 4, 8));
		// String msg=customerService.registerCustomer(cx);
		// System.out.println(msg);

		customerService.fetchAllCxInfo().forEach(c->System.out.println(c));
	}

}
