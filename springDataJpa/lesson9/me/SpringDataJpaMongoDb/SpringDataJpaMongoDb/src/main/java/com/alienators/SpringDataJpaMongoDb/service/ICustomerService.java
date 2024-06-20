package com.alienators.SpringDataJpaMongoDb.service;

import java.util.List;

import com.alienators.SpringDataJpaMongoDb.dao.Customer;
import com.alienators.SpringDataJpaMongoDb.dto.CustomerDto;

public interface ICustomerService 
{
    public String registerCustomerInfo(CustomerDto dto);
    public List<Customer> fetchAllCx();
    public String deleteDocument(String id);

}
