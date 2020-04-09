package com.example.hotel.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.hotel.model.Customer;
import com.example.hotel.service.CustomerService;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private Long custId = 100L;
    private Map<Long, Customer> custMap = new HashMap<Long, Customer>();

    {
        Customer customer = new Customer();
        customer.setId(custId);
        customer.setNama("nama");
        customer.setKtp("081238129301");
        customer.setTelpon("087123321333");
        customer.setEmail("email@gmail.com");
        custMap.put(customer.getId(), customer);
    }

    @Override
    public Collection<Customer> findAll() {
        return custMap.values();
    }

    @Override
    public Customer findById(Long id) {
        return custMap.get(id);
    }

    @Override
    public Customer save(Customer customer) {
        Long newCustId = ++custId;
        customer.setId(newCustId);
        custMap.put(customer.getId(), customer);
        return custMap.get(newCustId);
    }

    @Override
    public Customer update(Customer customer) {
        custId = customer.getId();
        if (custMap.get(custId) != null) {
            custMap.put(custId, customer);
            return custMap.get(custId);
        }
        return null;
    }

    @Override
    public Customer deleteById(Long id) {
        if (custMap.get(id) != null) {
            return custMap.remove(id);
        }
        return null;
    }

}