package com.example.hotel.service;

import java.util.Collection;

import com.example.hotel.model.Customer;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    Collection<Customer> findAll();

    Customer findById(Long id);

    Customer save(Customer customer);

    Customer update(Customer customer);

    Customer deleteById(Long id);

}