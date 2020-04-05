package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.model.Register;

public interface RegisterRepository extends JpaRepository<Register, Long>{

}
