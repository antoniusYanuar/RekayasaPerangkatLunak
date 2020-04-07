package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hotel.model.Inventory;
import com.hotel.repository.InventoryRepository;

public class InventoryService {
	@Autowired
	private InventoryRepository repo;
	
	public List<Inventory> listAll(){
		return repo.findAll();
	}
	
	public void saveCustomer(Inventory inventory) {
		repo.save(inventory);
	}
	
	public Inventory GET(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
