package com.jvbn.CRMWebAppThymeleaf.service;

import java.util.List;

import com.jvbn.CRMWebAppThymeleaf.model.Customer;

public interface ICustomerService 
{
    public List<Customer> getCustomersInfo();
    public Customer registerCustomer(Customer customer);
    public Customer fetchCxById(Integer id);
    public void deleteCxById(Integer id);
}
