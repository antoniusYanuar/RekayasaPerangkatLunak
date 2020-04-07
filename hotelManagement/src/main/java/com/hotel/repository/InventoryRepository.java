package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}

