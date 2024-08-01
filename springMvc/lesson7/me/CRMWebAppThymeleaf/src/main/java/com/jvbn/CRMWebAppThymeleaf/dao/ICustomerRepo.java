package com.jvbn.CRMWebAppThymeleaf.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvbn.CRMWebAppThymeleaf.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer,Integer>
{

}
