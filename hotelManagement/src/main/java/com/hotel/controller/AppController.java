package com.hotel.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.model.Customer;
import com.hotel.model.Register;
import com.hotel.service.CustomerService;
import com.hotel.service.RegisterService;

@Controller
public class AppController {
	@Autowired
	private CustomerService service;
	@Autowired
	private RegisterService register_service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Customer> listCustomer = service.listAll();
		model.addAttribute("listCustomer", listCustomer);
		
		return "index";
	}
	
	@RequestMapping("/register")
	public String viewHomeRegister(Model model) {
		List<Register> listRegister = register_service.listAll();
		model.addAttribute("listRegister", listRegister);
		
		return "register";
	}
	
	
	@RequestMapping("/new")
	public String addNewCustomerPage(Model model) {
	    Customer customer = new Customer();
	    model.addAttribute("customer", customer);
	     
	    return "new_customer";
	}
	
	@RequestMapping("/newregister")
	public String addNewRegisterPage(Model model) {
	    Register register = new Register();
	    model.addAttribute("register", register);
	     
	    return "new_register";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("customer") Customer customer) {
	    service.saveCustomer(customer);
	     
	    return "redirect:/";
	}
	@RequestMapping(value = "/insertregister", method = RequestMethod.POST)
	public String saveRegister(@ModelAttribute("register") Register register) {
		register_service.insert(register);
	     
	    return "redirect:/register";
	}
}
