package com.alienators.SpringDataJpa2.service;

import com.alienators.SpringDataJpa2.dao.CustomerInfo;

public interface ICustomerService 
{
    public String registerCustomer(CustomerInfo cx);
    public Iterable<CustomerInfo> fetchAllCxInfo();
}
