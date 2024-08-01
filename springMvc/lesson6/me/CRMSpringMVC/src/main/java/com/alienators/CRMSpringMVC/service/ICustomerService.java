package com.alienators.CRMSpringMVC.service;

import java.util.List;

import com.alienators.CRMSpringMVC.model.Customer;

public interface ICustomerService 
{
    public List<Customer> getCustomersInfo();
    public Customer registerCustomer(Customer customer);
    public Customer fetchCxById(Integer id);
    public void deleteCxById(Integer id);
}
