package com.alienators.SpringDataJpaMongoDb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alienators.SpringDataJpaMongoDb.dao.Customer;
import com.alienators.SpringDataJpaMongoDb.dao.ICustomerRepo;
import com.alienators.SpringDataJpaMongoDb.dto.CustomerDto;

@Service
public class CustomerServiceImpl implements ICustomerService 
{
    @Autowired
    private ICustomerRepo repo;

    @Override
    public String registerCustomerInfo(CustomerDto dto) 
    {
        System.out.println("Implementing class for MongoRepo at runtime : "+repo.getClass().getName());
       
        Customer cx = new Customer();
        BeanUtils.copyProperties(dto,cx);
        Customer c = repo.save(cx);

        return "Customer Doc registered in Mongo DB with Id "+c.getCxNo();
    }

    @Override
    public List<Customer> fetchAllCx() 
    {
        return repo.findAll();
    }

    @Override
    public String deleteDocument(String id) 
    {
        Optional<Customer> optional =repo.findById(id);
        if(optional.isPresent())
        {
            repo.deleteById(id);
            return "Document is deleted with id : "+id;
        }
        return "Failed to delete document";
    }

}
