package com.example.hotel.controller.implementation;

import java.util.Collection;

import com.example.hotel.controller.Controller;
import com.example.hotel.model.Customer;
import com.example.hotel.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController implements Controller<Customer> {

    @Autowired
    private CustomerService customerService;

    @Override
    public ResponseEntity<Collection<Customer>> findAll() {
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Customer> findById(Long id) {
        return new ResponseEntity<>(customerService.findById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Customer> save(Customer customer) {
        return new ResponseEntity<>(customerService.save(customer), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Customer> update(Customer customer) {
        return new ResponseEntity<>(customerService.update(customer), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Customer> deleteById(Long id) {
        return new ResponseEntity<>(customerService.deleteById(id), HttpStatus.OK);
    };

}