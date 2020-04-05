package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

import com.hotel.model.Customer;
import com.hotel.model.Register;
import com.hotel.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository rep;
	
	public List<Register> listAll(){
		return rep.findAll();
	}
	
	public void insert(Register register) {
		rep.save(register);
	}
	
	public Register GET(Long id) {
		return rep.findById(id).get();
	}
	
	public void delete(Long id) {
		rep.deleteById(id);
	}

}
