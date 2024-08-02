package com.code2learn.BatchProcessingApp.config;

import org.springframework.batch.item.ItemProcessor;

import com.code2learn.BatchProcessingApp.dao.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer>
{

    @Override
    public Customer process(Customer item) throws Exception 
    {
        //logic to process data or filter or perform operation
        return item;
    }


}
