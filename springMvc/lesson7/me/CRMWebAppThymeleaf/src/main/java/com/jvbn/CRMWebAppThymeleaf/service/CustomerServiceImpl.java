package com.jvbn.CRMWebAppThymeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvbn.CRMWebAppThymeleaf.dao.ICustomerRepo;
import com.jvbn.CRMWebAppThymeleaf.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService 
{
    private ICustomerRepo repo;

    @Autowired
    public void setRepo(ICustomerRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Customer> getCustomersInfo() 
    {
        return (List<Customer>) repo.findAll();
    }

    @Override
    public Customer registerCustomer(Customer customer) 
    {
        Customer cust=repo.save(customer);
        return cust;
    }

    @Override
    public Customer fetchCxById(Integer id) 
    {

        Optional<Customer> optional=repo.findById(id);
        return optional.get();
    }

    @Override
    public void deleteCxById(Integer id) 
    {
        repo.deleteById(id);
    }

}
