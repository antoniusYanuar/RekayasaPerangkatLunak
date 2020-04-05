package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.hotel.model.Customer;
import com.hotel.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll(){
		return repo.findAll();
	}
	
	public void saveCustomer(Customer customer) {
		repo.save(customer);
	}
	
	public Customer GET(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
