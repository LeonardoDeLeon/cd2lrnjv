package com.alienators.SpringDataJpa2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alienators.SpringDataJpa2.dao.CustomerInfo;
import com.alienators.SpringDataJpa2.dao.ICustomerRepo;

@Service
public class CustomerServiceImpl implements ICustomerService
{
    @Autowired
    private ICustomerRepo repo;

    public String registerCustomer(CustomerInfo cx)
    {
        Integer id=repo.save(cx).getCid();
        return"Customer Info registered Successfully, with id = "+id;
    }

    public Iterable<CustomerInfo> fetchAllCxInfo()
    {
        return repo.findAll();
    }


}
