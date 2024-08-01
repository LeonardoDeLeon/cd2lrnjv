package com.alienators.CRMSpringMVC.dao;

import org.springframework.data.repository.CrudRepository;

import com.alienators.CRMSpringMVC.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer,Integer>
{

}
